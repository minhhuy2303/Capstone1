package com.example.demo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {
@GetMapping("/api")
public ResponseEntity<String> getData() {
    RestTemplate restTemplate = new RestTemplate();
    String apiUrl = "https://vi.wikipedia.org/w/api.php?action=parse&page=Hôn_mê&prop=text&formatversion=2&format=json";
    ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

//    if(response.getStatusCode().is2xxSuccessful()){
//        try {
//            ObjectMapper objectMapper  = new ObjectMapper();
//            JsonNode jsonNode = objectMapper.readTree(response.getBody());
//            // Trích xuất phần text từ JSON
//            String text = jsonNode
//                    .path("parse")
//                    .path("text")
//                    .asText();
//
//            // In phần text ra màn hình
//            System.out.println(text);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    } else {
//        System.err.println("Lỗi khi gọi API.");
//
//    }

//     Trích xuất nội dung HTML từ trang web
    String htmlContent = response.getBody();

    // Sử dụng Jsoup để phân tích cú pháp HTML
    Document doc = Jsoup.parse(htmlContent);

//     Trích xuất ảnh từ trang web
    Element imageElement = doc.select("img").first();
    String imageUrl = imageElement.attr("src");


    // Trích xuất các phần văn bản từ phần tử có class "mw-parser-output"
//    Elements contentElement = doc.select(".mw-parser-output");
    String paragraphs = doc.select("p").text();
//    String pa = paragraphs.toString();
//    return  ResponseEntity.ok(paragraphs);



    // Trích xuất các đoạn văn bản từ các phần khác nhau của trang

    Elements sectionElements = doc.select("h2,h3"); // Các tiêu đề của các phần

    StringBuilder result = new StringBuilder();

    for (Element section : sectionElements) {
        // Lấy giá trị trong thuộc tính id của thẻ <h2>
        String sectionId = section.select("h2").attr("id");

        // Trích xuất đoạn văn bản bên dưới mỗi tiêu đề
        Element next = section.nextElementSibling();
        while (next != null && !next.tagName().matches("h2|h3")) {
            result.append(next.text()).append("\n");
            next = next.nextElementSibling();
        }

        // In id và đoạn văn bản
        result.append("Section ID: ").append(sectionId).append("\n");
    }

    // Kết quả chứa id và các đoạn văn bản từ các phần khác nhau của trang Wikipedia "Ung thư."
    String resultText = result.toString();

    return ResponseEntity.ok(resultText);

  //  return  response;
}
}

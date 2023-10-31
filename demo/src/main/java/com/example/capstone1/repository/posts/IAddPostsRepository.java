package com.example.capstone1.repository.posts;

import com.example.capstone1.model.Posts;
import com.example.capstone1.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Transactional
public interface IAddPostsRepository extends JpaRepository<Posts,Integer> {

    @Query(value="select * from posts where id_topic = :id",nativeQuery = true)
    List<Posts> getAllPost(@Param("id")Integer id);

    @Query(value="select * from posts where id = :id",nativeQuery = true)
    Posts getPostById(@Param("id")Integer id);

    @Modifying
    @Query(value="UPDATE posts SET name = :name,description=:description,image=:image,title1= :title1,description_title1=:descriptionTitle1,image1=:image1" +
            ",title2 =:title2 ,description_title2=:descriptionTitle2,image2=:image2,title3=:title3,description_title3=:descriptionTitle3," +
            " image3=:image3, title4=:title4,description_title4=:descriptionTitle4,image4 =:image4,title5=:title5,description_title5=:descriptionTitle5" +
            ",image5=:image5,title6=:title6,description_title6 = :descriptionTitle6,image6=:image6,id_topic =:topic  where id =:id",nativeQuery = true)
    void updatePost(Integer id, String name, String description, String image, String title1, String descriptionTitle1
    , String image1, String title2, String descriptionTitle2, String image2, String title3, String descriptionTitle3,
                     String image3, String title4, String descriptionTitle4, String image4, String title5,
                     String descriptionTitle5, String image5, String title6, String descriptionTitle6, String image6, Integer topic );
}

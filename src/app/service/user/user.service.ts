import { Observable } from 'rxjs';
import { HttpClient,HttpHeaders  } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
PATH_OF_API ="http://localhost:8080";
   requestHeader = new HttpHeaders(
    {
      "No-Auth":"True"
    }
   );
  constructor(private httpClient:HttpClient)
  { }
   login(loginData:any):Observable<any>{
    return this.httpClient.post(this.PATH_OF_API+"/authenticate",loginData,{headers:this.requestHeader})
  }
}

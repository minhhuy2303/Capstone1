import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  PATH_OF_API = 'http://localhost:8080';
  requestHeader = new HttpHeaders({
    'No-Auth': 'True',
  });

  constructor(private httpClient: HttpClient) {}

  register(loginData: any): Observable<any> {
    return this.httpClient.post(
      this.PATH_OF_API + '/registerNewUser',
      loginData,
      { headers: this.requestHeader }
    );
  }
  login(loginData: any): Observable<any> {
    return this.httpClient.post(this.PATH_OF_API + '/authenticate', loginData, {
      headers: this.requestHeader,
    });
  }
}

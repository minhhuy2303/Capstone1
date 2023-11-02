import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  checkLogin: Boolean = false;

  ngOnInit(): void {
    var login = localStorage.getItem('login');
    console.log(login);
    if (login) {
      this.checkLogin = true;
    } else {
      this.checkLogin = false;
    }
  }
}

import { Component } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  isProfileMenuOpen = false;
  toggleProfileMenu(){
    this.isProfileMenuOpen = !this.isProfileMenuOpen;
  }
}

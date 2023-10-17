import { Component } from '@angular/core';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  
  styleUrls: ['./admin-dashboard.component.css'],
})
export class AdminDashboardComponent {
  showModal = false;
  toggleModal() {
    this.showModal = !this.showModal;
  }
  showModalDelete = false;
  openModalDelete(){
    this.showModalDelete = !this.showModalDelete;
  }
  closeModalDelete(){
    this.showModalDelete = false;
  }
}

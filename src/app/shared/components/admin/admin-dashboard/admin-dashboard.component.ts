import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  
  styleUrls: ['./admin-dashboard.component.css'],
})
export class AdminDashboardComponent {
  @Input() dashboard:string ='';
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
  clickedOutside():void{
    this.showModalDelete = false;
    this.showModal = false;
  }
}

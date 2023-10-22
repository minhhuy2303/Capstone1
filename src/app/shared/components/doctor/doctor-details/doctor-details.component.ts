import { Component, ElementRef } from '@angular/core';



@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css'],
  
})
export class DoctorDetailsComponent {
  minDate = new Date(2000, 0, 1);
  maxDate = new Date(2020, 0, 1);
  isSelected :Boolean = false;
  activeButton(){
    var mytag = document.getElementsByClassName('haha')[0];
    if(mytag){
      this.isSelected = true;
    }else{
      this.isSelected=false;
    }
  }
  constructor(private el: ElementRef){

  }
}


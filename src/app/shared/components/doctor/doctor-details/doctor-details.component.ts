import { Component } from '@angular/core';



@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css'],
  
})
export class DoctorDetailsComponent {
  minDate = new Date(2000, 0, 1);
  maxDate = new Date(2020, 0, 1);
}


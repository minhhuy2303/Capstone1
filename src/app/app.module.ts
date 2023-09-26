import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ComponentsComponent } from './shared/components/components.component';
import { HeaderComponent } from './shared/common/header/header.component';
import { FooterComponent } from './shared/common/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { PatientComponent } from './shared/components/patient/patient.component';
import { DatLichComponent } from './shared/components/dat-lich/dat-lich.component';

import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { HomePatientComponent } from './shared/components/patient/home-patient/home-patient.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';
import {MatIconModule} from '@angular/material/icon';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatNativeDateModule} from '@angular/material/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RecordProfileComponent } from './shared/components/patient/patient-record/record-profile/record-profile.component';
import { RecordHealthComponent } from './shared/components/patient/patient-record/record-health/record-health.component';
import { RecordSavedComponent } from './shared/components/patient/patient-record/record-saved/record-saved.component';
import { RecordBookingHistoryComponent } from './shared/components/patient/patient-record/record-booking-history/record-booking-history.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    ComponentsComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    DatLichComponent,
    DoctorDetailsComponent,
    HomePatientComponent,
    PatientRecordComponent,
    RecordProfileComponent,
    RecordHealthComponent,
    RecordSavedComponent,
    RecordBookingHistoryComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatIconModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

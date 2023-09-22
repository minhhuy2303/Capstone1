import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ComponentsComponent } from './shared/components/components.component';
import { HeaderComponent } from './shared/common/header/header.component';
import { FooterComponent } from './shared/common/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { PatientComponent } from './shared/components/patient/patient.component';
import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { HomePatientComponent } from './shared/components/patient/home-patient/home-patient.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';


@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    ComponentsComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    DoctorDetailsComponent,
    HomePatientComponent,
    PatientRecordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

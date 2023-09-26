import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './shared/components/login/login.component';
import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';
import { RecordProfileComponent } from './shared/components/patient/patient-record/record-profile/record-profile.component';
import { RecordHealthComponent } from './shared/components/patient/patient-record/record-health/record-health.component';
import { RecordBookingHistoryComponent } from './shared/components/patient/patient-record/record-booking-history/record-booking-history.component';
import { RecordSavedComponent } from './shared/components/patient/patient-record/record-saved/record-saved.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:"home"},
  {path:"home", component:HomeComponent},
  {path:"login", component:LoginComponent},
  {path:"info", component:DoctorDetailsComponent},
  {path:"user", component:PatientRecordComponent, children : [
    {path:"profile", component:RecordProfileComponent},
    {path:"health", component:RecordHealthComponent},
    {path:"booking", component:RecordBookingHistoryComponent},
    {path:"saved", component:RecordSavedComponent},

  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

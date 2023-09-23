import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './shared/components/login/login.component';
import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:"home"},
  {path:"home", component:HomeComponent},
  {path:"login", component:LoginComponent},
  {path:"info", component:DoctorDetailsComponent},
  {path:"profile", component:PatientRecordComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

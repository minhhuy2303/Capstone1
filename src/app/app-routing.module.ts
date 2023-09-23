import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './shared/components/login/login.component';
import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:"home"},
  {path:"home", component:HomeComponent},
  {path:"login", component:LoginComponent},
  {path:"info", component:DoctorDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

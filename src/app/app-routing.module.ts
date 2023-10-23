import { NgModule } from '@angular/core';
import {
  RouterModule,
  Routes,
  provideRouter,
  withComponentInputBinding,
} from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './shared/components/login/login.component';
import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';
import { RecordProfileComponent } from './shared/components/patient/patient-record/record-profile/record-profile.component';
import { RecordHealthComponent } from './shared/components/patient/patient-record/record-health/record-health.component';
import { RecordBookingHistoryComponent } from './shared/components/patient/patient-record/record-booking-history/record-booking-history.component';
import { RecordSavedComponent } from './shared/components/patient/patient-record/record-saved/record-saved.component';
import { CategoriesListComponent } from './shared/components/categories-list/categories-list.component';
import { DatLichComponent } from './shared/components/dat-lich/dat-lich.component';
import { DoctorHomeComponent } from './shared/components/doctor/doctor-home/doctor-home.component';
import { AdminComponent } from './shared/components/admin/admin.component';
import { AdminDashboardComponent } from './shared/components/admin/admin-dashboard/admin-dashboard.component';
import { AdminPostComponent } from './shared/components/admin/admin-post/admin-post.component';
import { AdminCreatePostComponent } from './shared/components/admin/admin-post/admin-create-post/admin-create-post.component';
import { RegisterComponent } from './shared/components/register/register.component';
import { CategoriesContentComponent } from './shared/components/categories-list/categories-content/categories-content.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home' },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'info', component: DoctorDetailsComponent },
  {
    path: 'user',
    component: PatientRecordComponent,
    children: [
      { path: 'profile', component: RecordProfileComponent },
      { path: 'health', component: RecordHealthComponent },
      { path: 'booking', component: RecordBookingHistoryComponent },
      { path: 'saved', component: RecordSavedComponent },
    ],
  },
  {
    path: 'categories',
    component: CategoriesListComponent,
  },
  { path: 'categories/:id', component: CategoriesContentComponent },
  { path: 'listDoctor', component: DatLichComponent },
  { path: 'bacsi', component: DoctorDetailsComponent },
  { path: 'homebs', component: DoctorHomeComponent },
  {
    path: 'admin',
    component: AdminComponent,
    children: [
      { path: 'dashboard', component: AdminDashboardComponent },
      { path: 'post', component: AdminPostComponent },
      { path: 'create-post', component: AdminCreatePostComponent },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: [provideRouter(routes, withComponentInputBinding())],
})
export class AppRoutingModule {}

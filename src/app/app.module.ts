import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetApiWikipediaService } from './service/wikipedia/get-api-wikipedia.service';
import { ComponentsComponent } from './shared/components/components.component';
import { HeaderComponent } from './shared/common/header/header.component';
import { FooterComponent } from './shared/common/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { PatientComponent } from './shared/components/patient/patient.component';
<<<<<<< HEAD
import { DatLichComponent } from './shared/components/dat-lich/dat-lich.component';
=======
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {environment} from "../environments/environment";
import {AngularFireModule} from "@angular/fire/compat";
import {AngularFireStorageModule} from "@angular/fire/compat/storage";
import { ForbiddenComponent } from './shared/components/forbidden/forbidden.component';
import { LoginComponent } from './shared/components/login/login.component';
import { RouterModule } from '@angular/router';
import { AuthGuard } from './auth/auth.guard';
import { AuthInterceptor } from './auth/auth.interceptor';
import { UserService } from './service/user/user.service';

>>>>>>> 2c7780f5a10092abf20e23f2b30c16f925927c51

import { DoctorDetailsComponent } from './shared/components/doctor/doctor-details/doctor-details.component';
import { HomePatientComponent } from './shared/components/patient/home-patient/home-patient.component';
import { PatientRecordComponent } from './shared/components/patient/patient-record/patient-record.component';
import { MatIconModule } from '@angular/material/icon';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatNativeDateModule } from '@angular/material/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RecordProfileComponent } from './shared/components/patient/patient-record/record-profile/record-profile.component';
import { RecordHealthComponent } from './shared/components/patient/patient-record/record-health/record-health.component';
import { RecordSavedComponent } from './shared/components/patient/patient-record/record-saved/record-saved.component';
import { RecordBookingHistoryComponent } from './shared/components/patient/patient-record/record-booking-history/record-booking-history.component';
import { CategoriesListComponent } from './shared/components/categories-list/categories-list.component';
import { DoctorHomeComponent } from './shared/components/doctor/doctor-home/doctor-home.component';
import {
  RouterModule,
  provideRouter,
  withComponentInputBinding,
} from '@angular/router';
import { AdminComponent } from './shared/components/admin/admin.component';
import { AdminDashboardComponent } from './shared/components/admin/admin-dashboard/admin-dashboard.component';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';
import { AdminCreatePostComponent } from './shared/components/admin/admin-post/admin-create-post/admin-create-post.component';
import { AdminManagePostComponent } from './shared/components/admin/admin-post/admin-manage-post/admin-manage-post.component';
import { AdminPostComponent } from './shared/components/admin/admin-post/admin-post.component';
import { RegisterComponent } from './shared/components/register/register.component';
import { LoginComponent } from './shared/components/login/login.component';
import { ClickOutsideDirective } from './clickOutside.directive';
import { ToastrModule } from 'ngx-toastr';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ErrorComponent } from './shared/common/error/error.component';
import { CategoriesContentComponent } from './shared/components/categories-list/categories-content/categories-content.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    ComponentsComponent,
    HeaderComponent,
    FooterComponent,
<<<<<<< HEAD
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    DatLichComponent,
    DoctorDetailsComponent,
    HomePatientComponent,
    PatientRecordComponent,
    RecordProfileComponent,
    RecordHealthComponent,
    RecordSavedComponent,
    RecordBookingHistoryComponent,
    CategoriesListComponent,
    DoctorHomeComponent,
    AdminComponent,
    AdminPostComponent,
    AdminDashboardComponent,
    AdminCreatePostComponent,
    AdminManagePostComponent,
    RegisterComponent,
    ClickOutsideDirective,
    ErrorComponent,
    CategoriesContentComponent,
=======
    HomeComponent,
    ForbiddenComponent,
    LoginComponent
>>>>>>> 2c7780f5a10092abf20e23f2b30c16f925927c51
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatIconModule,
    BrowserAnimationsModule,
    RouterModule,
    ToastrModule.forRoot(),
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
=======
    HttpClientModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    AngularFireStorageModule,
    ReactiveFormsModule,
    RouterModule
  ],
  providers: [GetApiWikipediaService, AuthGuard,{
    provide:HTTP_INTERCEPTORS,
    useClass:AuthInterceptor,
    multi:true
  },
  UserService
],
  bootstrap: [AppComponent]
>>>>>>> 2c7780f5a10092abf20e23f2b30c16f925927c51
})
export class AppModule {}

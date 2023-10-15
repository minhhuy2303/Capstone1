import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { RouterOutlet } from '@angular/router';
import { AdminPostComponent } from './admin-post/admin-post.component';



@NgModule({
  declarations: [    
    AdminDashboardComponent,
    
  ],
  imports: [
    CommonModule,
    RouterOutlet
  ]
})
export class AdminModule { }

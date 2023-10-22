import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PotsRoutingModule } from './pots-routing.module';
import { PotsComponent } from './pots/pots.component';
import { FormsModule } from '@angular/forms';
import {ReactiveFormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    PotsComponent
  ],
  imports: [
    CommonModule,
    PotsRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class PotsModule { }

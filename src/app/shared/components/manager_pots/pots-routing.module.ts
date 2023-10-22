import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PotsComponent } from './pots/pots.component';

const routes: Routes = [{
  path:'add_pots',component : PotsComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PotsRoutingModule { }

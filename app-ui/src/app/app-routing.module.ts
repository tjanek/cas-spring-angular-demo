import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PublicComponent} from "./public/public.component";

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'public'},
  { path: 'public', component: PublicComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

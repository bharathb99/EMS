import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CustomerBookingsComponent } from './customer-bookings/customer-bookings.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'home', component:HomeComponent},
  {path: 'customer-list', component:CustomerListComponent},
  {path: 'app-root', component:AppComponent},
  {path: 'sign-up', component:SignUpComponent}, 
  {path: 'login', component:LoginComponent},
  {path: 'customer-bookings/:cid', component:CustomerBookingsComponent}
    
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

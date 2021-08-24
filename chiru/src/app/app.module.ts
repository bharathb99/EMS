import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { HomeComponent } from './home/home.component';
import { CustomerserviceService } from './customerservice.service';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from './footer/footer.component';
import { PackagebookingserviceService } from './packagebookingservice.service';
import { CustomerBookingsComponent } from './customer-bookings/customer-bookings.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    SignUpComponent,
    CustomerListComponent,
    HomeComponent,
    FooterComponent,
    CustomerBookingsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CustomerserviceService,PackagebookingserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

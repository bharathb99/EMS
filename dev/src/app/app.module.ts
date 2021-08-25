import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomercreateComponent } from './customercreate/customercreate.component';
import { CustomereditComponent } from './customeredit/customeredit.component';
import { CustomerdeleteComponent } from './customerdelete/customerdelete.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { CustomerserviceService } from './customerservice.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { PackageCreateComponent } from './package-create/package-create.component';
import { PackageupdateComponent } from './packageupdate/packageupdate.component';
import { PackagedeleteComponent } from './packagedelete/packagedelete.component';
import { PackagelistComponent } from './packagelist/packagelist.component';
import { PackagebookingcreateComponent } from './packagebookingcreate/packagebookingcreate.component';
import { CuslistComponent } from './cuslist/cuslist.component';
import { PacklistComponent } from './packlist/packlist.component';
import { PackagebookinglistComponent } from './packagebookinglist/packagebookinglist.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { BookpackageComponent } from './bookpackage/bookpackage.component';
import { HomeComponent } from './home/home.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { CuscreateComponent } from './cuscreate/cuscreate.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomercreateComponent,
    CustomereditComponent,
    CustomerdeleteComponent,
    CustomerlistComponent,
    CustomerloginComponent,
    AdminloginComponent,
    PackageCreateComponent,
    PackageupdateComponent,
    PackagedeleteComponent,
    PackagelistComponent,
    PackagebookingcreateComponent,
    CuslistComponent,
    PacklistComponent,
    PackagebookinglistComponent,
    HeaderComponent,
    FooterComponent,
    BookpackageComponent,
    HomeComponent,
    AdminhomeComponent,
    CuscreateComponent
  ],
  imports: [
    BrowserModule, AppRoutingModule, HttpClientModule, FormsModule, ReactiveFormsModule
  ],
  providers: [CustomerserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

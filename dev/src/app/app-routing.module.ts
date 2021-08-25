import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BookpackageComponent } from './bookpackage/bookpackage.component';
import { CuslistComponent } from './cuslist/cuslist.component';
import { CustomercreateComponent } from './customercreate/customercreate.component';
import { CustomereditComponent } from './customeredit/customeredit.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { PackageCreateComponent } from './package-create/package-create.component';
import { PackagebookingcreateComponent } from './packagebookingcreate/packagebookingcreate.component';
import { PackagebookinglistComponent } from './packagebookinglist/packagebookinglist.component';
import { PackagelistComponent } from './packagelist/packagelist.component';
import { PackageupdateComponent } from './packageupdate/packageupdate.component';
import { PacklistComponent } from './packlist/packlist.component';

const routes: Routes = [
  { path: 'bookpackage', component: BookpackageComponent },
  { path: 'footer', component: FooterComponent },
  { path: 'home', component: HomeComponent },
  { path: 'adminhome', component: AdminhomeComponent },
  { path: 'header', component: HeaderComponent },
  { path: 'package-create', component: PackageCreateComponent },
  { path: 'packagelist/:customerID', component: PackagelistComponent },
  { path: 'packagelist', component: PackagelistComponent },
  { path: 'packagebookinglist', component: PackagebookinglistComponent },
  { path: 'packlist/:customerID', component: PacklistComponent },
  { path: 'packlist', component: PacklistComponent },
  { path: 'customerlogin', component: CustomerloginComponent },
  { path: 'packagebookingcreate/:customerID/:packageID', component: PackagebookingcreateComponent },
  { path: 'packagebookingcreate', component: PackagebookingcreateComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'cuslist', component: CuslistComponent },
  { path: 'customerlist', component: CustomerlistComponent },
  { path: 'customercreate', component: CustomercreateComponent },
  { path: 'customeredit/:customerID', component: CustomereditComponent },
  { path: 'packageupdate/:packageID', component: PackageupdateComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

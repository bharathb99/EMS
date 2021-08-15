import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { RegisterpageComponent } from './registerpage/registerpage.component';

const routes: Routes = [
  { path: 'registerpage', component: RegisterpageComponent },
  { path: 'homepage', component: HomepageComponent },
  { path: 'loginpage', component: LoginpageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }

export const routingComponents = [RegisterpageComponent,HomepageComponent,LoginpageComponent]


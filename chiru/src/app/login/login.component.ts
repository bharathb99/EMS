import { Component, OnInit } from '@angular/core';
import { EmailValidator } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';
import { Customer } from '../Customer';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email : any ='';
  password : any = '';
  login: boolean = true;
  
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService
  ) { }

  ngOnInit(): void {
  }

  close()
  {
    this.login = !this.login;
    this.router.navigateByUrl('/home');
  }
}

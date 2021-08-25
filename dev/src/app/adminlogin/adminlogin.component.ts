import { Component, Input, OnInit } from '@angular/core';
import { EmailValidator } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  @Input()
  adminDetails = {  email: '', password: '' };
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService
  ) { }

  ngOnInit(): void {
  }
  loginCustomer(){
    if (this.adminDetails.email == "tpbadmin@gmail.com" && this.adminDetails.password == "Admin") {
      this.router.navigate(['/adminhome'])
    }
    else{
      Swal.fire({
        text: 'Please enter the valid admin email or password !',
        icon: 'warning'
      });
    }
  }
}

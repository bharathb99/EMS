import { Component, Input, OnInit } from '@angular/core';
import { EmailValidator } from '@angular/forms';
import { NgForm, NgModel } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit {
  @Input()
  customerDetails = { email: '', password: '' };

  public customer: any = [];
 
  message: any = '';

  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService
  ) { }

  ngOnInit(): void {
  }

  loginCustomer() {
    if (this.customerDetails.email == "") {
      Swal.fire({
        text: 'Please enter the valid email!',
        icon: 'warning'
      });
    }
    else if (this.customerDetails.email == "tpbadmin@gmail.com" && this.customerDetails.password == "Admin") {
      this.router.navigate(['/adminhome'])
    }
    else {
      this.restApi.getCustomer(this.customerDetails.email).subscribe((data: any) => (this.customer = data));
      if (this.customer == null) {
        Swal.fire({
          title: 'You dont have any active account with this email id,Please Register !!!!',
          showCancelButton: true,
          confirmButtonText: `Ok`,
          denyButtonText: `Cancel`,
        }).then((result: any) => {
          if (result.isConfirmed) {
            this.router.navigate(['/customercreate'])
          } else if (result.isDenied) {
            this.router.navigate(['/customerlogin'])
          }
        })
      }
      else if (this.customer.password != this.customerDetails.password) {
        Swal.fire({
          text: 'Please Re-enter your Password!',
          icon: 'warning'
        });
      }
      else {
        this.router.navigate(['/packlist', this.customer.customerID]);
      }
    
    }
  }
}

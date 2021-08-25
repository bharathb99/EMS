import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';
import { Component, Input, OnInit } from '@angular/core';
import { Customer } from '../Customer';
import { FormBuilder, FormControl, FormGroup, NgForm, NgModel, Validators } from '@angular/forms';

@Component({
  selector: 'app-cuscreate',
  templateUrl: './cuscreate.component.html',
  styleUrls: ['./cuscreate.component.css']
})
export class CuscreateComponent implements OnInit {

  form = new FormGroup({
    fname: new FormControl('', [Validators.required, Validators.minLength(3)]),
    email: new FormControl('', [Validators.required, Validators.email]),
    body: new FormControl('', Validators.required)
  });
  customers: any = [];
 

  createForm() {
    this.form = this.fb.group({
       name: ['', Validators.required ]
    });
  }
  
  
  @Input()
  customerDetails:Customer = {customerID:0,customerName:{fname:'',lname:''}, gender: 'F', email: '',password: '',dateOfBirth:0,phone:0,address:{doorno:0,street:'',pincode:0,city:''} };

  constructor(public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService,
    private fb: FormBuilder) {
      this.createForm();
  }

  ngOnInit(): void {}

  addCustomer() {
    this.restApi.createCustomer(this.customerDetails).subscribe((data: {}) => {
      this.router.navigate(['/customerlogin']);
    });
  }
}

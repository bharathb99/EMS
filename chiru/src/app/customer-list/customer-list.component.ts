import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../Booking';
import { Customer } from '../Customer';
import { CustomerserviceService } from '../customerservice.service';
import { PackagebookingserviceService } from '../packagebookingservice.service';

@Component({
  selector: 'customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  bookings: Booking[]=[];

  // columns = ['customerID','fname','lname','gender','password','email','dateOfBirth',
  //   'phone','doorno','street','city','pincode'];
  
  columns = ['customerID','fname','lname','gender','email','dateOfBirth','phone','doorno','street','city','pincode','Edit','Delete','Bookings']  

  // index = ['customerID','fname','lname','gender','password','email','dateOfBirth',
  //   'phone','doorno','street','city','pincode']  

  index = ['customerID','gender','email','dateOfBirth']
    
    
  constructor(
    public custserv: CustomerserviceService,
    public pbookserv: PackagebookingserviceService,
    public router: Router
    ) { }

  ngOnInit(): void {
    this.loadCustomers();
  }

  loadCustomers() {
    let val =this.custserv
      .getCustomers()
      .subscribe((data) => (this.customers = data)); 
      console.log(this.customers);
      return val;
  }

  deleteCustomer(customerID : any){
    let val =this.custserv
      .deleteCustomer(customerID)
      .subscribe((data) => (this.customers = data)); 
      console.log(this.customers);
      return val;
  }

  // getPackBookings(customerID : any){
  //   this.router.navigate(['/customer-bookings',customerID]);
    
  // }

  // editCustomer(customerID : any){
  //   let val =this.custserv
  //     .editCustomer(customerID)
  //     .subscribe((data) => (this.customers = data)); 
  //     console.log(this.customers);
  //     return val;
  // }

}



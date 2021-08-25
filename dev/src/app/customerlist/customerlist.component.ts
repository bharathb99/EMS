import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';

@Component({
  selector: 'customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit {

  customers: any = [];
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService
  ) { }

  ngOnInit(): void {
    this.loadCustomers();
  }

  loadCustomers() {
    return this.restApi
      .getCustomers()
      .subscribe((data) => (this.customers = data));
  }
  
  deleteCustomer(id: any) {
    return this.restApi.deleteCustomer(id).subscribe((data) => {
      this.loadCustomers();
    });
  }
}


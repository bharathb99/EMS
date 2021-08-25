import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';
@Component({
  selector: 'customeredit',
  templateUrl: './customeredit.component.html',
  styleUrls: ['./customeredit.component.css']
})
export class CustomereditComponent implements OnInit {

  customerDetails: any = {};
  
  customerID = this.aroute.snapshot.params['customerID'];
   

  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: CustomerserviceService
  ) { }

  ngOnInit(): void {
    this.restApi
    .getACustomer(this.customerID)
    .subscribe((data) => (this.customerDetails = data));
  }

  updateCustomer() {
    
      this.restApi.updateCustomer(this.customerDetails).subscribe((data: {}) => {
        this.router.navigate(['/customerlist']);
      });
    
  }

}

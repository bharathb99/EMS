import { Component, Input, OnInit } from '@angular/core';
import { Package } from '../Package';
import { ActivatedRoute, Router } from '@angular/router';
import { PackageserviceService } from '../packageservice.service';
import { Customer } from '../Customer';
import { CustomerserviceService } from '../customerservice.service';
import { PackagebookingserviceService } from '../packagebookingservice.service';

@Component({
  selector: 'packagebookingcreate',
  templateUrl: './packagebookingcreate.component.html',
  styleUrls: ['./packagebookingcreate.component.css']
})
export class PackagebookingcreateComponent implements OnInit {
  packagebookingDetails:any={};
  customerDetails: any = {};
  packageDetails: any = {};
  packageID = this.aroute.snapshot.params['packageID'];
  customerID = this.aroute.snapshot.params['customerID'];
  rentaltype:any;
  
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApip: PackageserviceService,
    public restApi: PackagebookingserviceService,
    public restApic: CustomerserviceService
  ) { }

  ngOnInit(): void {
    this.restApip
    .getAPackage(this.packageID)
    .subscribe((data) => (this.packagebookingDetails = data));
    this.restApic
    .getACustomer(this.customerID)
    .subscribe((data) => (this.packagebookingDetails = data));
    
  }
  addPackagebooking() {
    this.restApi.createPackageBooking(this.packagebookingDetails).subscribe((data: {}) => {
      this.router.navigate(['/bookpackage']);
    });
  }
  selectChangeHandler(event:any){
   this.rentaltype=event.target.value;
  }
}

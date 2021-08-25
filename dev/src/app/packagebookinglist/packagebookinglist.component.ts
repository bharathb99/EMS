import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PackagebookingserviceService } from '../packagebookingservice.service';

@Component({
  selector: 'packagebookinglist',
  templateUrl: './packagebookinglist.component.html',
  styleUrls: ['./packagebookinglist.component.css']
})
export class PackagebookinglistComponent implements OnInit {

  packageBookings: any = [];
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: PackagebookingserviceService
  ) { }

  ngOnInit(): void {
    this.loadPackageBookings();
  }

  loadPackageBookings() {
    return this.restApi
      .getPackageBookings()
      .subscribe((data) => (this.packageBookings = data));
  }
  
  deletePackageBooking(id: any) {
    return this.restApi.deletePackageBooking(id).subscribe((data) => {
      this.loadPackageBookings();
    });
  }

}

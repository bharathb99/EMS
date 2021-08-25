import { ActivatedRoute, Router } from '@angular/router';
import { PackageserviceService } from '../packageservice.service';
import { Component, Input, OnInit } from '@angular/core';
import { Package } from '../Package';

@Component({
  selector: 'package-create',
  templateUrl: './package-create.component.html',
  styleUrls: ['./package-create.component.css']
})
export class PackageCreateComponent implements OnInit {

  @Input()
  packageDetails:Package = {packageID:0,packageName:'', costPerDay: 0, hotelName: '',hotelCostPerDay: 0,itenary:'',location:''} ;

  constructor(public restApi: PackageserviceService, public router: Router) {}

  ngOnInit(): void {}

  addPackage() {
    this.restApi.createPackage(this.packageDetails).subscribe((data: {}) => {
      this.router.navigate(['/packagelist']);
    });
  }

}

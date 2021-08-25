import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PackageserviceService } from '../packageservice.service';

@Component({
  selector: 'packageupdate',
  templateUrl: './packageupdate.component.html',
  styleUrls: ['./packageupdate.component.css']
})
export class PackageupdateComponent implements OnInit {


  packageDetails: any = {};
  
  packageID = this.aroute.snapshot.params['packageID'];
   

  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: PackageserviceService
  ) { }

  ngOnInit(): void {
    this.restApi
    .getAPackage(this.packageID)
    .subscribe((data) => (this.packageDetails = data));
  }

  updatePackage() {
    
      this.restApi.updatePackage(this.packageDetails).subscribe((data: {}) => {
        this.router.navigate(['/packagelist']);
      });
    
  }

}




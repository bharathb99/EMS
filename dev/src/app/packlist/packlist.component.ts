import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PackageserviceService } from '../packageservice.service';


@Component({
  selector: 'packlist',
  templateUrl: './packlist.component.html',
  styleUrls: ['./packlist.component.css']
})
export class PacklistComponent implements OnInit {

  packages: any = [];
 
  customerID = this.aroute.snapshot.params['customerID'];
  
  packageID=this.packages.packageID;
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: PackageserviceService,
   
  ) { }

  ngOnInit(): void {
    this.loadPackages();
  }

  loadPackages() {
    return this.restApi
      .getPackages()
      .subscribe((data) => (this.packages = data));
  }
  
  
  deletePackage(id: any) {
    return this.restApi.deletePackage(id).subscribe((data) => {
      this.loadPackages();
    });
  }
  bookPackage(){
    this.router.navigate(['/packagebookingcreate', {customerID:this.customerID,packageID:this.packages.packageID}]);
    
  }
}

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PackageserviceService } from '../packageservice.service';

@Component({
  selector: 'packagelist',
  templateUrl: './packagelist.component.html',
  styleUrls: ['./packagelist.component.css']
})
export class PackagelistComponent implements OnInit {

  
  packages: any = [];
  constructor(
    public router: Router,
    public aroute: ActivatedRoute,
    public restApi: PackageserviceService
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
}

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerserviceService } from '../customerservice.service';

@Component({
  selector: 'header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
  template: 'The href is: {{href}}'
})
export class HeaderComponent implements OnInit {

 
  public href: string = "";

  public user: any;
  public admin = false;
  public customerID: any = this.aroute.snapshot.params['customerID'];

  constructor(public restApi: CustomerserviceService,
    public aroute: ActivatedRoute,
    public router: Router) { }

  ngOnInit(): void {
    this.href = this.router.url;
    if (this.customerID) {
      this.user = true;
    }
    else if (this.href == '/admin') {
      this.admin = true;
    }
    else {
      this.user = false;
    }
  }

  logout() {
    this.user = false;
    this.admin = false;
  }

}

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { PackageBooking } from './PackageBooking';

@Injectable({
  providedIn: 'root'
})
export class PackagebookingserviceService {
  private resturl: string = 'http://localhost:8080/tourpackspring/packageBooking';
  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };
  getPackageBookings(): Observable<PackageBooking[]> {
    return this.http
      .get<PackageBooking[]>(this.resturl + '/allPackBooking')
      .pipe(retry(1), catchError(this.handleError));
  }

  getAPackageBooking(packageBookID: any): Observable<PackageBooking> {
    return this.http
      .get<PackageBooking>(this.resturl + '/getPackBooking/' + packageBookID)
      .pipe(retry(1), catchError(this.handleError));
  }
  
  updatePackageBooking(packBooking: any): Observable<PackageBooking> {
    return this.http
      .put<PackageBooking>(
        this.resturl + '/updatePackBooking',
        JSON.stringify(packBooking),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
  deletePackageBooking(packageBookingID: any): Observable<PackageBooking> {
    return this.http
      .delete<PackageBooking>(this.resturl + '/deletePackBooking/' + packageBookingID, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }

  createPackageBooking(packBooking: any): Observable<PackageBooking> {
    return this.http
      .post<PackageBooking>(
        this.resturl + '/createPackBooking',
        JSON.stringify(packBooking),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }

  handleError(err:any) {
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = err.error.message;
    } else {
      errorMessage = `Error code : ${err.status} \n Error Message : ${err.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }
}

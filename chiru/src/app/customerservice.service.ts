import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Customer } from './Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerserviceService {
  
  
  private resturl: string = 'http://localhost:8080/tourpackspring/customer';
  constructor(public http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    })
  }

  deleteCustomer(customerID:any): Observable<Customer[]> {
    return this.http
      .delete<Customer[]>(
        this.resturl + '/deleteCus/'+customerID,
        this.httpOptions
        )
      .pipe(retry(1), catchError(this.handleError));
  }

  getCustomers(): Observable<Customer[]> {
    return this.http
      .get<Customer[]>(this.resturl + '/allCus')
      .pipe(retry(1), catchError(this.handleError));
  }

  editCustomer(customerID:any): Observable<Customer[]> {
    return this.http
      .put<Customer[]>(
        this.resturl + '/updateCus/'+customerID,
        this.httpOptions
        )
      .pipe(retry(1), catchError(this.handleError));
  }

  handleError(err:any){
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = err.error.message;
    }
    else{
      errorMessage = `Error code: ${err.status} \n Error Message : ${err.message}`
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }


}

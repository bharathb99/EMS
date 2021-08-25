import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Package } from './Package';

@Injectable({
  providedIn: 'root'
})
export class PackageserviceService {
  private resturl: string = 'http://localhost:8080/tourpackspring/package';
  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };
  getPackages(): Observable<Package[]> {
    return this.http
      .get<Package[]>(this.resturl + '/allPack')
      .pipe(retry(1), catchError(this.handleError));
  }

  getAPackage(packageID: any): Observable<Package> {
    return this.http
      .get<Package>(this.resturl + '/getPack/' + packageID+'/')
      .pipe(retry(1), catchError(this.handleError));
  }
  
  updatePackage(pack: any): Observable<Package> {
    return this.http
      .put<Package>(
        this.resturl + '/updatePack',
        JSON.stringify(pack),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
  deletePackage(packageID: any): Observable<Package> {
    return this.http
      .delete<Package>(this.resturl + '/deletePack/' + packageID, this.httpOptions)
      .pipe(retry(1), catchError(this.handleError));
  }

  createPackage(pack: any): Observable<Package> {
    return this.http
      .post<Package>(
        this.resturl + '/createPack',
        JSON.stringify(pack),
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

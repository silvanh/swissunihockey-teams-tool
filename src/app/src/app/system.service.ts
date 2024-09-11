import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SystemService {

  constructor(private httpClient: HttpClient) { }

  public getApplicationProperty(): Observable<{ key: string, value: string }> {
    return this.httpClient.get<{ key: string, value: string }>("/api/system/version");
  }
}

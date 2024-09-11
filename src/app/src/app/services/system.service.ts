import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApplicationPropertyDTO } from '../dataModels/application-property.dto';

@Injectable({
  providedIn: 'root'
})
export class SystemService {

  constructor(private httpClient: HttpClient) { }

  public getApplicationProperty(key: string): Observable<ApplicationPropertyDTO> {
    return this.httpClient.get<ApplicationPropertyDTO>(`/api/system/applicationProperty/${encodeURIComponent(key)}`);
  }
}

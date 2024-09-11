import { Component } from '@angular/core';
import { Observable, map } from 'rxjs';
import { SystemService } from '../services/system.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-version',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './version.component.html',
  styleUrl: './version.component.less'
})
export class VersionComponent {
  public version$!: Observable<string>;

  constructor(private systemService: SystemService) { }

  ngOnInit(): void {
    this.version$ = this.systemService.getApplicationProperty('version').pipe(map(applicationProperty => applicationProperty.value));
  }
}

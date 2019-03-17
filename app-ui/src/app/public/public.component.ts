import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-public',
  templateUrl: './public.component.html',
  styleUrls: ['./public.component.scss']
})
export class PublicComponent implements OnInit {

  name: string = 'User';

  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit() {
  }

  greeting() {
    this.http.get('/api/greeting')
      .subscribe((value: any) => this.name = value.greeting);
  }

  greetingAdmin() {
    this.http.get('/api/greeting/admin')
      .subscribe((value: any) => this.name = value.greeting);
  }

  logout() {
    this.http.post('/api/logout', {})
      .subscribe(() => window.location.href = '/logout');
  }

}

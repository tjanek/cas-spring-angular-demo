import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {PublicComponent} from './public/public.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {AjaxRequestInterceptor} from "./shared/interceptor/ajax.request.interceptor";

@NgModule({
  declarations: [
    AppComponent,
    PublicComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [{
    provide: HTTP_INTERCEPTORS,
    useClass: AjaxRequestInterceptor,
    multi: true,
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }

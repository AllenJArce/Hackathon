import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { MyEndpointComponentComponent } from './my-endpoint-component/my-endpoint-component.component';


@NgModule({
  declarations: [
    AppComponent,
    MyEndpointComponentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

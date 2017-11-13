import { Injectable } from '@angular/core'

@Injectable

export class Configuraion {
  public Server = 'http://localhost:8888/'
  public ApiUrl = 'getScore/';
  public ServerWithApiUrl = this.Server + this.ApiUrl;
}

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MyEndpointComponentComponent } from './my-endpoint-component.component';

describe('MyEndpointComponentComponent', () => {
  let component: MyEndpointComponentComponent;
  let fixture: ComponentFixture<MyEndpointComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MyEndpointComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MyEndpointComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

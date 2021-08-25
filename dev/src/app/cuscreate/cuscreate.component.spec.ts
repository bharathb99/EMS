import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CuscreateComponent } from './cuscreate.component';

describe('CuscreateComponent', () => {
  let component: CuscreateComponent;
  let fixture: ComponentFixture<CuscreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CuscreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CuscreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

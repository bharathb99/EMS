import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PackagebookingcreateComponent } from './packagebookingcreate.component';

describe('PackagebookingcreateComponent', () => {
  let component: PackagebookingcreateComponent;
  let fixture: ComponentFixture<PackagebookingcreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PackagebookingcreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PackagebookingcreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

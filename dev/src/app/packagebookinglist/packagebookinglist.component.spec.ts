import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PackagebookinglistComponent } from './packagebookinglist.component';

describe('PackagebookinglistComponent', () => {
  let component: PackagebookinglistComponent;
  let fixture: ComponentFixture<PackagebookinglistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PackagebookinglistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PackagebookinglistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

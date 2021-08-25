import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PackagedeleteComponent } from './packagedelete.component';

describe('PackagedeleteComponent', () => {
  let component: PackagedeleteComponent;
  let fixture: ComponentFixture<PackagedeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PackagedeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PackagedeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

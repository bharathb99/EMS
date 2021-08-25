import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PackageupdateComponent } from './packageupdate.component';

describe('PackageupdateComponent', () => {
  let component: PackageupdateComponent;
  let fixture: ComponentFixture<PackageupdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PackageupdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PackageupdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

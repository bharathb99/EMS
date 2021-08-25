import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CuslistComponent } from './cuslist.component';

describe('CuslistComponent', () => {
  let component: CuslistComponent;
  let fixture: ComponentFixture<CuslistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CuslistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CuslistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

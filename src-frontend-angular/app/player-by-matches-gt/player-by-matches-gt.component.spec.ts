import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerByMatchesGtComponent } from './player-by-matches-gt.component';

describe('PlayerByMatchesGtComponent', () => {
  let component: PlayerByMatchesGtComponent;
  let fixture: ComponentFixture<PlayerByMatchesGtComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PlayerByMatchesGtComponent]
    });
    fixture = TestBed.createComponent(PlayerByMatchesGtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

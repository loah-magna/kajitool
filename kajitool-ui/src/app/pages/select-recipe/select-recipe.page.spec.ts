import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { SelectRecipePage } from './select-recipe.page';

describe('SelectRecipePage', () => {
  let component: SelectRecipePage;
  let fixture: ComponentFixture<SelectRecipePage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelectRecipePage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(SelectRecipePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateplayerComponent } from './createplayer/createplayer.component';
import { PlayerByMatchesGtComponent } from './player-by-matches-gt/player-by-matches-gt.component';

const routes: Routes = [
  { path: 'create-player', component: CreateplayerComponent },
  {path:'get-matches',component:PlayerByMatchesGtComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

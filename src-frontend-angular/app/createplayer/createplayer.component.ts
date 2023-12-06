import { Component } from '@angular/core';
import { Player } from '../player.model';
import { PlayerServiceService } from '../player-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-createplayer',
  templateUrl: './createplayer.component.html',
  styleUrls: ['./createplayer.component.css']
})
export class CreateplayerComponent {
  player: Player = new Player();

  constructor(private playerService: PlayerServiceService,private router:Router) {}

  createPlayer(data: Player){
    this.playerService.createPlayer(data)
    .subscribe(
      (response) => {
        console.log('Player created successfully!', response);


      })
  }
}

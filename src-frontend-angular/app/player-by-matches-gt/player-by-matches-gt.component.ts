import { Component } from '@angular/core';
import { PlayerServiceService } from '../player-service.service';
import { Player } from '../player.model';

@Component({
  selector: 'app-player-by-matches-gt',
  templateUrl: './player-by-matches-gt.component.html',
  styleUrls: ['./player-by-matches-gt.component.css']
})
export class PlayerByMatchesGtComponent {

  players: Player[] = [];
  minTotalMatches: number | null = null;

  constructor(private playerService: PlayerServiceService) {}

  playersByTotalMatchesgt() {
    if (this.minTotalMatches !== null) {
      this.playerService.getPlayerByTotalMatches(this.minTotalMatches).subscribe(
        (players: Player[]) => {
          this.players = players;
          console.log('Players with total matches greater than ' + this.minTotalMatches + ': ', players);
        },
        (error) => {
          console.error('Error fetching players:', error);
        }
      );
    }
  }
}

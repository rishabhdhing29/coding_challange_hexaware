import { Injectable } from '@angular/core';
import { Player } from './player.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PlayerServiceService {
  constructor(private http: HttpClient) {}
  apiUrl:string='http://localhost:8181/api/player/';
  

  createPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(this.apiUrl+"add",player);
  }
 
  getPlayerByTotalMatches(minTotalMatches: number): Observable<Player[]> {
    const url = `${this.apiUrl}totalMatchGreaterThan/${minTotalMatches}`;
    return this.http.get<Player[]>(url);
  }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games;

import br.cefetmg.games.movement.Position;
import br.cefetmg.games.pathfinding.TileNode;

/**
 *
 * @author Dota
 */
public class Torre {
    public Position position;

    public Torre() {
    }
    
    public void setTorre(int x,int y){
        //this.position.coords.y = y;
        //this.position.coords.x = x;
        TileNode towerNode = LevelManager.graph.getNodeAtCoordinates(x,y);
        towerNode.setIsObstacle(true);
    }
    
    
}

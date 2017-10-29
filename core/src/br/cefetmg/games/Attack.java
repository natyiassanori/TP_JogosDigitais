/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games;

import br.cefetmg.games.movement.Position;
import br.cefetmg.games.movement.behavior.Algorithm;
import br.cefetmg.games.movement.behavior.Seek;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Dota
 */
public class Attack {
    public int Damage;
    public TowerType towerType;
    public int speed;
    public Position position;
    private final Algorithm seek;
    //public Enemy enemy;
    
    public Attack(int Damage, Tower a, int speed,Position position/*,Enemy enemy*/) {
        this.Damage = Damage * a.towerLevel;
        this.towerType = a.type;
        this.speed = speed;
        this.position = position;
        this.seek = new Seek(speed);
    }
    
    public void moveTowards(/*Enemy enemy */){
        //this.seek.target.coords = enemy.position;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games;

import br.cefetmg.games.movement.Position;
import br.cefetmg.games.pathfinding.TileNode;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author Dota
 */
public class Tower {
    
    public Position position;
    public TowerType type;
    public int towerLevel;
    //public final TextureRegion texture;
    public static Texture texture_teste = new Texture("torre_temporaria.png");

    public Tower() {
        
    }
    
    public void setTorre(int x, int y) {
        this.towerLevel = 1;
        this.type = TowerType.LINE;
        TileNode towerNode = LevelManager.graph.getNodeAtCoordinates(x, y);
        this.position.coords = towerNode.getPosition();
        towerNode.setIsObstacle(true);
    }
    
    public void upgradeTower() {
        this.towerLevel++;
    }

    public void changeTowerType() {//era para ir para o próximo tipo do Enum.
        //type.;
    }

    public Texture getTexture() {
        switch (type) {
            case LINE:
                return texture_teste;
            case DOUBLE_LINE:
                return texture_teste;
            case TRIANGLE:
                return texture_teste;
            case SQUARE:
                return texture_teste;
            case PENTAGON:
                return texture_teste;
            case HEXAGON:
                return texture_teste;
            case HEPTAGON:
                return texture_teste;
            case OCTAGON:
                return texture_teste;
            case STAR:
                return texture_teste;
            case JEW_STAR:
                return texture_teste;
            case HOURGLASS:
                return texture_teste;
            case CIRCLE:
                return texture_teste;
            case OVAL:
                return texture_teste;
            case INFINITE:
                return texture_teste;
        }
        return texture_teste;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.graphics;

import br.cefetmg.games.Tower;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.ArrayList;

/**
 *
 * @author Dota
 */
public class TowerRenderer {
    private SpriteBatch batch;

    public TowerRenderer(SpriteBatch batch) {
        this.batch = batch;
    }
    public void render(Tower tower){
            batch.begin();
            batch.draw( tower.getTexture(), tower.position.coords.x, tower.position.coords.y);
            batch.end();
    }
    
    public void renderAll(ArrayList<Tower> Towers){
        for (Tower Tower : Towers) {
            render(Tower);
        }
    }

}

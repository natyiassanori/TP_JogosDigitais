/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.movement.behavior;

import br.cefetmg.games.movement.Direction;
import br.cefetmg.games.movement.MovementAlgorithm;
import br.cefetmg.games.movement.Pose;

/**
 *
 * @author NataliaNatsumy
 */
public class Follow extends MovementAlgorithm{
    private static final char NOME = 's';

    public Follow(float maxVelocidade) {
        this(NOME, maxVelocidade);
    }

    protected Follow(char nome, float maxVelocidade) {
        super(nome);
        this.maxVelocidade = maxVelocidade;
    }

    @Override
    public Direction guiar(Pose agente) {
        Direction output = new Direction();
        output.velocidade = super.alvo.getObjetivo().sub(agente.posicao);
        output.velocidade.nor();
        output.velocidade.scl(maxVelocidade);
                
        agente.olharNaDirecaoDaVelocidade(output.velocidade);
        output.rotacao=0;
        
        return output;
    }

    public int getTeclaParaAtivacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

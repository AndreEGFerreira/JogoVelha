/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */

import java.util.Random;
import java.lang.Math;

public class Computer extends Player{

    Random rand;

    public Computer(int player){
        super(player);
        this.player = player;
        System.out.println("Player 'Computador Aleatorio' criado");
    }

    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, player);
    }

    /**
     *
     * @param board
     */
    @Override
    public void Try(Board board){
            do{
                attempt[0] = (int) (1 + (Math.random() * (4 - 1)));
                attempt[1] = (int) (1 + (Math.random() * (4 - 1)));
                System.out.printf("Computador tentou: %d %d %n", attempt[0], attempt[1]);
                attempt[0]--;
                attempt[1]--;
            }while( !checkTry(attempt, board) );

        }
}

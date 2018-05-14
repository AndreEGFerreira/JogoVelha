/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
import java.util.Scanner;

public class Human extends Player{
    public Scanner input = new Scanner(System.in);

    public Human(int player){
        super(player);
        this.player = player;
        System.out.println("Player 'Humano' criado");
    }

    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, player);
    }

    @Override
    public void Try(Board board){
        do{
            do{
                System.out.print("Linha: ");
                attempt[0] = input.nextInt();

                if( attempt[0] > 3 ||attempt[0] < 1)
                    System.out.println("Linha invalida. Escolha 1, 2 ou 3");

            }while( attempt[0] > 3 ||attempt[0] < 1);

            do{
                System.out.print("Coluna: ");
                attempt[1] = input.nextInt();

                if(attempt[1] > 3 ||attempt[1] < 1)
                    System.out.println("Coluna invalida. Escolha 1, 2 ou 3");

            }while(attempt[1] > 3 ||attempt[1] < 1);

            attempt[0]--;
            attempt[1]--;

            if(!checkTry(attempt, board))
                System.out.println("Lugar ja marcado, escolha outro lugar.");
        }while( !checkTry(attempt, board) );
    }
}

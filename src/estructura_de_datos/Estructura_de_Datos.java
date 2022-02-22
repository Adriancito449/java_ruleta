/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_de_datos;


import java.util.Scanner;


/**
 *
 * @author yulie
 */
public class Estructura_de_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);/*por poner un juego, necesito sacar 
       el num de jugadores del archivo y tal pero no se como*/

        System.out.println("num jugadores:");
        int x = sc.nextInt();
        Juego a = new Juego(x); //error
        //aqui faltara un while para gestionar que solo quede uno en pie al final de las tondas
        while (!Juego.finRonda()) {//error
            Juego.ronda();//error
        }
        System.out.println("juego terminado");

    }

}

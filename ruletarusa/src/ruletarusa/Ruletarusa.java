/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletarusa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

    

     class Revolver {
        int posicionBala;
        int posicionBalaActual;
        public Revolver(){
            posicionBalaActual = aleatorio(1,6);
            posicionBala = aleatorio(1, 6);
        }
        public boolean disparar(){
            boolean exito = false;
            if (posicionBalaActual == posicionBala){
                exito = true;
            }
            siguienteBala();
            
            return exito;
        }
        public void siguienteBala(){
            if(posicionBalaActual==6){
                posicionBalaActual = 1;
            }else{
                posicionBalaActual++;
            }
        }
        public String toString(){
            return "posicion bala actual: "+posicionBalaActual + ". Posicion bala: "+ posicionBala;
        }
        public int aleatorio(int minimo, int maximo){
    int num = (int) Math.floor(Math.random()* (maximo - minimo +1)+(minimo));
    return num;
        }
    }
    class Jugador {
        int id;
        String name;
        boolean vivo;
        public Jugador (int ñ,String n){
            this.id = ñ;
            this.name = n;
            this.vivo = true;
        }
        public void accionarRevolver(Revolver r){
            if(r.disparar()){
               this.vivo=false; 
                System.out.println("El jugador"+name+"ha muerto");
            }
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public boolean isVivo(){
            return vivo;
        }
        public void setvivo(boolean vivo){
            this.vivo=vivo;
        }
        public void imprimir(){
         if(this.vivo=false){
             
         }   
        }
        
    }
     class Juego{
        public Jugador[] jugadores;
        Revolver[] revolver;
        String nombre;
           public Juego(int numJugadores){
               jugadores = new Jugador[numJugadores];
               crearJugadores();
               revolver = new Revolver[numJugadores];
               crearRevolver();
               }
           public void crearJugadores(){
               for(int i=0;i<jugadores.length;i++){
                   jugadores[i]= new Jugador(i,nombre);
                   
               }
           }
           public void crearRevolver(){
              for(int i=0;i<jugadores.length;i++){
               revolver[i]=new Revolver();
           } 
           }
          
         /*  public boolean finRonda(){
               
               
               for(int i=1;i<jugadores.length;i++){
                   if(!jugadores[i].isVivo()){
                   return true;
               }
               }
               return false;
           }*/
        public void rondas(){
         
         for(int i=0;i<jugadores.length;i++){
             if(i==jugadores.length-1){
                jugadores[i].accionarRevolver(revolver[0]);
             }else{
             jugadores[i].accionarRevolver(revolver[i+1]);
            }
         } 
            System.out.println("a");
        }
    }
    
    
    public class Ruletarusa {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in); 
       
       System.out.println("num jugadores:");
       int x= sc.nextInt();
       Juego a= new Juego(x); 
       System.out.println("juego terminado");
       
           a.rondas();
        
        System.out.println("juego terminado");
        
        
    }
    
}

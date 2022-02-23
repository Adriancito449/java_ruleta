
package ruletarusa;

import java.util.Scanner;

class Revolver {

    int idJugador;
    int posicionBala;
    int posicionBalaActual;

    public Revolver(int idJugador) {
        this.idJugador = idJugador;
        posicionBalaActual = aleatorio(1, 6);
        posicionBala = aleatorio(1, 6);
    }

    public boolean disparar() {
        boolean exito = false;
        if (posicionBalaActual == posicionBala) {
            exito = true;
        }
        siguienteBala();

        return exito;
    }

    public void siguienteBala() {
        if (posicionBalaActual == 6) {
            posicionBalaActual = 1;
        } else {
            posicionBalaActual++;
        }
    }

    public String toString() {
        return "posicion bala actual: " + posicionBalaActual + ". Posicion bala: " + posicionBala;
    }

    public int aleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}

class Jugador {

    int id;
    String name;
    boolean vivo;
    Revolver Arma;
    int Mirilla;

    public Jugador(int ñ, String n, Revolver Arma) {
        this.id = ñ;
        this.name = n;
        this.Arma = new Revolver(id);
        this.vivo = true;
    }
/* 
    public void accionarRevolver(Revolver Arma) {
        if (Arma.disparar()) {
            this.vivo = false;
            System.out.println("El jugador de Nombre: " + name + " ha muerto");
        }
    } */

    /* Esto no es necesario si no declaras la variables name como privado */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setvivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void imprimir() {
        if (this.vivo = false) {

        }
    }

}

class Juego {

    public Jugador[] jugadores;
    String nombre = "Jugador ";
    Revolver pistola;
    Integer mira;
    int terminar_juego = 0;
    Scanner terminado_del_juego = new Scanner(System.in);

    public Juego(int numJugadores) {
        jugadores = new Jugador[numJugadores];
        crearJugadores();
        while (terminar_juego != 1) {
            
            apuntar();
            masacre();
            Analizador_de_jugadores();
            System.out.println(" Para terminar el juego presione 1 si no presione cualquier otro numero ");
            terminar_juego = terminado_del_juego.nextInt();
        }

        /*
         * revolver = new Revolver[numJugadores];
         * crearRevolver();
         */
    }

    public void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            nombre = nombre + i; // Esto es provicional para mistras no esta la carga de nombres por el archivo .txt
            jugadores[i] = new Jugador(i, nombre, pistola);
            if (i != jugadores.length) { // Esto es provicional para mistras no esta la carga de nombres por el archivo .txt
                nombre = "Jugador del id  ";
            } else {
                nombre = "Jugador del id " + i;
            }
            System.out.println(jugadores[i].name); // Esto es para verificar si esta Guardando el nombre de los
            

        }
    }

    public void apuntar() {
        System.out.println(" "); // Espaciador 
        for (int i = 0; i < jugadores.length; i++) {
            boolean condicion = true;
            jugadores[i].Mirilla = -1;
            

            while (condicion) {

                mira = aleatorio(0, jugadores.length-1);
                if (jugadores[mira].isVivo()) {
                    System.out.println("El jugador "+jugadores[i].name+" Esta apuntando a: " + jugadores[mira].name);

                    jugadores[i].Mirilla = mira;
                    condicion = false;
                }
                System.out.println(" La posiciion de las balas del "+jugadores[i].name+" es: "+jugadores[i].Arma.toString());
            }

        }

    }

    public void masacre(){
        int disparador;
        System.out.println(" "); // Espaciador 
        for (int i = 0; i < jugadores.length; i++) {
            disparador = jugadores[i].Mirilla;
            if (jugadores[i].Arma.disparar()) {
                jugadores[disparador].vivo = false;
                System.out.println(" El jugador: "+jugadores[disparador].name+" Esta Muerto ");
            }
        }
    }

    public void Analizador_de_jugadores(){
        System.out.println(" "); // Espaciador 
        for (int i = 0; i < jugadores.length; i++){
            if (jugadores[i].vivo) {
                System.out.println("El jugador de nombre "+jugadores[i].name+" esta vivo ");
            }else {
                System.out.println("El jugador de nombre "+jugadores[i].name+" esta Muerto ");
            }

        }
    }

    public int aleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}

public class Ruletarusa {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("num jugadores: ");
        int x = sc.nextInt();
        Juego a = new Juego(x);
        System.out.println("juego terminado ");
        /*
         * a.rondas();
         */

        System.out.println("juego terminado");

    }

}

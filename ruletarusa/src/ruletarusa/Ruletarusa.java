
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
        System.out.println("Armado " + idJugador);
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

    public void accionarRevolver(Revolver r) {
        if (r.disparar()) {
            this.vivo = false;
            System.out.println("El jugador de Nombre: " + name + " ha muerto");
        }
    }

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

    public Juego(int numJugadores) {
        jugadores = new Jugador[numJugadores];
        crearJugadores();
        apuntar();
        /*
         * revolver = new Revolver[numJugadores];
         * crearRevolver();
         */
    }

    public void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            nombre = nombre + i; // Esto es provicional para mistras no esta la carga de nombres por el archivo
                                 // .txt
            jugadores[i] = new Jugador(i, nombre, pistola);
            if (i != jugadores.length) { // Esto es provicional para mistras no esta la carga de nombres por el archivo
                                         // .txt
                nombre = "Jugador ";
            } else {
                nombre = "Jugador " + i;
            }
            System.out.println(jugadores[i].name); // Esto es para verificar si esta Guardando el nombre de los
            System.out.println(jugadores[i].Arma.toString());

        }
    }

    public void apuntar() {
        for (int i = 0; i < jugadores.length; i++) {
            boolean condicion = true;
            jugadores[i].Mirilla = -1;
            System.out.println("Esta es la iteracion "+i);

            while (condicion) {

                mira = aleatorio(0, jugadores.length-1);
                if (jugadores[mira].isVivo()) {
                    System.out.println("El jugador "+jugadores[i].name+" Esta apuntando a: " + jugadores[mira].name);
                    jugadores[i].Mirilla = mira;
                    condicion = false;
                    System.out.println("Esta es el Bucle "+i);
                }
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

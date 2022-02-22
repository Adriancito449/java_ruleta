/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_de_datos;

class Juego {

    private Jugador[] jugadores;
    private Revolver[] revolver;
    private String nombre;

    public Juego(int numJugadores) {
        jugadores = new Jugador[numJugadores];
        crearJugadores();
        revolver = new Revolver[numJugadores];
        crearRevolver();
    }

    public void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1, nombre);

        }
    }

    public void crearRevolver() {
        for (int i = 0; i < jugadores.length; i++) {
            revolver[i] = new Revolver();
        }
    }

    public boolean finRonda() {

        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }
        }
        return false;
    }

    public void rondas() {
        for (int i = 0; i < jugadores.length; i++) {

            jugadores[i].accionarRevolver(revolver[i + 1]);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_de_datos;

/**
 *
 * @author yulie
 */
class Jugador {

    private int id;
    private String name;
    private boolean vivo;

    public Jugador(int ñ, String n) {
        this.id = ñ;
        this.name = n;
        this.vivo = true;
    }

    public void accionarRevolver(Revolver r) {
        if (r.disparar()) {
            this.vivo = false;
            System.out.println(name + " ha muerto...");

        } else {
            System.out.println(name + " ha sobrevivido");
        }
    }

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
}

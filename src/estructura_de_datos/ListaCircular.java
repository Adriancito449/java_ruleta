/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_de_datos;

/**
 *
 * @author yulie
 */
public class ListaCircular {
     
    private Nodo inicio;
    private Nodo ultimo;
    private int tamanio;
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;//tamaño del archivo de texto//
    }
     public boolean esVacia(){ //pa ver si es vacia//
        return inicio == null;
    }
     public int getTamanio(){/*muestra el tamaño (que lo usaremos mas adelante 
         para el contador de jugadores)*/
        return tamanio;
    }
}


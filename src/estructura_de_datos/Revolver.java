
class Revolver {

    private int posicionBala;
    private int posicionBalaActual;

    public Revolver() {
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

    @Override
    public String toString() {
        return "posicion bala actual: " + posicionBalaActual + ". Posicion bala: " + posicionBala;
    }

    public int aleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}

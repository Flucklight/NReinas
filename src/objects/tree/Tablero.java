package objects.tree;

import java.util.ArrayList;

public class Tablero {
    private char nombre;
    private Tablero padre;
    private boolean ponderacion;
    private char[][] tablero;
    private ArrayList<Tablero> hijos;

    public Tablero(char nombre, boolean ponderacion, Tablero padre, char[][] tablero) {
        this.nombre = nombre;
        this.ponderacion = ponderacion;
        this.padre = padre;
        this.hijos = new ArrayList<>();
        this.tablero = tablero;
    }

    public Tablero(char nombre) {
        this.nombre = nombre;
        this.ponderacion = true;
        this.padre = null;
        this.hijos = new ArrayList<>();
    }

    public void mostrarHijos() {
        for (Tablero n : this.getHijos()) {
            System.out.println(n.getNombre());
        }
    }

    public Tablero getPadre() {
        return padre;
    }

    public ArrayList<Tablero> getHijos() {
        return hijos;
    }

    public char getNombre() {
        return nombre;
    }

    public boolean isPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(boolean ponderacion) {
        this.ponderacion = ponderacion;
    }

    public char[][] getTablero() {
        return tablero;
    }
}

package objects.tree;

import java.io.*;

public class Arbol {
    private Raiz raiz;
    private Apuntador apuntador;

    public Arbol() throws IOException {
        this.raiz = new Raiz('A');
        this.apuntador = new Apuntador(this.raiz);
    }

    //Navegacion

    public void accederNodo(Tablero n) {
        this.apuntador.setPuntero(n);
    }

    public void retrocederNodo() {
        if (this.apuntador.getPuntero().getPadre() != null) {
            this.apuntador.setPuntero(this.apuntador.getPuntero().getPadre());
        }
    }

    public void mostrarPuntero() {
        System.out.println("Puntero -------------> " + this.apuntador.getRuta());
    }

    public void mostrarArbol() {
        this.raiz.mostrarArbol();
    }

    public Apuntador getApuntador() {
        return apuntador;
    }
}

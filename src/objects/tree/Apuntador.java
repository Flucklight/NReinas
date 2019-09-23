package objects.tree;

import java.util.Stack;

public class Apuntador {
    private Tablero puntero;
    private String ruta;

    public Apuntador(Tablero raiz) {
        this.puntero = raiz;
        enrutar();
    }

    private void enrutar() {
        Tablero tmp = this.puntero;
        Stack<Character> stack = new Stack<>();
        this.ruta = "";
        do {
            stack.push(tmp.getNombre());
            tmp = tmp.getPadre();
        } while (tmp != null);
        while (!stack.empty()) {
            this.ruta += stack.pop() + "/";
        }
    }

    public void mostrarNodos() {
        this.puntero.mostrarHijos();
    }

    public void setPuntero(Tablero puntero) {
        this.puntero = puntero;
        enrutar();
    }

    public Tablero getPuntero() {
        return puntero;
    }

    public String getRuta() {
        return ruta;
    }

}

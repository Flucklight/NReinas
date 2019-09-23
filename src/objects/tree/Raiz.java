package objects.tree;


public class Raiz extends Tablero {

    public Raiz(char nombre) {
        super(nombre);
    }

    protected void mostrarArbol() {
        mostrarArbolProceso(this, 0);
    }

    private void mostrarArbolProceso(Tablero tablero, int spacing) {
        for (int i = 0; i < spacing; ++i) {
            System.out.print("\t");
        }
        System.out.println(tablero.getNombre());
        if (tablero.getHijos() != null && !tablero.getHijos().isEmpty()) {
            for (Tablero hijo : tablero.getHijos()) {
                mostrarArbolProceso(hijo, spacing + 1);
            }
        }
    }
}

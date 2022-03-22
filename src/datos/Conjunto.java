package datos;

public class Conjunto {

    Lista lista;

    public Conjunto() {
        lista = new Lista();
    }

    public int numeroElementos() {
        return lista.length();
    }

    public boolean insertar(Integer nuevo) {
        boolean modificado = true;
        if (lista.buscar(nuevo) == -1) {
            lista.addFinal(nuevo);
        } else {
            modificado = false;
        }

        return modificado;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean modificado = false;
        for (int i = 0; i < otroConjunto.lista.length(); i++) {
            if (insertar(otroConjunto.lista.getPosicion(i))) {
                modificado = true;
            }
        }
        return modificado;
    }

    public void mostrar() {
        lista.mostrar();
    }

    public boolean eliminar(Integer elemento) {
        boolean modificado = false;
        int posicion = lista.buscar(elemento);

        if (posicion != -1) {
            lista.delPosicion(posicion);
            modificado = true;
        }

        return modificado;
    }

    public boolean eliminar(Conjunto otroConjunto) {
        boolean modificado = false;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            if (eliminar(otroConjunto.lista.getPosicion(i))) {
                modificado = true;
            }
        }

        return modificado;
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        boolean incluido = true;

        int i = 0;
        while (i < c1.numeroElementos()) {
            if (c2.lista.buscar(c1.lista.getPosicion(i)) == -1) {
                incluido = false;
            }
            i++;
        }

        return incluido;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto c3 = new Conjunto();

        c3.insertar(c1);
        c3.insertar(c2);

        return c3;
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto c3 = new Conjunto();

        for (int i = 0; i < c1.numeroElementos(); i++) {
            Integer elemento = c1.lista.getPosicion(i);
            if (c2.lista.buscar(elemento) != -1) {
                c3.insertar(elemento);
            }
        }

        return c3;
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto c3 = new Conjunto();

        c3.insertar(c1);

        for (int i = 0; i < c2.numeroElementos(); i++) {
            Integer elemento = c2.lista.getPosicion(i);
            if (c1.lista.buscar(elemento) != -1) {
                c3.eliminar(elemento);
            }
        }

        return c3;
    }

}

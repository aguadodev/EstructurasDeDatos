package datos;

public class Datos {

    public static void main(String[] args) {
        /*
        PRUEBAS CON LA CLASE LISTA
         */
        System.out.println("PRUEBAS CON LA CLASE LISTA");
        System.out.println("==========================");

        Lista lista, lista2;

        lista = new Lista();
        lista2 = new Lista();
        lista2.addFinal(8);
        lista2.addFinal(9);

        System.out.println("Longitud: " + lista.length());

        lista.addInicio(5);

        System.out.println("Longitud: " + lista.length());

        lista.addFinal(6);

        System.out.println("Longitud: " + lista.length());
        lista.mostrar();

        lista.addPosicion(4, 0);

        System.out.println("Lista:");
        System.out.println("Longitud: " + lista.length());
        lista.mostrar();

        System.out.println("Lista2:");
        lista2.mostrar();

        lista.addLista(lista2);
        System.out.println("Lista:");
        System.out.println("Longitud: " + lista.length());
        lista.mostrar();

        lista.delPosicion(2);
        System.out.println("Lista:");
        System.out.println("Longitud: " + lista.length());
        lista.mostrar();
        System.out.println("Elemento en la posición 2: " + lista.getPosicion(2));
        System.out.println("Posicion del 5: " + lista.buscar(5));
        System.out.println("Posicion del 3: " + lista.buscar(3));

        System.out.println("CONCATENAR:");
        lista.mostrar();
        lista2.mostrar();
        Lista l3 = Lista.concatena(lista, lista2);
        l3.mostrar();

        /*
        PRUEBAS CON LA CLASE PILA
         */
        System.out.println("PRUEBAS CON LA CLASE PILA");
        System.out.println("=========================");

        // Declaramos una variable de tipo Pila
        Pila pila1;
        // Creamos un objeto de tipo Pila
        pila1 = new Pila();

        // Mostramos y apilamos elementos
        pila1.mostrar();
        pila1.apilar(5);
        pila1.mostrar();
        pila1.apilar(8);
        pila1.mostrar();
        pila1.apilar(7);
        pila1.mostrar();

        // Desapilamos y mostramos el último elemento
        System.out.println("Desapilo el último elemento: " + pila1.desapilar());
        pila1.mostrar();

        // Apilamos más elementos
        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.mostrar();

        // Desapilamos y mostramos el último elemento
        System.out.println("Desapilo el último elemento: " + pila1.desapilar());
        pila1.mostrar();

        /*
        PRUEBAS CON LA CLASE COLA
         */
        System.out.println("PRUEBAS CON LA CLASE COLA");
        System.out.println("=========================");

        System.out.println("");
        // Declaramos una variable de tipo Cola
        Cola cola1;
        // Creamos un objeto de tipo Cola
        cola1 = new Cola();

        // Mostramos y encolamos elementos
        cola1.mostrar();
        cola1.encolar(5);
        cola1.mostrar();
        cola1.encolar(8);
        cola1.mostrar();
        cola1.encolar(7);
        cola1.mostrar();

        // Desapilamos y mostramos el primer elemento
        System.out.println("Saco de la cola el primer elemento: " + cola1.desencolar());
        cola1.mostrar();

        // Encolamos más elementos
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);
        cola1.mostrar();

        // Desapilamos y mostramos el último elemento
        System.out.println("Saco de la cola  el primer elemento: " + cola1.desencolar());
        cola1.mostrar();

        /*
        PRUEBAS CON LA CLASE CONJUNTO
         */
        System.out.println("PRUEBAS CON LA CLASE CONJUNTO");
        System.out.println("=============================");

        Conjunto a, b;
        a = new Conjunto();
        b = new Conjunto();

        a.insertar(7);
        a.insertar(7);
        a.insertar(6);
        a.insertar(7);
        a.insertar(9);
        a.mostrar();

        b.insertar(1);
        b.insertar(2);
        b.mostrar();

        a.insertar(b);
        a.mostrar();

        System.out.println(a.eliminar(9));
        a.mostrar();

        System.out.println(a.eliminar(b));
        a.mostrar();

    }

}

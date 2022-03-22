
package datos;

public class Pila {
    private Lista lista;
    
    public Pila(){
        lista = new Lista();
    }
    
    public void mostrar(){
        lista.mostrar();
    }
    
    public void apilar(Integer e){
        lista.addFinal(e);
    }
    
    public Integer desapilar(){
        return lista.delPosicion(lista.length() - 1);
    }    
}


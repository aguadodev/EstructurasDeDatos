
package datos;


public class Cola {
    private Lista lista;

    public Cola(){
        lista = new Lista();
    }    
    
    public void mostrar(){
        lista.mostrar();        
    }
    // Encolar
    public void encolar(Integer e){
        lista.addFinal(e);        
    }
    // Desencolar
    public Integer desencolar(){
        return lista.delPosicion(0);
    }
}


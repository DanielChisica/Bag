/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldier;

/**
 *
 * @author EAN
 */
public class Bag {

    public Conjunt getBag() {
        return bag;
    }

    public void setBag(Conjunt bag) {
        this.bag = bag;
    }

    public Conjunt getDummyBag() {
        return DummyBag;
    }

    public void setDummyBag(Conjunt DummyBag) {
        this.DummyBag = DummyBag;
    }
    private Conjunt bag;
    private Conjunt DummyBag;
    
    
    

    public Bag() {
    
        DummyBag = new Conjunt();
        bag=new Conjunt();
        
            DummyBag.add(new Elemento("Arma indispensable", "Arma principal", 1));
            DummyBag.add(new Elemento("Arma secundaria", "Arma de resoaldo", 2));
            DummyBag.add(new Elemento("Balas y cartuchos", "Municion", 3));
            DummyBag.add(new Elemento("Comida", "Alimento", 4));
            DummyBag.add(new Elemento("Bebidas", "Bebida", 5));
            DummyBag.add(new Elemento("Telefono o radio", "Medio de comunicacion", 6));
            
        
    }
    
    
    public void añadir(String descripcion, String nombre, int uso){
        
       Elemento ele=new Elemento(descripcion, nombre, uso);
        bag.add(ele);
        
        
    }
    
}

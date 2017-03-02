/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldier;

/**
 * The class Bag works like a controller in the MVC design, this class contains
 * the performing of a Bag with the action add
 * @author Daniel Jimenez
 * @since 3 March 2017
 */
public class Bag {
    
    /**
     * Returns the bag
     * @return the bag
     */
    public Conjunt getBag() {
        return bag;
    }
    
    /**
     * Sets the bag
     * @param bag the object bag 
     */
    public void setBag(Conjunt bag) {
        this.bag = bag;
    }
    
    /**
     * Get a set with the default bag
     * @return The bag with the necessary elements
     */
    public Conjunt getDummyBag() {
        return DummyBag;
    }
    
    /**
     * Set the default bag
     * @param DummyBag he bag with the necessary elements
     */
    public void setDummyBag(Conjunt DummyBag) {
        this.DummyBag = DummyBag;
    }
    
    private Conjunt bag;
    private Conjunt DummyBag;
    
    
    
    /**
     * A constructor used to put the default elements in the correct place
     */
    public Bag() {
    
        DummyBag = new Conjunt();
        bag=new Conjunt();
        
            DummyBag.add(new Elemento("Arma indispensable", "Arma principal", 1));
            DummyBag.add(new Elemento("Arma secundaria", "Arma de respaldo", 2));
            DummyBag.add(new Elemento("Balas y cartuchos", "Municion", 3));
            DummyBag.add(new Elemento("Comida", "Alimento", 4));
            DummyBag.add(new Elemento("Bebidas", "Bebida", 5));
            DummyBag.add(new Elemento("Telefono o radio", "Medio de comunicacion", 6));
            
        
    }
    
    /**
     * Add a element using the constructor method of the element
     * @param descripcion The description of the element
     * @param nombre The name of the element
     * @param uso The number that represents the element
     */
    public void añadir(String descripcion, String nombre, int uso){
        
       Elemento ele=new Elemento(descripcion, nombre, uso);
        bag.add(ele);
        
        
    }
    
}

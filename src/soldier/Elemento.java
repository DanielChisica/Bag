/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldier;

/**
 * La clase elemento modela los objetos que pueden ir dentro de una maleta de soldado
 * @author Daniel Jimenez
 * @since 3 de marzo de 2017
 */
public class Elemento {

    /**
     * Constructor del elemento
     * @param descripcion Descripcion del elemento
     * @param elemento Nombre del elemento
     * @param uso # de uso asignado
     */
    public Elemento(String descripcion, String elemento, int uso) {
        this.descripcion = descripcion;
        this.elemento = elemento;
        this.uso = uso;
    }
    
    /**
     * 
     */
    Elemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Regresa la descripcion del elemento
     * @return String con la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Regresa el nombre del elemento
     * @return String con el nombre del elemento
     */
    public String toStringElemento(){
        return this.elemento;
    }
    
    /**
     * Modifica la descripcion del elemento
     * @param descripcion String con la descripcion a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Regresa el nombre del elemento, funciona como metodo getter
     * @return String con la descripcion que tiene asignado un elemento
     */
    public String getElemento() {
        return elemento;
    }
    
    /**
     * Fija el nombre a un elemenro
     * @param elemento String con el nombre a asignar
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    
    /**
     * Regresa el int con el numero de uso para cada elemento
     * @return Int describiendo el numero de uso de un elemento
     */
    public int getUso() {
        return uso;
    }
    
    /**
     * Fija el uso de un elemento
     * @param uso Int con el numero de uso de un elemento
     */
    public void setUso(int uso) {
        this.uso = uso;
    }
    
    /**
     * Reemplaza al metodo equals por uno que permita comparar 2 elementos
     * mediante su uso
     * @param obj onjeto entrante a ser casteado
     * @return true, si son iguales, false si no lo son
     */
    @Override
    public boolean equals(Object obj) {
        Elemento e=(Elemento)obj;
        return e.getUso()==this.uso;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String descripcion;
    private String elemento;
    private int uso;
    
    
}

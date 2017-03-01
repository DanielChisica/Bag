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
public class Elemento {

    public Elemento(String descripcion, String elemento, int uso) {
        this.descripcion = descripcion;
        this.elemento = elemento;
        this.uso = uso;
    }

    Elemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String toStringElemento(){
        return this.elemento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }

    @Override
    public boolean equals(Object obj) {
        Elemento e=(Elemento)obj;
        return e.getUso()==this.uso;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String descripcion;
    private String elemento;
    private int uso;
    
    
}

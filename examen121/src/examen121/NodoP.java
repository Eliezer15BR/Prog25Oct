/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen121;

/**
 *
 * @author itic
 */
public class NodoP {
    private Provincia a;
    private NodoP sig;
    private NodoP ant;

    public NodoP() {
        ant=sig=null;
    }

    public Provincia getA() {
        return a;
    }

    public void setA(Provincia a) {
        this.a = a;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }
   
    
}

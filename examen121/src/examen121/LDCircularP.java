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
public class LDCircularP {
    private NodoP p;

    public LDCircularP() {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adifinal(Provincia x){
        NodoP nue=new NodoP();
        nue.setA(x);
        if(getP()==null){
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);
        }
        else{
            NodoP w=getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    public void mostrar(){
        if(getP()!=null){
        NodoP r=getP();
        while(r.getSig()!=getP()){
            r.getA().mostrar();
            r=r.getSig();
        }
        r.getA().mostrar();
        }
    }
}

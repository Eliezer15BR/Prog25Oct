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
public class LSCircularD {
    private NodoD p;
    public LSCircularD() {
    p=null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }
    public void adifinal(int a,String b){
        NodoD nue=new NodoD();
        nue.setIdDpto(a);
        nue.setNomDpto(b);
        if(getP()==null){             
            setP(nue);
            nue.setSig(nue);
        }
        else{
            NodoD r=getP();
            while(r.getSig()!=getP()){
                r=r.getSig();}
            r.setSig(nue);
            nue.setSig(getP());
            
        }
    }
    public void mostrar(){
        if(getP()!=null){
            NodoD r=getP();
            System.out.println("");
            System.out.println("DEPARTAMENTOS");
            while(r.getSig()!=getP()){
                System.out.print("<"+r.getIdDpto()+" "+r.getNomDpto()+"> ");
                r=r.getSig();
                
            }
            System.out.println("<"+r.getIdDpto()+" "+r.getNomDpto()+">");
        }
    }
    
}

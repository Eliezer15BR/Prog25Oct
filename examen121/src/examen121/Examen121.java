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
public class Examen121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LSCircularD A=new LSCircularD();
        A.adifinal(1, "La Paz");
        A.adifinal(2, "oruro");
        A.adifinal(3, "tarija");
        A.adifinal(4, "cochabamba");
        A.adifinal(5, "pando");
        A.mostrar();
        LDCircularP B=new LDCircularP();
        B.adifinal(new Provincia(1,"murillo"));
        B.adifinal(new Provincia(2,"sabaya"));
        B.adifinal(new Provincia(4,"chapare"));
        B.adifinal(new Provincia(4,"mizque"));
        B.adifinal(new Provincia(3,"Cercado"));
        B.adifinal(new Provincia(3,"gran chaco"));
        B.adifinal(new Provincia(4,"quillacollo"));
        B.adifinal(new Provincia(1,"omasuyos"));
        B.adifinal(new Provincia(2,"mejillones"));
        B.adifinal(new Provincia(5,"madre de dios"));
        B.mostrar();
        DptoProv(A, B);
        //mostrar el departamento de la privincia con el nombre x
        System.out.println("--");
        DptoP(A,B,"Cercado");
        System.out.println("    --------------");
        //cuantas provincias tiene cada departamento
        cuanto(A,B);
        //mostrar las provincias del departamento con nombre x
        System.out.println("--------------");
        muestra(A,B,"cochabamba");
//
    }
    public static void DptoProv(LSCircularD a,LDCircularP b){
        NodoD r1=a.getP();
        while(r1.getSig()!=a.getP()){
            System.out.println("DEPARTAMENTO: "+r1.getNomDpto());
            NodoP r2=b.getP();
            while(r2.getSig()!=b.getP()){
                if(r1.getIdDpto()==r2.getA().getIdDpto()){
                    System.out.println("  "+r2.getA().getNomPov());
                }
                r2=r2.getSig();
            }
            if(r1.getIdDpto()==r2.getA().getIdDpto()){
                System.out.println("  "+r2.getA().getNomPov());
            }
            r1=r1.getSig();
        }
        System.out.println("DEPARTAMENTO: "+r1.getNomDpto());
            NodoP r2=b.getP();
            while(r2.getSig()!=b.getP()){
                if(r1.getIdDpto()==r2.getA().getIdDpto()){
                    System.out.println("  "+r2.getA().getNomPov());
                }
                r2=r2.getSig();
            }
            if(r1.getIdDpto()==r2.getA().getIdDpto()){
                System.out.println("  "+r2.getA().getNomPov());
            }
        
    }
    public static void DptoP(LSCircularD a,LDCircularP b, String x){
      NodoP r=b.getP();
      while(r.getSig()!=b.getP()){
          if(r.getA().getNomPov().equals(x)){
              NodoD r2=a.getP();
              while(r2.getSig()!=a.getP()){
                  if(r2.getIdDpto()==r.getA().getIdDpto()){
                      System.out.println("  "+r2.getNomDpto());
                  }
                  r2=r2.getSig();
              }
              if(r2.getIdDpto()==r.getA().getIdDpto()){
                      System.out.println("  "+r2.getNomDpto());
                  }
                  r2=r2.getSig();
          }
          r=r.getSig();
      }
      if(r.getA().getNomPov().equals(x)){
              NodoD r2=a.getP();
              while(r2.getSig()!=a.getP()){
                  if(r2.getIdDpto()==r.getA().getIdDpto()){
                      System.out.println("  "+r2.getNomDpto());
                  }
                  r2=r2.getSig();
              }
              if(r2.getIdDpto()==r.getA().getIdDpto()){
                      System.out.println("  "+r2.getNomDpto());
                  }
                  r2=r2.getSig();
          }
    }
    public static void cuanto(LSCircularD a,LDCircularP b){
        NodoD r=a.getP();
         int con=0;
        while(r.getSig()!=a.getP()){
           
            NodoP r2=b.getP();
            while(r2.getSig()!=b.getP()){
                if(r.getIdDpto()==r2.getA().getIdDpto()){
                    con++;
                }
                r2=r2.getSig();
            }
            if(r.getIdDpto()==r2.getA().getIdDpto()){
                    con++;
                }
            System.out.println(r.getNomDpto()+" tiene "+con+" provincias");
            con=0;
            r=r.getSig();
        }
         NodoP r2=b.getP();
            while(r2.getSig()!=b.getP()){
                if(r.getIdDpto()==r2.getA().getIdDpto()){
                    con++;
                }
                r2=r2.getSig();
            }
            if(r.getIdDpto()==r2.getA().getIdDpto()){
                    con++;
                }
            System.out.println(r.getNomDpto()+" tiene "+con+" provincias");
            con=0;
    }
    public static void muestra(LSCircularD a,LDCircularP b,String x){
        NodoD r=a.getP();
        while(r.getSig()!=a.getP()){
            if(r.getNomDpto().equals(x)){
                NodoP r2=b.getP();
                while(r2.getSig()!=b.getP()){
                    if(r2.getA().getIdDpto()==r.getIdDpto()){
                        r2.getA().mostrar();
                    }
                    r2=r2.getSig();
                }
                if(r2.getA().getIdDpto()==r.getIdDpto()){
                        r2.getA().mostrar();
                    }
            }
            r=r.getSig();
            
        }
         if(r.getNomDpto().equals(x)){
                NodoP r2=b.getP();
                while(r2.getSig()!=b.getP()){
                    if(r2.getA().getIdDpto()==r.getIdDpto()){
                        r2.getA().mostrar();
                    }
                    r2=r2.getSig();
                }
                if(r2.getA().getIdDpto()==r.getIdDpto()){
                        r2.getA().mostrar();
                    }
            }
    }
   
}

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
public class Provincia {
    private int idDpto;
    private String nomPov;

    public Provincia() {
    }
    
    public Provincia(int idDpto, String nomPov) {
        this.idDpto = idDpto;
        this.nomPov = nomPov;
    }

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public String getNomPov() {
        return nomPov;
    }

    public void setNomPov(String nomPov) {
        this.nomPov = nomPov;
    }
    public void mostrar(){
        System.out.println("["+this.idDpto+" "+this.nomPov+"]");
    }
}

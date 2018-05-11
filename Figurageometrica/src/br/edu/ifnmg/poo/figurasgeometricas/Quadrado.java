package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class Quadrado extends FigurasGeometricas{
    private Integer lado;
    
    public void setLado(Integer lado){
        this.lado = lado;
    }    
    public Integer getLado(){
        return lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
    
}

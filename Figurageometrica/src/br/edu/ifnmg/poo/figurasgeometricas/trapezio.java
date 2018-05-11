package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class trapezio extends FigurasGeometricas{
    private Integer baseMaior;
    private Integer baseMenor;
    private Integer lado1;
    private Integer lado2;
    
    public void setBaseMaior(Integer baseMaior){
        this.baseMaior = baseMaior;
    }    
    public Integer getBaseMaior(){
        return baseMaior;
    }
    public void setBaseMenor(Integer baseMenor){
        this.baseMenor = baseMenor;
    }    
    public Integer getBaseMenor(){
        return baseMenor;
    }
    public void setlado1(Integer lado1){
        this.lado1 = lado1;
    }
    public Integer getlado1(){
        return lado1;
    }
     public void setlado2(Integer lado2){
        this.lado2 = lado2;
    }
    public Integer getlado2(){
        return lado2;
    }
    
    
    @Override
    public double calcularPerimetro(){
        return baseMaior+baseMenor+lado1+lado2;
    }
}

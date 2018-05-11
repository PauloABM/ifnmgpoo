package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author Paulo Sennin
 */
public class Triangulo extends FigurasGeometricas{
    private double lado1;
    private double lado2;
    private double lado3;
    
    public void setlado1(double lado1){
        this.lado1 = lado1;
    }
    public double getlado1(){
        return lado1;
    }
     public void setlado2(double lado2){
        this.lado2 = lado2;
    }
    public double getlado2(){
        return lado2;
    }
     public void setlado3(double lado3){
        this.lado3 = lado3;
    }
    public double getlado3(){
        return lado3;
    }
    
    
    @Override
    public double calcularPerimetro(){
        return lado3+lado1+lado2;
    }
    
}

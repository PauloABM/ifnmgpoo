package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class Circulo extends FigurasGeometricas{
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    
    public double calcularVolumeCilindro(double altura){
        return Math.PI*raio*raio*altura;
    }
    @Override
    public double calcularPerimetro(){
         return Math.PI*2*raio;
     }
}

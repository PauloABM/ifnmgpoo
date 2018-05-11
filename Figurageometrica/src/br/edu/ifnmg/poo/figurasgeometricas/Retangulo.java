package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class Retangulo extends FigurasGeometricas{
    private Integer base;
    private Integer altura;
    
    public void setBase(Integer base){
        this.base = base;
    }    
    public Integer getBase(){
        return base;
    }
    public void setAltura(Integer altura){
        this.altura=altura;
    }
    public Integer getAltura(){
        return altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}

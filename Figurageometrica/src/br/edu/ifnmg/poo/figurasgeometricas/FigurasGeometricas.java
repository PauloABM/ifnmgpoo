package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public abstract class FigurasGeometricas {
    private String nome;
    public abstract double calcularPerimetro();
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    public String getNome(){
        return this.nome;
    }
    
}

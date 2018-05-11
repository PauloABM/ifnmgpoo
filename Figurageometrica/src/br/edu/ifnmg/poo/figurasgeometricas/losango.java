package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class losango extends FigurasGeometricas{
    private Integer aresta;
    
    public void setAresta(Integer aresta){
        this.aresta = aresta;
    }    
    public Integer getAresta(){
        return aresta;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4*aresta;
    }
}
    

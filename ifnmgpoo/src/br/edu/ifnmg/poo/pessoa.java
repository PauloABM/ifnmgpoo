package br.edu.ifnmg.poo;

/**
 *
 * @author PauloSennin
 */
public class pessoa {
    private String nome;
    protected Integer id;
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    public String getNome(){
        return this.nome;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return this.id;
    }
}

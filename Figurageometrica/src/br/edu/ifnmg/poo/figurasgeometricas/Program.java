package br.edu.ifnmg.poo.figurasgeometricas;

/**
 *
 * @author PauloSennin
 */
public class Program {
    public static void main(String[] args){
        FigurasGeometricas fig1 = new Circulo();
        FigurasGeometricas fig2 = new Triangulo();
        double p1 = fig1.calcularPerimetro();
        double p2 = fig2.calcularPerimetro();
        //double vol1 = fig1.calcularVolumeCilindro(1);
        Circulo c = (Circulo)fig1;
        c.setRaio(1.8);
        ((Circulo) fig1).setRaio(2);
        System.out.println(fig1.calcularPerimetro());
        System.out.println(c.calcularPerimetro());
        
    }
}

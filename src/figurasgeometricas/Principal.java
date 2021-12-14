
package figurasgeometricas;


public class Principal {
    public static void main(String[] args) {
        
    
   
    Circulo circulo = new Circulo();
    Quadrado quadrado = new Quadrado();
    Triangulo triangulo = new Triangulo();
    FiguraEquilatero fig = new FiguraEquilatero();
    desenhar desenha = new desenhar(quadrado);
    
    desenha.desenha();
    }
    
}

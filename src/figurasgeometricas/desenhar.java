
package figurasgeometricas;


public class desenhar {
    private FiguraGeometrica fig;
    
    public desenhar(FiguraGeometrica a){ 
        fig = a;
    }
    
    public void desenha(){
        fig.desenha();
    }
}

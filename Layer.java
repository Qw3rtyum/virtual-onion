
/**
 * Write a description of class Layer here.
 * 
 * @author Qw3rtyum 
 * @version 02.16.23
 */
public class Layer
{
    private int layerNumber;
    private double thickness;

    /**
     * Constructor de la clase Layer
     */
    public Layer(int newLayerNum, double newThickness)
    {
        layerNumber = newLayerNum;
        thickness = newThickness;
    }
    
    public int getLayerNumber() {
        return layerNumber;
    }
    
    public double getThickness() {
        return thickness;
    }
    
    public void setLayerNumber(int newLayerNumber) {
        layerNumber = newLayerNumber;
    }
    
    public void setThickness(double newThicknessNum) {
        thickness = newThicknessNum;
    } 
    
    public void imprimirDetalles()
    {
        System.out.println("Número de la capa: " + layerNumber);
        System.out.println("Grosor de las capa: " + thickness);
    }
}

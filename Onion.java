
/**
 * Write a description of class Onion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Onion
{
    // instance variables - replace the example below with your own
    private int onionNum;
    private boolean isCut;
    private Layer layer;
    
    public Onion(int newOnionNum, boolean cutState, int newLayerNumber, double newThickness)
    {
        onionNum = newOnionNum;
        isCut = cutState;
        layer = new Layer(newLayerNumber, newThickness);
    }
    
    public int getOnionNum() {
        return onionNum;
    }
    
    public boolean getIsCut() {
        return isCut;
    }
    
    public Layer getLayer() {
        return layer;
    }
    
    public void setOnionNum(int newOnionNum)
    {
        onionNum = newOnionNum;
    }
    
    public void setCutState(boolean cutState)
    {
        isCut = cutState;
    }
    
    public void setLayer(int newLayerNum, double newThickness){
        layer.setLayerNumber(newLayerNum);
        layer.setThickness(newThickness);
    }
}

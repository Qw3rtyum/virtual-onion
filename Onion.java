
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
}

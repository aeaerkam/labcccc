import java.awt.*;
import javax.swing.*;  

public class ShapesCanvas extends JPanel
{
	// Variables
	private ShapeContainer shapes;
	
	// Constructor
    public ShapesCanvas(ShapeContainer shapes) 
    {
   		this.shapes = shapes;
    	
    	setPreferredSize (new Dimension(500, 500));		
    }
    
    // draws the panel by requesting the ShapeContainer to draw itself
    public void paintComponent(Graphics g)
    {
    	super.paintComponent (g);
    	
    	shapes.draw (g);	
    }	
    
    
}

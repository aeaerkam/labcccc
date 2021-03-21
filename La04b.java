public class Lab04b 
{
  	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
		JFrame shapesGame = new JFrame("ShapesGame - v2.0");
		shapesGame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		shapesGame.add(new ShapesGame());
		
		shapesGame.pack ();
		shapesGame.setLocationRelativeTo (null);
		
		shapesGame.setVisible(true);
		        
    }
}

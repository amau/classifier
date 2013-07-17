package me;

public class App 
{
    public static void main( String[] args )
    {
    	
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	MainFrame mainFrame = new MainFrame();
                mainFrame.createAndShowGUI();
            }
        });
    }
}

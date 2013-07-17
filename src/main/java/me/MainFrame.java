package me;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class MainFrame
{
	protected final JFrame frame = new JFrame("FrameDemo");
	protected final JFileChooser fileChooser = new JFileChooser();
	protected JLabel label = new JLabel("Chose a directory.");
	protected File directory;

	public MainFrame()
	{

	}

	public void createAndShowGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        JMenuBar menuBar  = new JMenuBar();
        JMenu    fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open...");
        openItem.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
		    	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		        int retval = fileChooser.showOpenDialog(frame);
		        if (retval == JFileChooser.APPROVE_OPTION) {
		            start(fileChooser.getSelectedFile());
		        }
	    	}
        });
        menuBar.add(fileMenu);
        fileMenu.add(openItem);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
	public void start(File directory)
	{
		System.out.println("Start Process: " + directory);
		File[] files = directory.listFiles(new FileFilter(){
        	public boolean accept(File fileName) {
            	return fileName.getName().matches(".*\\.jpe?g$") || fileName.getName().matches(".*\\.gif$") || fileName.getName().matches(".*\\.png$");
        }}); 


		
        for(int i=0 ; i<files.length ; i++)
        {
        	try{
        		ImageIcon imageIcon = new ImageIcon(files[i].getAbsolutePath());
        		label.setIcon(imageIcon);
				frame.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
				frame.update(frame.getGraphics() );
        		System.out.println("File " + i + ": " + files[i].getName());
        		Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}

        }
	}
}
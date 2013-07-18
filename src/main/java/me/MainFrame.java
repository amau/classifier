
package me;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import me.ui.ClassifierPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class MainFrame implements KeyListener
{
	protected final JFrame frame = new JFrame("FrameDemo");

	protected final JFileChooser fileChooser = new JFileChooser();

	protected JLabel label = new JLabel("Chose a directory.");

	protected ClassifierPanel panel;

	protected File directory;

	protected File[] files;

	protected List<File> animals = new ArrayList<File>();

	protected List<File> empty = new ArrayList<File>();

	protected int count = 0;


	public MainFrame()
	{

	}


	public void createAndShowGUI()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(175, 100));
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open...");
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				fileChooser
						.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int retval = fileChooser.showOpenDialog(frame);
				if (retval == JFileChooser.APPROVE_OPTION)
				{
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
		frame.setResizable(false);
	}


	public void start(File directory)
	{
		files = directory.listFiles(new FileFilter()
		{
			public boolean accept(File fileName)
			{
				return fileName.getName().matches(".*\\.jpe?g$")
						|| fileName.getName().matches(".*\\.gif$")
						|| fileName.getName().matches(".*\\.png$");
			}
		});

		panel = new ClassifierPanel(files[count].getAbsolutePath());
		frame.remove(label);
		frame.add(panel);
		frame.addKeyListener(this);
		resize();
	}


	public void resize()
	{
		Insets i = frame.getInsets();
		frame.setSize(new Dimension(
				panel.getWidth() + i.left + i.right, panel.getHeight()
						+ i.top + i.bottom));
	}


	public void update()
	{
		panel.setImage(files[count]);
		panel.update(panel.getGraphics());
		resize();
	}


	private void end()
	{
		panel.end(panel.getGraphics());
		System.out.println("");
		System.out.println("Pictures with animals: ");
		System.out.println("");
		for (File f : this.animals)
		{
			System.out.println(f.getName());
		}
		System.out.println("");
		System.out.println("Pictures without animals: ");
		System.out.println("");
		for (File f : this.empty)
		{
			System.out.println(f.getName());
		}
		resize();
	}


	public void keyTyped(KeyEvent e)
	{
		// We don't want to do anything on key typed.
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == 37 || e.getKeyCode() == 39)
		{
			if (e.getKeyCode() == 37)
			{
				animals.add(files[count]);
			}
			else
			{
				empty.add(files[count]);
			}
			count++;
			if (count < files.length)
			{
				update();
			}
			else
			{
				end();
			}
		}
	}


	public void keyReleased(KeyEvent e)
	{
		// We don't want to do anything on key released.
	}
}
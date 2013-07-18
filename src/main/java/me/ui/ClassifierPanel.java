package me.ui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClassifierPanel extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File imageFile;

	private BufferedImage image;
	
	private BufferedImage bufferedThumbnail;

	private int width;

	private int height;

	private static int MAX_SIDE_SIZE = 800;


	public ClassifierPanel(File image)
	{
		super();

		this.imageFile = image;
		read();
	}


	protected void read()
	{
		try
		{
			image = ImageIO.read(imageFile);
			Image thumbnail;
			//in this case we have an horizonal image.
			if(image.getWidth()>image.getHeight())
			{
				thumbnail = image.getScaledInstance(MAX_SIDE_SIZE, -1, Image.SCALE_SMOOTH);
			}
			//in this case we have an vertical image.
			else
			{
				thumbnail = image.getScaledInstance(-1,MAX_SIDE_SIZE, Image.SCALE_SMOOTH);
			}
			//we hold a copy of the thumbnail.
			bufferedThumbnail = new BufferedImage(thumbnail.getWidth(null),
			                                                    thumbnail.getHeight(null),
			                                                    BufferedImage.TYPE_INT_RGB);
			bufferedThumbnail.getGraphics().drawImage(thumbnail, 0, 0, null);
			setWidth(bufferedThumbnail.getWidth());
			setHeight(bufferedThumbnail.getHeight());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}


	public ClassifierPanel(String string)
	{
		this(new File(string));
	}


	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(bufferedThumbnail, 0, 0, null);
	}
	
	public void end(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("No more pictures", 10, 10);
	}


	@Override
	public int getWidth()
	{
		return width;
	}


	@Override
	public int getHeight()
	{
		return height;
	}


	protected void setHeight(int height)
	{
		this.height = height;

	}


	protected void setWidth(int width)
	{
		this.width = width;

	}


	public void setImage(File file)
	{
		this.imageFile = file;
		read();
	}

}

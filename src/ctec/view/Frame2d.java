package ctec.view;

import javax.swing.JFrame;

import ctec.controller.Controller2d;

public class Frame2d extends JFrame
{
	private Controller2d baseController;
	private Panel2d basePanel;
	
	public Frame2d(Controller2d baseController)
	{
		this.baseController = baseController;
		basePanel = new Panel2d(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		
	}
}

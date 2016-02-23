package ctec.controller;

import ctec.model.Egg;
import ctec.view.Frame2d;

public class Controller2d
{
	
	private Frame2d baseFrame;
	private Egg[][] eggCarton;
	
	public Controller2d()
	{
		baseFrame = new Frame2d(this);
		
		eggCarton = new Egg[2][6];
		
	}
	
	public void start()
	{
		
	}
	
	public Egg[][] getEggCarton()
	{
		return eggCarton;
	}
	
}

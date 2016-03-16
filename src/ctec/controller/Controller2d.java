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
		
		
		setupCarton();
	}
	
	public void start()
	{
		
	}
	
	private void setupCarton()
	{
		eggCarton = new Egg[2][6];
		eggCarton[0][0] = new Egg(true, true, false);
	}
	
	public Egg[][] getEggCarton()
	{
		return eggCarton;
	}
	
}

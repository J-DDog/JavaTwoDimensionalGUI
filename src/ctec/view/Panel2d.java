package ctec.view;

import javax.swing.JPanel;

import ctec.controller.Controller2d;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;

public class Panel2d extends JPanel
{

	private Controller2d baseController;
	private SpringLayout springLayout;
	private JTable table;	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	
	public Panel2d(Controller2d baseController)
	{
		this.baseController = baseController;
		
		
		this.springLayout = new SpringLayout();
		this.table = new JTable();
		this.textField_2 = new JTextField();
		this.textField_2.setColumns(10);
		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.textField = new JTextField();
		this.textField.setColumns(10);
		this.btnNewButton= new JButton("New button");
		this.btnNewButton_1= new JButton("New button");
		this.lblNewLabel= new JLabel("New label");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		this.setLayout(springLayout);
		add(table);
		add(textField);
		add(textField_1);
		add(textField_2);
		add(btnNewButton);
		add(btnNewButton_1);
		add(lblNewLabel);
	}

	private void setupLayout()
	{
		
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 96, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 182, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 297, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 16, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -28, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, table, -66, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, table, -89, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 31, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -30, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 158, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 19, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, table, 83, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, table, 114, SpringLayout.WEST, this);
		
	}

	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}
}

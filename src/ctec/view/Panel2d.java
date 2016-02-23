package ctec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import ctec.controller.Controller2d;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Panel2d extends JPanel
{

	private Controller2d baseController;
	private SpringLayout baseLayout;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton displayButton;
	private JButton changeButton;
	private JLabel currentEggLable;
	private JTable EggTable;
	private JScrollPane tablePane;
//	private JTable coffeeMugTable;
	
	public Panel2d(Controller2d baseController)
	{
		this.baseController = baseController;
		
		this.baseLayout = new SpringLayout();
		this.textField_2 = new JTextField();
		this.textField_2.setColumns(10);
		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.textField = new JTextField();
		this.textField.setColumns(10);
		this.displayButton = new JButton("Display");
		this.changeButton = new JButton("Change");
		this.currentEggLable = new JLabel("New label");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable()
	{
		String[] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getEggCarton(), columnHeaders);
		EggTable = new JTable(tableModel);
		tablePane = new JScrollPane(EggTable);
		
//		DefaultTableModel mugTableModel = new DefaultTableModel(baseController.getMyMugs(), columnHeaders);
//		coffeeMugTable = new JTable(mugTableModel);
		
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(textField);
		this.add(textField_1);
		this.add(textField_2);
		this.add(displayButton);
		this.add(changeButton);
		this.add(currentEggLable);
		this.add(tablePane);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 297, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textField_1, 5, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField_1, 158, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textField_2, 5, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField_2, 19, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, tablePane, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, tablePane, 7, SpringLayout.SOUTH, displayButton);
		baseLayout.putConstraint(SpringLayout.NORTH, currentEggLable, 5, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, currentEggLable, -80, SpringLayout.WEST, displayButton);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 0, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, textField_2);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 6, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, textField);
	}

	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		displayButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
	}
}

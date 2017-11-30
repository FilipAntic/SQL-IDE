package view;

import java.awt.Color;

import javax.swing.JSplitPane;

import interfaces.Initialize;

public class InfVerticalSplitPane extends JSplitPane implements Initialize {


	private static RightUpperTabbedPane rightUpperPanel = new RightUpperTabbedPane();
	private static RightDownerPanel rightDownerPanel= new RightDownerPanel();

	public InfVerticalSplitPane() {
		super(JSplitPane.VERTICAL_SPLIT,rightUpperPanel,rightDownerPanel);
		setDividerSize(8);
		setContinuousLayout(true);
		setContinuousLayout(false);
		setOneTouchExpandable(true);
		setResizeWeight(0.5);
		rightDownerPanel.setBackground(Color.RED);
	}

	@Override
	public void initialize() {
		

	}

	@Override
	public void addingOnComponent() {
		// TODO Auto-generated method stub
		
	}

	public RightUpperTabbedPane getRightUpperPanel() {
		return rightUpperPanel;
	}

	public static RightDownerPanel getRightDownerPanel() {
		return rightDownerPanel;
	}
	
	

}

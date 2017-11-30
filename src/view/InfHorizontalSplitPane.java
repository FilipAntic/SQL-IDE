package view;

import java.awt.Color;

import javax.swing.JSplitPane;

import interfaces.Initialize;

public class InfHorizontalSplitPane extends JSplitPane implements Initialize {

	private static LeftScrollPane leftScrollPane = new LeftScrollPane();
	private static InfVerticalSplitPane infVerticalSplitPane = new InfVerticalSplitPane();

	public InfHorizontalSplitPane() {
		super(JSplitPane.HORIZONTAL_SPLIT, leftScrollPane, infVerticalSplitPane);
		setResizeWeight(0.3);
		setContinuousLayout(false);
		setOneTouchExpandable(true);
	}



	@Override
	public void initialize() {

	}

	@Override
	public void addingOnComponent() {
		// TODO Auto-generated method stub
		
	}



	public static LeftScrollPane getLeftScrollPane() {
		return leftScrollPane;
	}



	public InfVerticalSplitPane getInfVerticalSplitPane() {
		return infVerticalSplitPane;
	}
	
	
}

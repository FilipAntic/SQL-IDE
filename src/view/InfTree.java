package view;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import app.MainFrame;
import controller.InfTreeMouseAdapter;
import controller.InfTreeSelectionListener;
import interfaces.Initialize;
import interpreters.JSONTreeInterpreter;
import interpreters.TryingParser;
import model.Storage;

public class InfTree extends JTree implements Initialize{

	private static JSONTreeInterpreter s = new JSONTreeInterpreter();
	private static TryingParser p = new TryingParser();
	private static Storage storage = s.readMetaSchema();
	public InfTree() {
		super(storage);
		addTreeSelectionListener(new InfTreeSelectionListener());
		addMouseListener(new InfTreeMouseAdapter());
		setRootVisible(true);
	}
	
	public void newRoot(DefaultMutableTreeNode node ){
		((DefaultTreeModel)getModel()).setRoot(node);
		SwingUtilities.updateComponentTreeUI(this);
	}
	@Override
	public void initialize() {
		
		
	}
	@Override
	public void addingOnComponent() {
		
	}
	
	public static Storage getStorage() {
		return storage;
	}
	
	public static void setStorage(Storage storage) {
		InfTree.storage = storage;
	}

}

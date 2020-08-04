package staj1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;


import javax.swing.JTree;

public class treesl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					treesl frame = new treesl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public treesl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Menu");
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		a.add(new DefaultMutableTreeNode("A1"));
		a.add(new DefaultMutableTreeNode("A2"));
		a.add(new DefaultMutableTreeNode("A3"));
		a.add(new DefaultMutableTreeNode("A4"));
		a.add(new DefaultMutableTreeNode("A5"));
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		b.add(new DefaultMutableTreeNode("B1"));
		b.add(new DefaultMutableTreeNode("B2"));
		b.add(new DefaultMutableTreeNode("B3"));
		b.add(new DefaultMutableTreeNode("B4"));
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
		c.add(new DefaultMutableTreeNode("C1"));
		c.add(new DefaultMutableTreeNode("C2"));
		c.add(new DefaultMutableTreeNode("C3"));
		rootNode.add(a);
		rootNode.add(b);
		rootNode.add(c);
		JTree tree = new JTree(rootNode);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
	    tree.addTreeSelectionListener(new SelectionListener());
		contentPane.add(tree, BorderLayout.CENTER);
	}
    private class SelectionListener implements TreeSelectionListener {
	    public void valueChanged(TreeSelectionEvent event) {
	    	
	    	if (event.getNewLeadSelectionPath() != null ) {
	    		JTree tree = (JTree) event.getSource();
	    	    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
	    	        .getLastSelectedPathComponent();
	    	    String selectedNodeName = selectedNode.toString();
	    	    if(selectedNodeName == "A1") {
	    	    	
	    	    }
			}
	    }
	  }
}

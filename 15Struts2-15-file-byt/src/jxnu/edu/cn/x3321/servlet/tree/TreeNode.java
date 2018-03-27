package jxnu.edu.cn.x3321.servlet.tree;

public class TreeNode {
	Node rootNode;

	public TreeNode(Node rootNode) {
		super();
		this.rootNode = rootNode;
	}
	
	public Integer getId(){
		return rootNode.getNodeId();
	}
	public String getName(){
		return rootNode.getNodeName();
	}
	public TreeNode[] getChildren(){
		if(rootNode.getNodes()!=null&&rootNode.getNodes().length>0){
			int length=rootNode.getNodes().length;
			TreeNode [] treeNodes=new TreeNode[length];
			for(int i=0;i<length;i++){
				treeNodes[i]=new TreeNode(rootNode.getNodes()[i]);
			}
			return treeNodes;
		}
		return new TreeNode[0];
	}

}

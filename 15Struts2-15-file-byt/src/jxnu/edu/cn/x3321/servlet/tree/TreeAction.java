package jxnu.edu.cn.x3321.servlet.tree;

import com.opensymphony.xwork2.ActionSupport;

public class TreeAction extends ActionSupport {
	private TreeNode treeNode;

	public TreeNode getTreeNode() {
		return treeNode;
	}

	public void setTreeNode(TreeNode treeNode) {
		this.treeNode = treeNode;
	}
	
	public String getTree(){
		//第三层
		Node[] ca=new Node[5];
		Node c1=new Node();
		Node c2=new Node();
		Node c3=new Node();
		Node c4=new Node();
		Node c5=new Node();
		c1.setNodeId(11);
		c1.setNodeName("c1");
		c2.setNodeId(22);
		c2.setNodeName("c2");
		c3.setNodeId(33);
		c3.setNodeName("c3");
		c4.setNodeId(44);
		c4.setNodeName("c4");
		c5.setNodeId(55);
		c5.setNodeName("c5");
		ca[0]=c1;
		ca[1]=c2;
		ca[2]=c3;
		ca[3]=c4;
		ca[4]=c5;
		
		//第二层
		Node[] c=new Node[5];
		Node child;
		child=new Node();
		child.setNodeId(1);
		child.setNodeName("Struts2.0");
		child.setNodes(ca);
		c[0]=child;
		
		child=new Node();
		child.setNodeId(2);
		child.setNodeName("Spring2.0");
		child.setNodes(ca);
		c[1]=child;
		
		child=new Node();
		child.setNodeId(3);
		child.setNodeName("Ajax");
		child.setNodes(ca);
		c[2]=child;
		
		child=new Node();
		child.setNodeId(4);
		child.setNodeName("JPA");
		child.setNodes(ca);
		c[3]=child;
		
		child=new Node();
		child.setNodeId(5);
		child.setNodeName("Hibernate");
		child.setNodes(ca);
		c[4]=child;
		
		
		//第一层
		Node parent =new Node();
		parent.setNodeId(0);
		parent.setNodeName("sun");
		parent.setNodes(c);
		
		//产生一棵树
		treeNode=new TreeNode(parent);		
		
		return "succ";
	}

}

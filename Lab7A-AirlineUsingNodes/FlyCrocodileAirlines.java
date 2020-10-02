// Tej Vyas
// CSC 236 - 64
// Lab 7A

import java.util.*;

public class FlyCrocodileAirlines 
{
	private class GraphNode 
	{
		private String city;
		private GraphNode left; 	
		private GraphNode right;	
		private boolean alreadyVisited;

		private GraphNode(String city) 
		{
			this.city = city;
			this.left = null;
			this.right = null;
		}
	}
	public GraphNode graphOfAustralia() 
	{
		GraphNode rootNode = new GraphNode("Sydney");
		GraphNode b = new GraphNode("Brisbane");
		GraphNode c = new GraphNode("Caniberra");
		GraphNode a = new GraphNode("Adelaide");
		GraphNode m = new GraphNode("Melbourne");
		GraphNode p = new GraphNode("Perth");
		GraphNode h = new GraphNode("Hobart");
		GraphNode blst = new GraphNode("Black stump");
		GraphNode d = new GraphNode("Darwin");
			
		rootNode.left = c;
		rootNode.right = m;
		c.left = a;
		c.right = b;
		a.left = m;
		a.right = p;
		m.left = c;
		m.right = h;
		p.left = blst;
		blst.left = d;
		
		return rootNode;
	}
	private GraphNode getNewNode(GraphNode node) 
	{
		if (node.left != null) 
		{
			if (!node.left.alreadyVisited)
			{
				return node.left;
			}
		}
		if (node.right != null) 
		{
			if (!node.right.alreadyVisited) 
			{
				return node.right;
			}
		}
		return null;
	}
	public void calculateDFS(GraphNode rootNode) 
	{
		System.out.println("Depth First Search of Fly Crocodile Airlines");
		Stack<GraphNode> dfs = new Stack<>();
		dfs.push(rootNode);
		rootNode.alreadyVisited = true;
		
		System.out.println(rootNode.city);
		while (!dfs.isEmpty())
		{
			GraphNode sTop = dfs.peek();
			GraphNode child = getNewNode(sTop);
			if (child != null)
			{
				child.alreadyVisited = true;
				System.out.println(child.city);
				dfs.push(child);
			} 
			else 
			{
				dfs.pop();
			}
		}
	}
	public void calculateBFS(GraphNode rootNode)
	{
		System.out.println("\nBreadth First Search of Fly Crocodile Airlines");
		Queue<GraphNode> bfs = new LinkedList<>();
		bfs.add(rootNode);
		
		System.out.println(rootNode.city);
		while (!bfs.isEmpty()) 
		{
			GraphNode node = bfs.remove(); 
			GraphNode child = null;
			while ((child = getNewNode(node)) != null) 
			{
				child.alreadyVisited = true;
				System.out.println(child.city);
				bfs.add(child);
			}
		}
	}
	public static void main(String args[])
	{
		FlyCrocodileAirlines fca = new FlyCrocodileAirlines();
		GraphNode temp = fca.graphOfAustralia();
		fca.calculateDFS(temp);
		
		FlyCrocodileAirlines fca1 = new FlyCrocodileAirlines();
		GraphNode temp1 = fca1.graphOfAustralia();
		fca1.calculateBFS(temp1);
	}
}

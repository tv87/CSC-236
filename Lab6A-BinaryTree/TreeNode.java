// Tej Vyas
// CSC 236

public class TreeNode 
{
	private int value;
	private TreeNode left, right;
	
	public TreeNode()
	{
		value = 0;
		left = null;
		right = null;		
	}
	public TreeNode(int initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}
	public TreeNode(int initValue, TreeNode initLeft, TreeNode initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	public int getValue()
	{
		return value;
	}
	public TreeNode getLeft()
	{
		return left;
	}
	public TreeNode getRight()
	{
		return right;
	}
	public void setValue(int newValue)
	{
		value = newValue;
	}
	public void setLeft(TreeNode newLeft)
	{
		left = newLeft;
	}
	public void setRight(TreeNode newRight)
	{
		right = newRight;
	}
}


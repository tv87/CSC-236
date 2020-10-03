
public class PolyNode
{
	private int coefficient ;
	private int exponent;
	private PolyNode next;
	
	public  PolyNode()
	{
		this.coefficient = 0;
		this.exponent = 0;	
		this.next = null;
	}	
	public PolyNode(int coef, int expo, PolyNode _next)
	{
		this.coefficient = coef;
		this.exponent = expo;	
		this.next = _next;
	}
	public PolyNode(PolyNode p)
	{
		this.coefficient = p.coefficient;
		this.exponent = p.exponent;	
		this.next = p.next;
	}
	
	public void setCoefficient(int coef)
	{
		this.coefficient = coef;		
	}
	public void setExponent(int expo)
	{
		this.exponent = expo;		
	}
	public void setNext(PolyNode _next)
	{
		this.next = _next;
	}
	public int getCoefficient()
	{
		return coefficient;
	}
	public int getExponent()
	{
		return exponent;
	}
	public PolyNode getNext()
	{
		return next;
	}
	
		
}	


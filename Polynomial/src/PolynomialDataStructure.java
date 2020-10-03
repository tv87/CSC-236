
public class PolynomialDataStructure implements PolynomialADT
{	
	private PolyNode firstNode; 
	
	public PolynomialDataStructure()
	{
		firstNode = null;
	}
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	public void setFirstNode(PolyNode firstNode)
	{
		this.firstNode = firstNode;
	}
	public PolyNode getFirstNode()
	{
		return firstNode;
	}
	public void addPolyNodeFirst(int coef, int expo)
	{
		if(isEmpty())
			firstNode = new PolyNode(coef, expo, null);
		else
			firstNode = new PolyNode(coef, expo, firstNode);			
	}
	public void addPolyNodeLast(int coef, int expo) 
	{
		if(isEmpty())
			firstNode = new PolyNode(coef, expo, null);
		else
		{
			PolyNode current = firstNode;
			while(current.getNext() != null)
				current = current.getNext();
			
			current.setNext(new PolyNode(coef, expo, null));
		}
	}
	public void addPolyNode(PolyNode p)
	{
		addPolyNodeLast(p.getCoefficient(), p.getExponent());
	}
	public void addPolynomials(PolynomialDataStructure one,PolynomialDataStructure two )
	{
		int newCoef = 0;
		PolynomialDataStructure p = new PolynomialDataStructure();
		PolyNode p1 =  new PolyNode(one.firstNode);
				
		PolyNode p2 =  new PolyNode(two.firstNode);
		while(p1 != null || p2 != null)
		{
		
		
		while(p1.getExponent() != p2.getExponent())
		{
			if(p1.getExponent() > p2.getExponent())
			{
				p.addPolyNodeFirst(p1.getCoefficient(),p1.getExponent());
				p1 = p1.getNext();
			}
			else
			{
			p.addPolyNodeFirst(p2.getCoefficient(),p2.getExponent());
			p2 = p2.getNext();
			}
		}
		
		
		if(p1.getExponent() == p2.getExponent())
		{
			newCoef = p1.getCoefficient() + p2.getCoefficient();
			p.addPolyNodeFirst(newCoef,p1.getExponent());
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		
		
		}
		System.out.println(p);
	}
	@Override public String toString()
	{
		if(isEmpty())
			return "Empty";
		else 
		{
			String s = "";
			PolyNode current = firstNode;
			while(current != null)
			{
				s = s + current.getCoefficient() + "x" 
						+ " ^" + current.getExponent();
			}
			return s;
				
		}
	}
}

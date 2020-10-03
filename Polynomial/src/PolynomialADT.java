
public interface PolynomialADT
{	
	public boolean isEmpty();
	public void setFirstNode(PolyNode firstNode);
	public PolyNode getFirstNode();
	public void addPolyNodeFirst(int coef, int expo);
	public void addPolyNodeLast(int coef, int expo);
	public void addPolyNode(PolyNode p);
	public void addPolynomials(PolynomialDataStructure one,PolynomialDataStructure two);
	public String toString();
}

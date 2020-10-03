
public class PolynomialDemo
{
	public static void main(String [] args)
	{
		PolynomialDataStructure p = new PolynomialDataStructure();
		PolynomialDataStructure p1 = new PolynomialDataStructure();
		PolynomialDataStructure p2 = new PolynomialDataStructure();
		PolynomialDataStructure p3 = new PolynomialDataStructure();
		PolynomialDataStructure p4 = new PolynomialDataStructure();
		
		p1.addPolyNodeLast(4, 3);
		p1.addPolyNodeLast(3, 2);
		p1.addPolyNodeLast(-5, 0);
		
		p2.addPolyNodeLast(3, 5);
		p2.addPolyNodeLast(4, 4);
		p2.addPolyNodeLast(1, 3);
		p2.addPolyNodeLast(-4, 2);
		p2.addPolyNodeLast(4, 1);
		p2.addPolyNodeLast(2, 0);
		
		p3.addPolyNodeLast(-5, 0);
		p3.addPolyNodeLast(3, 2);
		p3.addPolyNodeLast(4, 3);
		
		p4.addPolyNodeLast(-4, 0);
		p4.addPolyNodeLast(4, 3);
		p4.addPolyNodeLast(5, 4);
		
		System.out.println("p1 = " + p1.toString());
		System.out.println("p2 = " + p2.toString());
		System.out.println("p3 = " + p3.toString());
		System.out.println("p4 = " + p4.toString() + "\n");
		
		p.addPolynomials(p1, p2);
		p.addPolynomials(p3, p4);
		
		System.out.println("Sum of p1 and p2 = " + p.toString());
		System.out.println("Sum of p3 and p4 = " + p.toString());
		
	}

}

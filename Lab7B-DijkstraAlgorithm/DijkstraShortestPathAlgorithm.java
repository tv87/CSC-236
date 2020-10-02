// Tej Vyas
// CSC 236

import java.util.InputMismatchException;
import java.util.Scanner;

public class DijkstraShortestPathAlgorithm
{
	private boolean settled[];
	private boolean unsettled[];
	private int distances[];
	private int adjacencyMatrix[][];
	private int numOfVertex;
	public DijkstraShortestPathAlgorithm(int numberOfVertices)
	{
		this.numOfVertex = numberOfVertices;
		this.settled = new boolean[numberOfVertices + 1];
		this.unsettled = new boolean[numberOfVertices + 1];
		this.distances = new int[numberOfVertices + 1];
		this.adjacencyMatrix = new int[numberOfVertices + 1][numberOfVertices + 1];
	}
	public void dijkstraShortestPath(int source, int adjacencymatrix[][])
	{
		int currentNode;

		for (int vertex = 1; vertex <= numOfVertex; vertex++)
			distances[vertex] = Integer.MAX_VALUE;
		for (int sourcevertex = 1; sourcevertex <= numOfVertex; sourcevertex++)
			for (int destinationvertex = 1; destinationvertex <= numOfVertex; destinationvertex++)
				this.adjacencyMatrix[sourcevertex][destinationvertex] = adjacencymatrix[sourcevertex][destinationvertex];
		unsettled[source] = true;
		distances[source] = 0;
		while (getUnsettledCount(unsettled) != 0) {
			currentNode = getNodeWithMinimumDistanceFromUnsettled(unsettled);
			unsettled[currentNode] = false;
			settled[currentNode] = true;
			evaluateNeighbours(currentNode);
		}
	}
	public int getUnsettledCount(boolean unsettled[])
	{
		int count = 0;
		for (int vertex = 1; vertex <= numOfVertex; vertex++)
			if (unsettled[vertex] == true)
				count++;
		return count;
	}
	public int getNodeWithMinimumDistanceFromUnsettled(boolean unsettled[])
	{
		int min = Integer.MAX_VALUE;
		int node = 0;
		for (int vertex = 1; vertex <= numOfVertex; vertex++)
		{
			if (unsettled[vertex] == true && distances[vertex] < min)
			{
				node = vertex;
				min = distances[vertex];
			}
		}
		return node;
	}
	public void evaluateNeighbours(int evaluationNode)
	{
		int edgeDistance = -1;
		int newDistance = -1;
		for (int destinationNode = 1; destinationNode <= numOfVertex; destinationNode++)
			if (settled[destinationNode] == false)
				if (adjacencyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE)
				{
					edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];
					newDistance = distances[evaluationNode] + edgeDistance;
					if (newDistance < distances[destinationNode])
						distances[destinationNode] = newDistance;
					unsettled[destinationNode] = true;
				}
	}
	public static void main(String... arg){
		int adjacency_matrix[][];
		int number_of_vertices;
		int source = 0;
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of vertices");
			number_of_vertices = scan.nextInt();
			adjacency_matrix = new int[number_of_vertices + 1][number_of_vertices + 1];
			System.out.println("Enter the Weighted Matrix for the graph");
			for (int i = 1; i <= number_of_vertices; i++)
			{
				for (int j = 1; j <= number_of_vertices; j++)
				{
					adjacency_matrix[i][j] = scan.nextInt();
					if (i == j)
					{
						adjacency_matrix[i][j] = 0;
						continue;
					}
					if (adjacency_matrix[i][j] == 0)
					{
						adjacency_matrix[i][j] = Integer.MAX_VALUE;
					}
				}
			}

			System.out.println("Enter the source ");
			source = scan.nextInt();

			DijkstraShortestPathAlgorithm dijkstrasAlgorithm = new DijkstraShortestPathAlgorithm(number_of_vertices);
			dijkstrasAlgorithm.dijkstraShortestPath(source, adjacency_matrix);

			System.out.println("The Shorted Path to all nodes are ");
			for (int i = 1; i <= dijkstrasAlgorithm.distances.length - 1; i++)
			{
				System.out.println(source + " to " + i + " is "+ dijkstrasAlgorithm.distances[i]);
			}
		}
		catch (InputMismatchException inputMismatch)
		{
			System.out.println("Wrong Input Format");
		}
		scan.close();
	}
}

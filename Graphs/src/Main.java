
public class Main {

	public static void main(String[] args) {

		System.out.println("*********************** Non-directed Graph *******************");
// non-directed graph
		Graph graph = new Graph();
		graph.addVertex('A');//0
		graph.addVertex('B');//1
		graph.addVertex('C');//2
		graph.addVertex('D');//3
		graph.addVertex('E');//4
		graph.addVertex('F');//5
		
		
		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,2);
		graph.addEdge(3,4);
		graph.addEdge(3,5);

//		
		
	
		

		graph.addEdge(1,3);
		graph.addEdge(5,6);
//		graph.addEdge(9,12);
		
		
		char searchVertex = 'A'; //starting point of traversal
		
		
		
//		System.out.println("\nDepth First Search from "+ searchVertex);
//		graph.DSF(searchVertex);
//		System.out.println("\nBreadth First Search from "+ searchVertex);
//		graph.BFS(searchVertex);
		System.out.println("\nMinimum spanning tree from "+ searchVertex);
		graph.MST(searchVertex);
//		
		
		
/*------------- end of non-directed graph*/
		
		System.out.println("\n\n*********************** Directed Graph *******************");
		DirectedGraph DGraph = new DirectedGraph();
		
		DGraph.addVertex('A');
		DGraph.addVertex('B');
		DGraph.addVertex('C');
		DGraph.addVertex('D');
		DGraph.addVertex('E');
		DGraph.addVertex('F');
		DGraph.addVertex('G');
		DGraph.addVertex('H');
		
		DGraph.addEdge(0,3);
		DGraph.addEdge(0,4);
		DGraph.addEdge(1,4);
		DGraph.addEdge(2,5);
		DGraph.addEdge(3,6);
		DGraph.addEdge(4,6);
		DGraph.addEdge(5,7);
		DGraph.addEdge(6,7);
		DGraph.addEdge(5,1); 
//		DGraph.addEdge(1,2); //creating a cycle not accepted
		
		
		
		DGraph.DFS('B');
		System.out.println("\nTopological order...");
		DGraph.doTopo(); //topological order
		
		
		
	}

}

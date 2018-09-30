
//a none directed graph

public class Graph {
	private final int maxVertices = 20;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int nVertices;
	private Queue queue = new Queue(maxVertices); //create an empty queue for BSF
	private Stack stack = new Stack(maxVertices); //create an empty stack for DFS
	
	public Graph() {
		vertexList = new Vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		nVertices = 0;
		
		//initiate matrix to zeros, no connections yet
		for(int i=0;i<maxVertices;i++)
			for(int j=0;j<maxVertices;j++)
				adjMatrix[i][j] = 0;
	}
	
	public void showMatrix() {
		for(int i=0;i<nVertices;i++) {
			for(int j=0;j<nVertices;j++)
				System.out.print(adjMatrix[i][j]+" ");
		System.out.println("");
		}
	}
	public void addVertex(char c) {
		vertexList[nVertices++] = new Vertex(c);
	}
	public void displayVertexList() {
		for(int i=0;i<nVertices;i++)
			System.out.print(" "+vertexList[i].label);
		System.out.println();
	}
	public void addEdge(int from, int to) {
		adjMatrix[from][to] = 1;
		adjMatrix[to][from] = 1;
	}
	public void deleteVertex(char c) {
		int currentVertex = getIndex(c);		
		
		if(currentVertex == -1) {
			System.out.println("Vertex '" + c + "' was not found in graph");
		}
		else
		{
			//delete from vertex list
			for(int i=currentVertex; i<nVertices;i++) {
				//in the vertex list
				vertexList[i] = vertexList[i+1];				
			}
			
			
			//in adjacency matrix move rows up
			for(int row=currentVertex;row<nVertices;row++)
				for(int j=0;j<nVertices;j++)
					adjMatrix[row][j] = adjMatrix[row+1][j];
			
			//in adjacency matrix move cols left
			for(int i=0;i<nVertices;i++)
				for(int cols=currentVertex;cols<nVertices;cols++)
					adjMatrix[i][cols] = adjMatrix[i][cols+1];
			
			nVertices -= 1; //reduce number of vertices by one
			 
			resetVertices();
			
		}
		
	}
	
	private void displayVertex(int v) {
		System.out.print(vertexList[v].label+" ");
	}
	
	public void displayEdges() {
		for(int i=0;i<nVertices;i++)
			for(int j=0;j<nVertices;j++) {
				if(adjMatrix[i][j]==1) {
					displayVertex(i);
					displayVertex(j);
					System.out.println("");
				}
			}
	}
	
	private int getIndex(char c) {
		//search for the vertex index
		for(int k=0;k<nVertices;k++) {
			if(vertexList[k].label == c)
				return k; //was found
		}
		return -1; //not found
		
				
	}
	
	private void resetVertices() {
		for(int i=0;i<nVertices;i++)
			vertexList[i].wasVisited = false;
	}
	
	private void getAdjVertices(int v) {
		for(int i=0;i<nVertices;i++) {
			if(adjMatrix[v][i]==1 && vertexList[i].wasVisited==false) {
				queue.insert(i);
				vertexList[i].wasVisited = true;
			}
			
		}
	}
	
	public void BFS(char c) {//Breadth first search
		int currentVertex = getIndex(c);
		
		
		if(currentVertex == -1) {
			System.out.println("Vertex '" + c + "' was not found in graph");
		}
		else {
			
			vertexList[currentVertex].wasVisited = true;
			queue.insert(currentVertex);
			
			while(!queue.isEmpty()) {
				currentVertex = queue.remove();				
				displayVertex(currentVertex);
				getAdjVertices(currentVertex);
			}
			
		}
		
		resetVertices();
		
	}
	
	private int getNextVertex(int v) {
		for(int i=0;i<nVertices;i++) {
			if(adjMatrix[v][i] == 1 && vertexList[i].wasVisited==false) 
				return i; //return the index of the adjacent vertex							
			
		}
		return -1; //no adjacent vertex found
		
	}
	
	public void DSF(char c) { //depth first search
		int currentVertex = getIndex(c);
		
		if(currentVertex == -1) {
			System.out.println("Vertex '" + c + "' was not found in graph");
		}
		else {
			
			stack.push(currentVertex);
			vertexList[currentVertex].wasVisited = true; //mark it as visited			
			currentVertex = getNextVertex(currentVertex);
			
			while(true) {
				
				if(currentVertex == -1) { //no adjacent vertex
					displayVertex(stack.pop());	
					if(stack.isEmpty())
						break;
					currentVertex = stack.peek();
					currentVertex = getNextVertex(currentVertex);
				}
				else {
						
						stack.push(currentVertex); //store the new adjacent vertex
						vertexList[currentVertex].wasVisited = true;
						currentVertex = getNextVertex(currentVertex);
				}
					
			}
			resetVertices();
		}
	}
		
		
	public void MST(char c) { //minimum spanning tree
		int current = getIndex(c);
		int next;
		
		if(current == -1) {
			System.out.println("Vertex '" + c + "' was not found in graph");
		}
		else {
			stack.push(current);
			vertexList[current].wasVisited = true;
			
			while(!stack.isEmpty()) {
				next = getNextVertex(current);
				if(next == -1) {// no adjacent vertex found					
					
					
										
					current= stack.peek();
					stack.pop();
//					displayVertex(current);
					System.out.print(" ");				
					}
				else {
					
					vertexList[next].wasVisited = true;
					displayVertex(stack.peek());
					displayVertex(next);
					stack.push(next);
					current = next;
					
				}
			}
			
					
			}
			resetVertices();
		
	}
		
		
		
	

}

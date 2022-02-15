public class UndirectedGraph {
//  Implementing Undirected graph using adjacency matrix.
    int [][]adjMatrix;

    public UndirectedGraph(int nodes) {
        this.adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }

    public static void main(String[] args) {
        UndirectedGraph g=new UndirectedGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
    }
}

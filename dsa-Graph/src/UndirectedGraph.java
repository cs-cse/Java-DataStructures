public class UndirectedGraph {
//  Implementing Undirected graph using adjacency matrix.
    private int [][]adjMatrix;
    private int v;
    private int e;
    public UndirectedGraph(int nodes) {
        this.v=nodes;
        this.e=0;
        this.adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(v+" vertices"+ e + " edges"+"\n");
        for(int a=0;a<v;a++){
            sb.append(a+": ");
            for(int w:adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UndirectedGraph g=new UndirectedGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}

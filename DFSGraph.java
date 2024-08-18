import java.util.*;

public class DFSGraph{
    static class edge{
        int src;
        int dest;
        edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,3));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,3));
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean visited[]){
        System.out.print(curr);
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(visited[e.dest]==false){
                dfs(graph,e.dest,visited);
            }
        }
    }
	public static void main(String[] args) {
		int v=4;
		boolean visited[]=new boolean[v];
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
		dfs(graph,0,visited);
	}
}
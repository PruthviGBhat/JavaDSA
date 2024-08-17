import java.util.*;


public class CycleInGraphUndirected{
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
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,3));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,3));
    }
    public static boolean iscycle(ArrayList<edge> graph[],int curr,int parent,boolean visited[]){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(visited[e.dest]==true && e.dest != parent){
                return true;
            }else if(visited[e.dest]==false){
                if(iscycle(graph,e.dest,curr,visited))
                    return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int v=4;
		boolean visited[] = new boolean[v];
		int parent=-1;
		int curr=0;
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
		System.out.print(iscycle(graph,curr,parent,visited));
	}
}
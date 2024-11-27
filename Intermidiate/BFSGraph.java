import java.util.*;
import java.util.LinkedList;

public class BFSGraph{
    static class edge{
        int dest;
        int src;
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
        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,3));
    }
    public static void bfs(ArrayList<edge> graph[],int v){
        Queue<Integer> q = new LinkedList();
        boolean visited[] = new boolean[v];
        q.add(0);
        while(q.size()>0){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int j=0;j<graph[curr].size();j++){
                    edge e = graph[curr].get(j);
                    q.add(e.dest);
                }
                
            }
        }
    }
	public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        bfs(graph,v);
	}
}
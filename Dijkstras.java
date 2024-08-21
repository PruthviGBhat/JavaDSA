import java.util.*;

public class Dijkstras{
	static class edge {
		int src;
		int dest;
		int wt;
		edge(int src,int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	static class Pair implements Comparable<Pair> {
		int node;
		int distance;
		public Pair(int node, int distance) {
			this.node = node;
			this.distance = distance;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.distance - p2.distance;
		}
	}
	public static void creategraph(ArrayList<edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<edge>();
		}
		graph[0].add(new edge(0,1,2));
		graph[0].add(new edge(0,2,3));
		graph[1].add(new edge(1,3,4));
		graph[1].add(new edge(1,2,3));
		graph[1].add(new edge(1,0,2));
		graph[2].add(new edge(2,2,3));
		graph[2].add(new edge(2,0,3));
		graph[2].add(new edge(2,3,1));
	}
	public static void dijkstra(ArrayList<edge> graph[],int src){
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
	    boolean visited[] = new boolean[graph.length];
	    int dist[] = new int[graph.length];
	    for(int i=0;i<graph.length;i++){
	        if(i!=src){
	            dist[i]=Integer.MAX_VALUE;
	        }
	    }
	    pq.add(new Pair(0,0));
	    while(pq.size()>0){
	        Pair curr = pq.remove();
	        if(!visited[curr.node]){
	            visited[curr.node]=true;
	            for(int j=0;j<graph[curr.node].size();j++){
	                edge e = graph[curr.node].get(j);
	                int u = e.src;
	                int v = e.dest;
	                if(dist[u]+e.wt<dist[v]){
	                    dist[v]=dist[u]+e.wt;
	                    pq.add(new Pair(v, dist[v]));
	                }
	            }
	        }     
	    }
	    for(int i=0;i<graph.length;i++){
	        System.out.print(dist[i]+", ");
	    }
	    
	} 
	public static void main(String[] args) {
		int v=4;
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
		int src=0;
		dijkstra(graph,src);
	}
}
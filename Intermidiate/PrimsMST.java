package Intermidiate;
import java.util.*;

public class PrimsMST {
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
	public static void creategraph(ArrayList<edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i]=new ArrayList<edge>();
		}
		graph[0].add(new edge(0, 1, 10));
		graph[0].add(new edge(0, 2, 15));
		graph[0].add(new edge(0, 3, 30));
		graph[1].add(new edge(1, 0, 10));
		graph[1].add(new edge(1, 3, 40));
		graph[2].add(new edge(2, 0, 15));
		graph[2].add(new edge(2, 3, 50));
		graph[3].add(new edge(3, 1, 40));
		graph[3].add(new edge(3, 2, 50));
	}
	static class pair implements Comparable<pair> {
		int node;
		int cost;
		pair(int node,int cost) {
			this.node=node;
			this.cost=cost;
		}
		@Override
		public int compareTo(pair p2) {
			return this.cost-p2.cost;
		}
	}
	public static void prims(ArrayList<edge> graph[], int v) {
    PriorityQueue<pair> pq = new PriorityQueue<>();
    boolean visited[] = new boolean[v];
    pq.add(new pair(0, 0));
    int mstcost = 0;
    while (pq.size() > 0) {
        pair curr = pq.remove();
        if (visited[curr.node]) {
            continue;
        }
        visited[curr.node] = true;
        mstcost = mstcost + curr.cost;
        for (int i = 0; i < graph[curr.node].size(); i++) {
            edge e = graph[curr.node].get(i);
            if (!visited[e.dest]) {
                pq.add(new pair(e.dest, e.wt));
            }
        }
    }
    System.out.println(mstcost);
}
	public static void main(String[] args) {
		int v=4;
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
		prims(graph,v);
	}
}

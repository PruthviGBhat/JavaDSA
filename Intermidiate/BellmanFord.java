import java.util.*;

public class BellmanFord{
    static class edge{
        int src;
        int dest;
        int wt;
        edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));
        graph[1].add(new edge(1,2,-2));
        graph[1].add(new edge(1,3,2));
        graph[2].add(new edge(2,3,-1));
    }
    public static void bellmanford(ArrayList<edge> graph[],int src,int v){
        int dist[]=new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int j=0;j<v-1;j++){
            for(int k=0;k<v;k++){
                for(int l=0;l<graph[k].size();l++){
                    edge e = graph[k].get(l);
                    int u = e.src;
                    int v2= e.dest;
                    if(dist[u]!= Integer.MAX_VALUE && dist[u]+e.wt<dist[v2]){
                        dist[v2]=dist[u]+e.wt;
                    }
                }
            }
        }
        for(int n=0;n<v;n++){
            System.out.print(dist[n]+" ");
        }
    }
	public static void main(String[] args) {
		int v=4;
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
		int src=0;
		bellmanford(graph,src,v);
	}
}

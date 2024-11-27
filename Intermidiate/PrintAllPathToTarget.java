package Intermidiate;
import java.util.*;

public class PrintAllPathToTarget{
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
    public static void printAllPath(ArrayList<edge> graph[],int source,int target,boolean visited[],String path){
        if(source==target){
            System.out.println(path+" ");
            return;
        }
        for(int i=0;i<graph[source].size();i++){
            edge e = graph[source].get(i);
            if(visited[e.dest]==false){
                visited[source]=true;
                printAllPath(graph,e.dest,target,visited,path+e.dest);
                visited[source]=false;
            }
        }
    }
	public static void main(String[] args) {
		int v=4;
		int source=0,target=3;
		boolean visited[]=new boolean[v];
		String path="0";
		ArrayList<edge> graph[] = new ArrayList[v];
		creategraph(graph);
        printAllPath(graph,source,target,visited,path);
	}
}
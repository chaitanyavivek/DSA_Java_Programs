import java.util.*;
import java.util.ArrayList;
public class TopologicSort {
static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
	adj.get(u).add(v);
}
static void topoSort(ArrayList<ArrayList<Integer>>adj,int V){
	int in_degree[]=new int[V];
	for(int u=0;u<V;u++){  //1st we maintain all the indegree of vertex in in degree array
		for(int x:adj.get(u))//we add to queue whose indegree are zero while we are enqueuing from the queue we dec the 
			in_degree[x]++;//count of indegree of the enqueuing adj vertexes.so when the indegree becomes zero we add
		}              //to queue again and we enqueue it and print them
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<V;i++)
			if(in_degree[i]==0)
				q.add(i);
		while(q.isEmpty()==false){
			int u=q.poll();
			System.out.println(u+" ");
			for(int x:adj.get(u))
				if(--in_degree[x]==0)
					q.add(x);
		}
			
	}
public static void main(String args[]){
	int V=5;
	ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
	for(int i=0;i<V;i++)
		adj.add(new ArrayList<Integer>());
	addEdge(adj,0, 2); 
    addEdge(adj,0, 3); 
    addEdge(adj,1, 3); 
    addEdge(adj,1, 4);
    addEdge(adj,2, 3);
	
	System.out.println("Following is a Topological Sort of"); 
    topoSort(adj,V);
}
}

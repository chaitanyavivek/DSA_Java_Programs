import java.util.*;
import java.ArrayList;
public class DFSDisconnect {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void DFS(ArrayList<ArrayList<Integer>>adj,int V){
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
			visited[i]=false;//same like before here they are disconnected so we go to non visited nodes we call 
		for(int i=0;i<V;i++){ //dfsRec and we make them visited.
			if(visited[i]==false)
				DFSRec(adj,i,visited);
			
		}
	}
	static void DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[]){
		visited[s]=true;
		System.out.println(s+" ");
		for(int u:adj.get(s)){
			if(visited[u]==false)
				DFSRec(adj,u,visited);
		}
	}
	public static void main(String args[]){
		int V=5;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,3,4);

		System.out.println("Following is DFSDisconnect:"); 
	    DFS(adj,V);
	
	}

}

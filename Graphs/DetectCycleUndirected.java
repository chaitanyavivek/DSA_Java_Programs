import java.util.*;
import java.util.ArrayList;
public class DetectCycleUndirected {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
		adj.get(u).add(v);
		adj.get(v).add(u);	
	}
	static boolean DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[],int parent){
		visited[s]=true;
		for(int u:adj.get(s)){//we follow DFS we mark it as visited and check for adjaccent nodes if they are not visited
			if(visited[u]==false){//we call dfsrec and mark as visited
				if(DFSRec(adj,u,visited,s)==true)
				{
					return true;
				}
			}
			else if(u!=parent){//this parent is to stop repetition of same vertex
				return true; //
			}
			return false;		
		}

	static boolean DFS(ArrayList<ArrayList<Integer>>adj,int V){
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
			visited[i]=false;
		for(int i=0;i<V;i++){
			if(visited[i]=false)
				if(DFSRec(adj,i,visited,-1)==true)
					return true;
	}
	return false;
	}
	public static void main(String args[]){
		int V=6;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1); 
    	addEdge(adj,1,2);
    	addEdge(adj,2,4); 
    	addEdge(adj,4,5);
    	addEdge(adj,1,3);
    	addEdge(adj,2,3);
    	if(DFS(adj,V)==true)
    		System.out.println("cycle found");
    	else
    		System.out.println("No cycle found");
	}
	
		
	}

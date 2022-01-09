import java.util.*;
import java.ArrayList;
public class BFSGraph {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
		adj.get(u).add(v);//1st we create arrayList we add u and v and next we create boolean array and make them false
		adj.get(v).add(u);//and when ever we visited we change them to true now the process is same like tree level order
	}//we create a queue and add root to it and mark it as visited..and remove root and enqueue its children like this
	static void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s){  // we print in level order traversal
		boolean visited[]=new boolean[V];  //s means source vertex i.e top of the bfs(1st node)
		for(int i=0;i<V;i++)
			visited[i]=false;
		Queue<Integer>q=new LinkedList<>();
		visited[s]=true;
		q.add(s);
		while(q.isEmpty()==false){
			int u=q.poll();
			System.out.println(u+" ");
			for(int v:adj.get(u)){   //this code is when we take source vertex we need adj of souce vertex
				if(visited[v]==false){ //i.e nodes which are connected to v
					visited[v]=true;
			        q.add(v);
		}		
	}
}
	}
	public static void main(String args[]){
		int V=5;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1); 
    	addEdge(adj,0,2);
    	addEdge(adj,0,1); 
    	addEdge(adj,1,2);
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4); 
    	addEdge(adj,2,4);
    	System.out.println("Following is Breadth first traversal");
    	BFS(adj,V,0);
    	
		}
	}
	

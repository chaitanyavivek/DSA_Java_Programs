import java.util.*;
import java.ArrayList;//end of problem ther is one more question
public class BFSDisconnect {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
		adj.get(u).add(v);//this is same like BFS graph but here graph is fisconnected and we do not have source so the
		adj.get(v).add(u);//code is same like before but here we add BFS Discon for disconnected part
	}
	static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[]){  
		Queue<Integer>q=new LinkedList<>();//here we boolean visited array as argument instead seperately giving
		visited[s]=true;
		q.add(s);
		while(q.isEmpty()==false){
			int u=q.poll();
			System.out.println(u+" ");
			for(int v:adj.get(u)){   
				if(visited[v]==false){ 
					visited[v]=true;
			        q.add(v);
		}		
	}
}
	}
static void BFSDis(ArrayList<ArrayList<Integer>>adj,int V){
	boolean visited[]=new boolean[V];//this is for disconnectd graph part here we call BFS methjod
	for(int i=0;i<V;i++)
		visited[i]=false;
	for(int i=0;i<V;i++){
		if(visited[i]==false)
			BFS(adj,i,visited);	
}
}
public static void main(String args[]){
	int V=7;
	ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
	for(int i=0;i<V;i++)
		adj.add(new ArrayList<Integer>());
	addEdge(adj,0,1); 
	addEdge(adj,0,2);
	addEdge(adj,1,2);
	addEdge(adj,2,3); 
	addEdge(adj,1,3);
	addEdge(adj,3,4); 
	addEdge(adj,2,4);
	System.out.println("Following is Breadth first traversal");
	BFSDis(adj,V);
	}
	}
//imp problem to find no of conncted islands or no of components in graph
/*static int BFSDis(ArrayList<ArrayList<Integer>>adj,int V){
	boolean visited[]=new boolean[V];//this is for disconnectd graph part here we call BFS methjod
	int count=0;
	for(int i=0;i<V;i++)        same as above code but here we give int type as to return count instead of void
		visited[i]=false;         and initiliase count variable and icrease count++
	for(int i=0;i<V;i++){       FAMOUS PROBLEM FOR CONNECTED ISLANDS AND COMPONENTS IN GRAPH
		if(visited[i]==false){
			BFS(adj,i,visited);	
			count++;
}
	}
		return count;
} */
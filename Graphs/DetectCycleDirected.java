import java.util.*;
import java.util.ArrayList;
public class DetectCycleDirected {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
		adj.get(u).add(v);
		
	}
	static void detectCyDirect(ArrayList<ArrayList<Integer>>adj,int V){
		int in_degree[]=new int[V];
		for(int u=0;u<V;u++){//same like toplogical sort but here we maintain count and when we dequeue a item we dec
			for(int x:adj.get(u))//in vertex and increase count so when there and no vertex with 0 indegree and nothing
				in_degree[x]++;//to add in queue we say cycle exists else if count=V cyc does not exists
		}
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<V;i++)
			if(in_degree[i]==0)
				q.add(i);
			int count=0;
			while(q.isEmpty()==false){
				int u=q.poll();
				for(int x:adj.get(u))
					if(--in_degree[x]==0)
						q.add(x);
				count++;
			}
			if(count!=V){
				System.out.println("cycle exists in graph");
			}
			else{
				System.out.println("No cycle in graph");
			}
		}
				
		public static void main(String args[]){
			int V=5;
			ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
			for(int i=0;i<V;i++)
				adj.add(new ArrayList<Integer>());
			addEdge(adj,0,1);
			addEdge(adj,4, 1); 
            addEdge(adj,1, 2); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 1);
            detectCyDirect(adj,V);		
		}		
}
	



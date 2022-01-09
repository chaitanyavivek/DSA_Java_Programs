import java.util.*;
class MyHash {   //IMPLEMENTATION OF CHAINING
int Bucket;  //here when we find collision we use linked list.when the collision is happend at 
ArrayList<LinkedList<Integer>>table;  //particular index then if we want to insert index there we 
MyHash(int b ){              //write side of it which is called Linkedlist
	Bucket=b;
	table=new ArrayList<LinkedList<Integer>>();
	for(int i=0;i<b;i++)
		table.add(new LinkedList<Integer>());
}
void insert(Integer k){
	int i =k%Bucket;
	table.get(i).add(k);	
}
Boolean search(Integer k){
	int i=k%Bucket;
	return table.get(i).contains(k);
}
void delete(Integer k){
	int i =k%Bucket;
	table.get(i).remove(k);	
}
}
class Chaining{
	public static void main(String args[]){
		MyHash mh=new MyHash(7);
		mh.insert(10);
		mh.insert(20);
		mh.insert(15);
		mh.insert(7);
		System.out.println(mh.search(10));
		mh.delete(15);
		System.out.println(mh.search(15));
	}
}



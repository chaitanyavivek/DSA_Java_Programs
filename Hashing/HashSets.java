import java.util.*;
public class HashSets {
public static void main(String args[]){
	HashSets<String>h=new HashSets<String>();
	h.add("vivek");
	h.add("ramya");
	h.add("sekhar");
	h.add("sujatha");
	System.out.println(h.size()); //4
	System.out.println(h.contains("vivek")); //true
	h.remove("vivek");
	System.out.println(h.size()); //3
	Iterator<String> i=h.iterator();
	while(i.hasNext()){
		System.out.println(i.next()+" ");
		}
	//ITERATING USING FOR EACH LOOP
	for(String s:h){
		System.out.println(s+" ");// vivek ramya sekhar sujatha
	}
}
}

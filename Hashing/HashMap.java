import java.util.Map;
import java.util.*;
public class HashMap {
	public static void main(String args[]){
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("vivek",9603);
		map.put("sekhar",9866);
		map.put("ramya",9492);
	
	 for(Map.Entry<String,Integer>ob:map.entrySet())
	 System.out.println("Key = " + ob.getKey() + " value : " + ob.getValue());
	 
	}// this is method for iterating in hashmap

}// key= vivek value:9603 outputs
  //key= sekhar value:9866
  //key=ramya value:9492
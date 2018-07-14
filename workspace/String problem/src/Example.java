import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
	  
	String[] records = new String[4];	
	
	records[0] = "A,IT,1000";
	records[1] = "B,COMP,2000";
	records[2] = "C,IT,3000";
	records[3] = "D,COMP,1000";
		
	String words1[] = records[0].split(",");
	String words2[] = records[1].split(",");
	String words3[] = records[2].split(",");
	String words4[] = records[3].split(",");
	
	HashMap<String,Integer> map = new HashMap<>();
	
	int val = Integer.parseInt(words1[2]);
	String key = words1[1];
	map.put(key, val);
	
	
	
	
	
	}
	
	
}

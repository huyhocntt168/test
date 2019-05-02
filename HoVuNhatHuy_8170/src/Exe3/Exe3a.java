package Exe3;
import java.util.*;


public class Exe3a {

	public static void main(String[] arg) {
		
		List<String> examples = new ArrayList<>(Arrays.asList("a", "b", "c"));
		System.out.println(examples);
		removeItem(examples, "a");
		System.out.println(examples);
	}
	
	public static List<String> removeItem(List<String> input, String deleteItem){
		for(Iterator<String> iterator = input.iterator(); iterator.hasNext();) {	
			String inputItem = iterator.next();
			if(inputItem.equals(deleteItem)){
				iterator.remove();				
			}
		}
		return input;
	}
}
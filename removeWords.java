/*

4) Given: words = ['one', 'one', 'two', 'three', 'three', 'two']

Remove the duplicates.

*/

package Question4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeWords {
	
	public static void main(String[] args) {
		
		String[] words = {"one", "one", "two", "three", "three", "two"};
		Set<String> set = new HashSet<String>(Arrays.asList(words));
		System.out.println(set);
		
	}

}

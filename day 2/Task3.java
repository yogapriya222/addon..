package addon_day2;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class Task3{	
		    public static void main(String[] args) {
		        int[] arr = {2, 3, 4, 4, 5, 8, 2, 3};

		        int[] uniqueArr = removeDuplicates(arr);

		        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
		    }

		    public static int[] removeDuplicates(int[] arr) {
		        LinkedHashSet<Integer> set = new LinkedHashSet<>(); 
		        for (int num : arr) {
		            set.add(num);
		        }
		        return set.stream().mapToInt(Integer::intValue).toArray();
		    }
		}




import java.util.ArrayList;
import java.util.Collections;
public class first {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(12);
        nums.add(15);
        nums.add(27);
        nums.add(35);
        nums.add(11);
        nums.add(9);

        Collections.sort(nums);
        Collections.reverse(nums);

        System.out.println(nums);
    }
}
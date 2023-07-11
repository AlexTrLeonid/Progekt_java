import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class hous9 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,-2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,-4,7));
        // result [6,-6,0,1]
        hous8 task = new hous8();
         Deque<Integer> result = task.sum(d1, d2);
        System.out.println(result);
    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
         while (!d1.isEmpty() || !d2.isEmpty()) { 
            int product = carry;
            if (!d1.isEmpty()) {
                product *= d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                product *= d2.removeFirst();
            }
            result.addLast(product % 10);
            carry = product / 10; 
        }
        if (carry != 0) {
            result.addLast(carry);
        }
        return result;
    }
}

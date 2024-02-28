package hu.webler.condition;

public class WhileExample {

    public static void main(String[] args) {

        int sum = sum(15);
        // System.out.println(sum);
        int sumSzandi = sumWhile(15);
        System.out.println(sumSzandi);
    }

    public static int sum(int sum) {
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumWhile(int sum) {
        int i = 0; // Initializing the variable 'i' as the loop counter
        while (i <= 10) { // While loop condition: execute the loop as long as 'i' is less than or equal to 10 -> while only executes if the condition is ture!
            sum += i; // Add the current value of 'i' to 'sum'
            i++; // Increment 'i' by 1 for the next iteration -> watch out! to avoid infinitive loop!
        }
        return sum; // Return the total sum
    }
}

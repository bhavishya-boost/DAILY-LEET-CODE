public class Solution {
    
    // LeetCode #412 One-Liner Solution
    public static List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i))
                .toList(); // Note: Use .collect(java.util.stream.Collectors.toList()) if on Java 15 or older
    }

    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}
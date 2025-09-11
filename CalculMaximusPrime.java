public class CalculMaximusPrime {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 5);
        System.out.println("Test: 10 + 5 = " + result);
        if (result == 15) {
            System.out.println("✅ Test Passed");
        } else {
            System.out.println("❌ Test Failed");
        }
    }
}

public class JAVA_TEST_0005 {
    public static void main(String[] args) {
        int n = 5;
        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                
                if (j < i) {
                    System.out.print(" ");
                }
                
                currentNumber++;
            }
            
            System.out.println();
        }
    }
}
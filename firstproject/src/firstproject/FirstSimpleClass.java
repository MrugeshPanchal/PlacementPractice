package firstproject;

public class FirstSimpleClass {

    public static void main(String[] args) {
       
        for (int i = 1; i <= 10; i++) {
            System.out.println("Current number: " + i);
            
            if (i == 5) {
                System.out.println("Breaking the loop when i is " + i);
                break;
            }
        }
        
        System.out.println("Loop has been exited.");
    }
}

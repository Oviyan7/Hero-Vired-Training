public class dynamic {
    public static void main(String[] args){
        int n=10;
     int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
} 


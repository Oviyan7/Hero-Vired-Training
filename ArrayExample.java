public class ArrayExample {
    public static void main(String[] args) {

        int[] num1Array=new int[5];
        
        int[] numbers = {12, 4, 5, 2, 5};

       
        System.out.println("First Element: " + numbers[0]); 
        System.out.println("Second Element: " + numbers[1]); 

        
        numbers[1] = 10;
        System.out.println("Modified Second Element: " + numbers[1]);

        
        int arrayLength = numbers.length; 
        System.out.println("Array Length: " + arrayLength); 

    
        System.out.println("Using for Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]); 
        }

        
        System.out.println("Using for-each Loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

     
        int[][] multiArray = {{11, 22, 33}, {44, 55, 66}}; 
        System.out.println("Element at row 0, column 0: " + multiArray[0][0]); 

        
        String[] names = new String[3]; 
        names[0] = "Chaitanya"; 
        names[1] = "Ajeet";   
        names[2] = "Rahul";  

        System.out.println("Name at index 0: " + names[0]); 

    }
}

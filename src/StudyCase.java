public class StudyCase {
    public static void main(String[] args)  {
        // Define integer array with its length
        int[] values = new int[args.length];

        // Iterate variable args and parse it to integer type and store it to values variable
        for (int i = 0; i < args.length; i++) {
            values[i] = Integer.parseInt(args[i]);
        }

        // Call method multiply methode and store the result 
        int num = multiply(values);

        // Call method isEven
        String result = isEven(num);
        System.out.println(num+" - "+result);
        
    };

    public static int multiply(int[] values) {
        int total = 1;
        for (int i = 0; i < values.length; i++) {
            total *=values[i];
        }
        return total;
    };

    public static String isEven(int num) {
        String result;
        
        if (num%2 == 0) {
            result = "Genap";
        } else {
            result = "Ganjil";
        } 

        return result;
        
    }
}

public class functionret {
    static int add(int a, int b){
        int c = a + b;
        return c;
        
    }

    public static void main(String[] args) {
        int first = 5;
        int second = 4;
        int total = add(first, second);
        System.out.println("Addition is " + (total));
    }
}
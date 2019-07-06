public class functionarg {
    static void add(int a, int b){
        System.out.println("Addition is " + (a+b));
    }

    public static void main(String[] args) {
        int first = 5;
        int second = 4;
        add(first, second);
    }
}
package methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(add("Computer", "Science"));
        add(1,2);
        add("hi","there");
        add();
    }

    public static String add(String a, String b) {
        return a + " " + b;
    }
    
    public static int add(int a, int b) {
        return a+b;
    }
    
    public static void add(){
        System.out.println("no inputs");
    }
    
}

public class StringBuilders {

    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(s1.equals(sb1));
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));

        System.out.println(sb1);
        System.out.println(sb2);
    }
}

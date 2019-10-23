public class Strings {


    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hel" + "lo";
        String s5 = "lo";
        String s6 = "Hel" + s5;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1==s6);
        System.out.println(s1.equals(s6));
        System.out.println(s2==s6);
        System.out.println(s2.equals(s6));

    }
}

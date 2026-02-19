package logical;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str1 = "Hello World:,";
        str1.replaceAll("[:,]","");
        System.out.println(str1);

    }
}

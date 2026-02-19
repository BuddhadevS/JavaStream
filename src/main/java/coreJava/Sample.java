package coreJava;

public class Sample {
    public static void main(String[] args) {
        String s = "Buddha dev";
        String s2[] =s.split(" ");
        String s3 = "";
        for(int i=s2.length-1; i>=0; i--){
            s3 = s3+s2[i]+" ";
        }
        System.out.println(s3);
    }
}

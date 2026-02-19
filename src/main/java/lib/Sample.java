package lib;

public class Sample {

        public static void main(String[] args) {

            Sample sample = new Sample();
            System.out.println(sample.hashCode());

            Sample sample2 = new Sample();
            System.out.println(sample2.hashCode());

        }


}

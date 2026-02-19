package coreJava;

public enum Singleton {
    Instance;

    public void doSomething() {
        System.out.println("Singleton instance working");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.Instance;
        Singleton s2 = Singleton.Instance;

        s1.doSomething();

        System.out.println(s1 == s2); // true
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
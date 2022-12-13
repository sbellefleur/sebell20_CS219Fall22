package FinalExamStudy;

public class OOP {
    public class Foo {
        private int x;
        private static int y = 99;
        public Foo(int x) { this.x = x; }
        public void f() { System.out.println(this.x); g("Hi"); }
        public static void g(String s) {
            //f(); // error, can't call non-static method from static context
            System.out.println(s.length());  // OK
            double d = Double.parseDouble("3.14159");
            String t = Integer.toString(-92376);
        }
    }
}

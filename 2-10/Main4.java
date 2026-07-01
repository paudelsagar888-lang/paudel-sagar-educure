public class Main4 {
    public static void main(String[] args) {
        int a = 3; // side1
        int b = 4; // side2
        int c = 6; // side3
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("三角形ではない");
        } else if (a == b && b == c) {
            System.out.println("正三角形");
        } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("直角三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("不等辺三角形");
        }
    }

}

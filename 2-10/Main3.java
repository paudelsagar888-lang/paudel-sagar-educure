public class Main3 {
    public static void main(String[] args) {
        int month = 0;
        if (month <1 || month >12){
            System.out.println("無効な月です");
        } else if (month >=3 && month <=5){
            System.out.println("春");
        } else if (month >=6 && month <=8){
            System.out.println("夏");
        } else{
            System.out.println("秋");
        }
    }
}

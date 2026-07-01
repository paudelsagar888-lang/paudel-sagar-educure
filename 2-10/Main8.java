public class Main8 {
    public static void main(String[] args) {
        int score = 50;
        if (score <0 || score >100){
            System.out.println("F");
        } else {
            score = score/10;

        switch (score){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
            }
        }
    }
}

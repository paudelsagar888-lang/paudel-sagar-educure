public class Main8 {
    public static void main(String[] args) {
        int score = 90;
        if (score >=0 && score <=100)
        score = score/10;
        
        switch (score){
            case 10:
                break;
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
            default:
                System.out.println("E");
                break;
        }
    }
}

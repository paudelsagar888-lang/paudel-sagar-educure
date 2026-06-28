  import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("現在の経験値を入力してください: ");
        String experienceString = scanner.nextLine();
        int level = Integer.parseInt(experienceString);

        double exp = (level * 25 /100) + level;
        int newexp = (int) exp;
        System.out.println("ボーナス後の経験値：" + newexp);
        
        scanner.close();
        
    }
    
}

import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         
        System.out.print("攻撃力を入力してください: ");
        String attackPowerString = scanner.nextLine();
        System.out.print("防御力を入力してください: ");
        String defencePowerString = scanner.nextLine();

        int attackPower = Integer.parseInt(attackPowerString);
        int defencePower = Integer.parseInt(defencePowerString);
        
        int normalDamage = attackPower - defencePower ;
        double criticalDamage = 1.5 * normalDamage;
        int newCriticalDamage= (int) criticalDamage;
        
        System.out.println("通常ダメージ: " + normalDamage);
        System.out.println("クリティカルダメージ：" + newCriticalDamage);
        scanner.close();
    }
}

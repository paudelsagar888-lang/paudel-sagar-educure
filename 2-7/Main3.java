public class Main3 {
    public static void main(String[]args){
        int attackPower = 15;
        int defencePower = 5;
        int damage = (int)(attackPower * 2 - defencePower)/3; // 整数同士で計算すると、小数点以下は切り捨てられる
        System.out.println("与えるダメージ: " + damage);
    }
    
}

public class Main4 {
    public static void main(String[]args){
        int saladPriceper100g = 138;
        double saladWeight = 315.8;

        double saladPrice = saladPriceper100g * saladWeight / 100;
        int saladPriceInt = (int)saladPrice;
        System.out.println("合計金額: " + saladPriceInt + "円です。");

    }
        
}

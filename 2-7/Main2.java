public class Main2 {
    public static void main(String[] args) {
      int priceBeforeDiscount = 2500;
      int discountRate= 20; // 割引率（20%）

      int discountAmount = priceBeforeDiscount * discountRate / 100; // 割引額の計算
      int priceAfterDiscount = priceBeforeDiscount - discountAmount;
      
      System.out.println("割引額: " + discountAmount + "円");
      System.out.println("販売価格: " + priceAfterDiscount + "円");
    }
    
}

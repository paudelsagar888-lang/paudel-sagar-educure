public class Main5 {
    public static void main (String[]args){
       int costofNotebook = 280 * 2 ;
       int costofPencils = 120 * 3 ;
       int costofErasers = 100 * 1 ;

       int TotalCost = costofNotebook + costofPencils + costofErasers ;
       double Tax = (TotalCost * 0.1);
       int roundedTax= (int)Tax;
       int change = 1500 - (TotalCost + roundedTax);

       System.out.println("小計: " + TotalCost + "円");
       System.out.println("消費税: " + roundedTax + "円");
       System.out.println("合計金額: " + (TotalCost + roundedTax) + "円");
       System.out.println("お釣り: " + change + "円");
       

    }
}

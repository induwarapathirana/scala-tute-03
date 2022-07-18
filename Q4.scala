package Tute03 

object Q4 extends App {
    def cost(copy:Int) = price(copy) + shippingCost(copy);

    def price(copy:Int) = 24.95*0.6*copy;
    
    def shippingCost(copy:Int) : Double =
        (if(copy<=50) (3*copy) else ((50*3)+(copy-50)*0.75));

    println("Cost for 60 books: "+cost(60));
}
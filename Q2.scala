package Tute03 

object Q2 extends App {
    def celToFaren (cel:Double) : Double = 
        cel*1.8+32.00;

    var cel = 37.0;
    printf("Celsius %f to Farenheit: "+celToFaren(cel), cel);   
}
package Tute03 

object Q5 extends App {
    def easy (x: Int) = x*8;
    def tempo (x: Int) = x*7;

    println("Total Running Time :"+(easy(2)+tempo(3)+easy(2))+"min(s).");
}
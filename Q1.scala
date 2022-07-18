package Tute03 

object Q1 extends App {
    def areaOfCircle(r:Int) : Double =
        (math.Pi)*(r)*(r);

    printf("Area of a disk with radius %d : " + areaOfCircle(5),5);
}
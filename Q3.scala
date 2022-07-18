package Tute03 

object Q3 extends App {
    def volume (r:Double) = (4.0/3.0)*math.Pi*r*r*r;

    var r1=10.0;
    printf("volume of the sphere  where radius is %f :"+volume(r1),r1);
}
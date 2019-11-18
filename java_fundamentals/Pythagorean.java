import java.lang.Math;
public class Pythagorean {
    int legA;
    int legB;
    double pytha;
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        legA = legA * legA;
        legB = legB * legB;
        pytha = Math.sqrt(legA + legB);
        return pytha;
    }
}
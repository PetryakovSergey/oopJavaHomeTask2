/**
 * Square
 */
public class Square extends Figure {
    private double a;
    
    public Square(double a){
        this.a = a;

    }
    public double P(){
        if(a>0){
            return a*4;
        }
        else return 0;
    }
    public double S(){
        if(a>0){
            return a*a;
        }
        else return 0;
    }
}

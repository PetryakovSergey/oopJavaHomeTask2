public class Rectangle extends Figure {
    private double a;
    private double b;
    public Rectangle(Double a,Double b){
        this.a = a;
        this.b = b;

    }
        
    public double P(){
        if(a>0.0&&b>0.0){
            return (a*2)+(b*2);
        }
        else return 0;
    }
    @Override 
    public double S(){
        if(a>0&&b>0){
            return a*b;
        }
        else return 0;
    }
}


public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;
    

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean exists(){
        
        if(a>0&&b>0&&c>0&&((a+b)>c)&&((a+c)>b) && ((b+c) > a)){
            return true; 
        } else return false;
    }

    @Override
    public double P() {
        
        if(exists()){
            return a+b+c;
        }
        else return 0;
        
    }

    @Override
    public double S() {
        if(exists()){
            double p = P();
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));

        }
        return 0;
    }
}

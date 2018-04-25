package pl.waw.sgh.AbstractTriangles;


public class IsoscelesTriangle extends AbstractTriangles {

    public IsoscelesTriangle(double a, double b) {

        super(a,b);
    }

    @Override
    public double calcSurface() {
        double p = (parA + parB + parC)/2;
        return Math.sqrt(p*(p-parA)*(p-parB)*(p-parC));
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }
}
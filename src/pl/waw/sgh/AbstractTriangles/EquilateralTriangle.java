package pl.waw.sgh.AbstractTriangles;


public class EquilateralTriangle extends AbstractTriangles {

    public EquilateralTriangle(double a) {
        super(a);
    }

    @Override
    public double calcSurface() {
        return parA * parA * Math.sqrt(3) * 0.25;
    }

    @Override
    public String toString() {
        return "My " + super.toString();
    }
}

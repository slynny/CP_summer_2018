package pl.waw.sgh.AbstractTriangles;

public abstract class AbstractTriangles {

    protected Double parA = 0d;
    protected Double parB = 0d;
    protected Double parC = 0d;

    public AbstractTriangles (double a, double b, double c) {

        setTParams(a, b, c);
    }

    public AbstractTriangles (double a) {

        setTEParams(a);
    }


    public void setTParams(double a, double b, double c) {
        parA = a;
        parB = b;
        parC = c;
    }

    public void setTEParams(double a) {
        parA = a;
        parB = a;
        parC = a;
    }

   public abstract double calcSurface();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [parA=" + parA + ", parB=" + parB + ", parC=" + parC + "]";
        //+ super.toString();
    }
}


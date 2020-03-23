package hn.edu.ujcv.progra;

public class OMat2x2{
    private double m11;
    private double m12;
    private double m21;
    private double m22;
    private double alpha;

    public OMat2x2(){}

    public OMat2x2(double m11, double m12,
                   double m21, double m22){
        this.m11 = m11;
        this.m12 = m12;
        this.m21 = m21;
        this.m22 = m22;
    }


    public void setM11(double m11){
        this.m11 = m11;
    }
    public void setM12(double m12){
        this.m12 = m12;
    }
    public void setM21(double m21) {
        this.m21 = m21;
    }
    public void setM22(double m22) {
        this.m22 = m22;
    }
    public void setAlpha(double alpha){
        this.alpha = alpha;
    }
    public double getM11() {
        return m11;
    }
    public double getM12() {
        return m12;
    }
    public double getM21() {
        return m21;
    }
    public double getM22() {
        return m22;
    }
    public double getAlpha(){return alpha;}

    public OMat2x2 transpuesta(){
        return new OMat2x2(this.m22,this.m21,
                this.m12,this.m11);
    }

    public OMat2x2 inversa(){
        return new OMat2x2( (1) / ((m11 * m22) - (m21 * m12)) * m22, (1) / ((m11 * m22) - (m21 * m12)) * -m12,
                (1) / ((m11 * m22) - (m21 * m12)) * -m21, (1) / ((m11 * m22) - (m21 * m12)) * m11);
    }
    public OMat2x2 suma(OMat2x2 b){
        return new OMat2x2(m11+b.m11,m12+b.m12,m21+b.m21,m22+b.m22);
    }

    public OMat2x2 resta(OMat2x2 b){
        return new OMat2x2(m11-b.m11,m12-b.m12,m21-b.m21,m22-b.m22);
    }

    public OMat2x2 mult(OMat2x2 b){

        return new OMat2x2(m11*b.m11 +  m12*b.m21,m11*b.m12 + m12*b.m22,m21*b.m21 + m22*b.m21,m21*b.m12 + m22*b.m22);}

    public double determinante(){
        double c = m11*m22-m12*m21;
        return c;
    }

    public static OMat2x2 rot(double alpha){
        return new OMat2x2(Math.cos(alpha), -Math.sin(alpha), Math.sin(alpha), Math.cos(alpha));
    }

    public static OMat2x2 identidad(OMat2x2 a){
        return new OMat2x2(1,0,0,1);
    }

    public OVecR2 mult2(OVecR2 a){
        //             x                        y
        //  ( a.x * m11 + a.y * m21 , a.x * m12 + a.y * m22)
        //
        return new OVecR2(a.getI()*m11+a.getJ()*m21,a.getI()*m12+a.getJ()*m22);
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "m11=" + getM11() +
                ", m12=" + getM12() +
               "\n"+"\t\t  m21=" + getM21() +
                ", m22=" + getM22() +
                '}';
    }
// constructores



}

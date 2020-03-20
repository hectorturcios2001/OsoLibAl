package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros
    private double alpha;
    private double m11, m12, m13,
                   m21, m22, m23,
                   m31, m32, m33;

    // constructes
    public OMat3x3(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33){
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;

    }
    public OMat3x3(){

    }
    public OMat3x3(double alpha){
        this.alpha = alpha;
    }

    // accesoras y mutadoras
    public double getM11 (){
        return m11;
    }
    public double getM12(){return m12;}
    public double getM13(){return m13;}
    public double getM21(){return m21;}
    public double getM22(){return m22;}
    public double getM23(){return m23;}
    public double getM31(){return m31;}
    public double getM32(){return m32;}
    public double getM33(){return m33;}
    public void setM11(double m11){this.m11 = m11;}
    public void setM12(double m12){this.m12 = m12;}
    public void setM13(double m13){this.m13 = m13;}
    public void setM21(double m21){this.m21 = m21;}
    public void setM22(double m22){this.m22 = m22;}
    public void setM23(double m23){this.m23 = m23;}
    public void setM31(double m31){this.m31 = m31;}
    public void setM32(double m32){this.m32 = m32;}
    public void setM33(double m33){this.m33 = m33;}
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    // metodos

    public OMat3x3 transpuesta(){
        return new OMat3x3(m11,m21,m31,m12,m22,m32,m13,m23,m33);
    }

    public OMat3x3 inversa(){
        return new OMat3x3();
    }

    public OMat3x3 suma(OMat3x3 b){
        return new OMat3x3(m11+b.m11,m12+b.m12,m13+b.m13,m21+b.m21,m22+b.m22,m23+b.m23,m31+b.m31,m32+b.m32,m33+b.m33);
    }

    public OMat3x3 resta(OMat3x3 b){
        return new OMat3x3(m11-b.m11,m12-b.m12,m13-b.m13,m21-b.m21,m22-b.m22,m23-b.m23,m31-b.m31,m32-b.m32,m33-b.m33);
    }

    public OMat3x3 mult(OMat3x3 b){
        return new OMat3x3(m11*b.m11+m12*b.m21+m13*b.m31,m11*b.m12+m12*b.m22+m13*b.m32,m11*b.m13+m12*m23+m13*b.m33,m21*b.m11+m22*b.m21+m23*b.m31,m21*b.m12+m22*b.m22+m23*b.m32,m21*b.m13+m22*b.m23+m23*b.m33,m31*b.m11+m32*b.m21+m33*b.m31,m31*b.m12+m32*b.m22+m33*b.m32,m31*b.m13+m32*b.m23+m33*b.m33);
    }

    public double determinante(){
        double c = m11*(m22*m33-m32*m23)-m12*(m21*m33-m31*m23)+m13*(m21*m32-m31*m22);
        return c;
    }

    public static OMat3x3 rotX(double alpha){
        return new OMat3x3(1,0,0,0,Math.cos(alpha),-Math.sin(alpha),0,Math.sin(alpha),Math.cos(alpha));
    }

    public static OMat3x3 rotY(double alpha){
        return new OMat3x3(Math.cos(alpha),0,Math.sin(alpha),0,1,0,-Math.sin(alpha),0,Math.cos(alpha));
    }

    public static OMat3x3 rotZ(double alpha){
        return new OMat3x3(Math.cos(alpha),-Math.sin(alpha),0,Math.sin(alpha),Math.cos(alpha),0,0,0,1);
    }

    public static OMat3x3 identidad(){
        return new OMat3x3(1,0,0,0,1,0,0,0,1);
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "m11=" + m11 +
                ", m12=" + m12 +
                ", m13=" + m13 +
               "\n"+ ", m21=" + m21 +
                ", m22=" + m22 +
                ", m23=" + m23 +
                "\n"+", m31=" + m31 +
                ", m32=" + m32 +
                ", m33=" + m33 +
                '}';
    }
}

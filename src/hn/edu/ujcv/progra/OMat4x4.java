package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
   private double m11; private  double m12; private double m13; private double m14;
    private double m21; private  double m22; private double m23; private double m24;
    private double m31; private double m32; private double m33; private double m34;
    private double m41; private double m42; private double m43; private double m44;

    public OMat4x4 (double m11, double m12, double m13, double m14,
                    double m21, double m22, double m23, double m24,
                    double m31, double m32, double m33, double m34,
                    double m41, double m42, double m43, double m44){
    }

    public OMat4x4(){}

    public void setM22(double m22) {
        this.m22 = m22;
    }

    public void setM21(double m21) {
        this.m21 = m21;
    }

    public void setM11(double m11) {
        this.m11 = m11;
    }

    public void setM12(double m12) {
        this.m12 = m12;
    }

    public void setM13(double m13) {
        this.m13 = m13;
    }

    public void setM14(double m14) {
        this.m14 = m14;
    }

    public void setM24(double m24) {
        this.m24 = m24;
    }

    public void setM23(double m23) {
        this.m23 = m23;
    }

    public void setM32(double m32) {
        this.m32 = m32;
    }

    public void setM31(double m31) {
        this.m31 = m31;
    }

    public void setM33(double m33) {
        this.m33 = m33;
    }

    public void setM34(double m34) {
        this.m34 = m34;
    }

    public void setM41(double m41) {
        this.m41 = m41;
    }

    public void setM42(double m42) {
        this.m42 = m42;
    }

    public void setM43(double m43) {
        this.m43 = m43;
    }

    public void setM44(double m44) {
        this.m44 = m44;
    }
    // Metodos

    public OMat4x4 transpuesta(){
        return new OMat4x4(m11,m21,m31,m41,m12,m22,m32,m42,m13,m23,m33,m43,m14,m24,m34,m44);
    }
    public OMat4x4 inversa(){
        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){

        return new OMat4x4( m11+b.m11, b.m12+m12, b.m13+m13, b.m14+m14,
        b.m21+m21, b.m22+m22,  b.m23+m23,  b.m24+m24,
         b.m31+m31, b.m32+m32,  b.m33+m33,  b.m34+m34,
        b.m41+m41,  b.m42+m42,  b.m43+m43,  b.m44+m44);
    }

    public OMat4x4 resta(OMat4x4 b){
        return new OMat4x4(m11-b.m11, m12-b.m12,  m13-b.m13,  m14-b.m14,
                           m21-b.m21, m22-b.m22,  m23-b.m23,  m24-b.m24,
                           m31-b.m31, m32-b.m32,  m33-b.m33,  m34-b.m34,
                           m41-b.m41, m42-b.m42,  m43-b.m43,  m44-b.m44);
    }

    public OMat4x4 mult(OMat4x4 b){

        return new OMat4x4();
    }

    public double determinante(){
       double c= m11*(m22*(m33*m44-m43*m34))-m12*(m33*m44-m43*m34)+m13*(m32*m44-m42*m34)-m14*(m31*m42-m32*m41);
        return c;
    }

    // Metodos de la clase.
    public static OMat4x4 rotX(double alpha){
        return new OMat4x4(1,0,0,0,0,Math.cos(alpha),-Math.sin(alpha),0,0,Math.sin(alpha),Math.cos(alpha),0,0,0,0,1);
    }

    public static OMat4x4 rotY(double alpha){
        return new OMat4x4(Math.cos(alpha),0,Math.sin(alpha),0,0,1,0,0,-Math.sin(alpha),0,Math.cos(alpha),0,0,0,0,1);
    }

    public static OMat4x4 rotZ(double alpha){
        return new OMat4x4(Math.cos(alpha),-Math.sin(alpha),0,0,Math.sin(alpha),Math.cos(alpha),0,0,0,0,1,0,0,0,0,1);
    }


    public static OMat4x4 identidad(){
        return new OMat4x4(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1);
    }

    // constructores
}

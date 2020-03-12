package hn.edu.ujcv.progra;

public class OMat2x2{

    private   double m11,m12;
    private   double m21,m22;


    public OMat2x2(double m11, double m21, double m12, double m22){

    }
    public void setM11(double m11){
        this.m11 = m11;
    }
    public void setM12(double m12){
        this.m12 = m12;
    }
    public void setM21(double m21){
        this.m21 = m21;
    }
    public void setM22(double m22){
        this.m22 = m22;
    }

    public double getM11() {
        return m11;
    }
    public void getM12(){
        this.m12 = m12;
    }
    // accesoras y mutadoras

    //getColX
    //getColY
    //getFilaX
    //getFilaY

    // metodos

    public OMat2x2 transpuesta(){
         this.m21 = this.m12;
         this.m12 = this.m21;
        return new OMat2x2();
    }

    public OMat2x2 inversa(){
        //TODO: implementar
        return new OMat2x2();
    }
    public OMat2x2 suma(OMat2x2 b){
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 resta(OMat2x2 b){
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 mult(OMat2x2 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat2x2();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat2x2 rot(double alpha){
        // cos a   -sin a
        // sin a   cos a
        double m11,m12,m21,m22;


        m11 = Math.cos(alpha);
        m12 = -Math.sin(alpha);
        m21 = Math.sin(alpha);
        m22 = Math.cos(alpha);
        return new OMat2x2();
    }

    public static OMat2x2 identidad(){


        //TODO: implementar
        return new OMat2x2();
    }


    // v * M => vector

    public OVecR2 mult(OVecR2 a){
        //             x                        y
        //  ( a.x * m11 + a.y * m21 , a.x * m12 + a.y * m22)
        //
        return new OVecR2(9,0);
    }


    // constructores
    public OMat2x2(){}

    public OMat2x2(OVecR2 a){}

    public OMat2x2(OMat2x2 b){}


    public OMat2x2(OVecR2 a, OVecR2 b, boolean esColumna){}

}

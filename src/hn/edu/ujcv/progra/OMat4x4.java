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

    // metodos

    public OMat4x4 inversa(OMat4x4 b){


        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 resta(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 mult(OMat4x4 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat4x4();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat4x4 rotX(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotY(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotZ(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotW(double alpha){

        return new OMat4x4();
    }

    public static OMat4x4 identidad(){


        //TODO: implementar
        return new OMat4x4();
    }

    // constructores
}

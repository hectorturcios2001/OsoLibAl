package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double i;
    private double j;
    private double k;
    private double l;

    public OMat4x4 (double i, double j, double k, double l){
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }

    public OMat4x4(){}

    public OMat4x4(OMat4x4 a, OMat4x4 b, OMat4x4 c, OMat4x4 d){}


    // accesoras y mutadoras
    public double getI(){
        return i;
    }
    public double getJ(){
        return j;
    }
    public double getK() {
        return k;
    }
    public double getL() {
        return l;
    }
    public void setJ(double j) {
        this.j = j;
    }
    public  void setI(double i){
        this.i = i;
    }
    public void setK(double k){
        this.k = k;
    }
    public void setL(double l){
        this.l = l;
    }

    // metodos

    public OMat4x4 tra(OMat4x4 a, OMat4x4 b, OMat4x4 c, OMat4x4 d){
//      Comlumna 1
        b.i = a.j;
        c.i = a.k;
        d.i = a.l;
//      columna 2
        a.j = b.i;
        d.j = b.k;
        c.j = b.l;
//      Columna 3
        a.k = c.i;
        b.k = c.j;
        d.k = c.l;
//      Columan 4
        a.l = d.i;
        b.l = d.j;
        c.l = d.k;
        return new OMat4x4();
    }

    public OMat4x4 inversa(){
        //TODO: implementar
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

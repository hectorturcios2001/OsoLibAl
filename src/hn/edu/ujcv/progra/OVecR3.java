package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros
    private double i;
    private double j;
    private double k;


    // accesoras y mutadoras
    public OVecR3 (double i, double j, double k){
        this.i = i;
        this.j = j;
        this.k = k;
    }
    public OVecR3 (OVecR3 b){

    }
    public OVecR3() {

    }

    public double getJ() {
        return j;
    }
    public double getI(){
        return i;
    }
    public double getK(){
        return k;
    }
    public void setI(double i){this.i = i;}
    public void setJ(double j){this.j = j;}
    public void setK(double k){this.k = k;}

     public OVecR3 suma(OVecR3 b){

         return new OVecR3(this.i + b.i, this.j + b.j, this.k + b.k);
     }

     public OVecR3 resta(OVecR3 b) {

         return new OVecR3(this.i - b.i, this.j - b.j, this.k - b.k);
     }
     public OVecR3 prodCruz(OVecR3 b){
//        preguntar
       return new OVecR3((this.j*b.k)+(this.k*b.j),-((this.i*b.k)+(this.k*b.i)),(this.i*b.j)+(this.j*b.i));

     }
    public double prodPunto(OVecR3 b){

      double puntoR3 = this.i*b.i + this.j*b.j  + this.k*b.k;
      return puntoR3;
    }

    public double magnitud(){
        double magR2 = Math.sqrt(this.i*this.i+this.j+this.j+this.k+this.k);
        return magR2;

    }

    @Override
    public String toString() {
        return
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                '}';
    }
}

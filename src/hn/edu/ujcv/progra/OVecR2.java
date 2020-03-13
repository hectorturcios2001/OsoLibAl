package hn.edu.ujcv.progra;

public class OVecR2 {
    // miembros
    private double i;
    private double j;

    public OVecR2(double i, double j){
        this.i = i;
        this.j = j;
    }
    public OVecR2(){

    }
    // accesoras y mutadoras
    public double getI() {
        return i;
    }

    public double getJ() {
        return j;
    }
    public void setI(double i){
        this.i = i;
    }
    public void setJ(double j) {
        this.j = j;
    }

    // metodos
    public OVecR2 suma (OVecR2 b){
       return new OVecR2(this.i + b.i, this.j + b.j);
    }

    public OVecR2 resta(OVecR2 b){

        return new OVecR2(this.i-b.i,this.j-b.j);
    }

    public double prodPunto(OVecR2 b){
        double punto = this.i*b.i + this.j*b.j;

        return punto;
    }

    public double magnitud(){
        return  Math.sqrt(this.i*this.i+this.j*this.j);
    }



    @Override
    public String toString() {
        return " {" +
                "i=" + i +
                ", j=" + j +
                '}';
    }


}

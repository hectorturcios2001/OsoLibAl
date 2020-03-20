package hn.edu.ujcv.progra;

public class OVecR4 {
    // miembros
    private double i;
    private double j;
    private double k;
    private double l;

//  Constructores
    public OVecR4(double i, double j, double k, double l) {

    }
    public OVecR4(){

    }

    // accesoras
    public double setI(double aDouble){
        return i;
    }
    public double setJ(){
        return j;
    }
    public double setK(){
        return k;
    }
    public double setL(){
        return l;
    }
//    setters
    public void SetI(double i){
        this.i = i;
    }
    public void setJ(double j){
        this.j = j;
    }
    public void setK (double k){
        this.k = k;
    }
    public void setL (double l){
        this.l = l;
    }

    // metodos

    public OVecR4 suma(OVecR4 b){

        return new OVecR4(this.i + b.i, this.j+b.j, this.k+b.k, this.l+b.l);
    }

    public OVecR4 resta(OVecR4 b){

        return new OVecR4(this.i-b.i, this.j-b.j, this.k-b.k, this.l-b.l);
    }

    public double prodPunto(OVecR4 b){
        double puntoR4 = this.i*b.i + this.j*b.j + this.k*b.k + this.l*b.l;
        return puntoR4;
    }

    public double magnitud(){
        double magR4 = Math.sqrt(i*i + j*j + k*k + l*l);
        return magR4;
    }

    @Override
    public String toString() {
        return
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                ", l=" + l +
                '}';
    }
}

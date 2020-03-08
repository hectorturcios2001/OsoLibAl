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

      double punto = this.i*b.i + this.j*b.j  +this.k*b.k;
      return punto;
    }

    public double magnitud(){
        double mag = Math.sqrt(this.i*this.i+this.j+this.j+this.k+this.k);
        return mag;

    }

    // metodos

    // constructores
}

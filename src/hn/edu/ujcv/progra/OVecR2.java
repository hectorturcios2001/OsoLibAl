package hn.edu.ujcv.progra;

public class OVecR2 {
    // miembros
    private double i;
    private double j;

    public OVecR2(double x, double y){

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


    public OVecR2 lecVec2(){
        OVecR2 vec = new OVecR2();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        System.out.println("Ingrese el vector A\nIngrese i");
        vec.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        vec.setJ(lc.getDouble(mensaje));
        return vec;
    }
    public OVecR2 lecVec2b(){
        OVecR2 b = new OVecR2();
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("Ingrese el vector B ");
        System.out.println("Ingrese i:");
        b.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        b.setJ(lc.getDouble(mensaje));
        return b;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OVecR2;


public class Main {
    public static void main(String[] args) {
// pojo
// son objetos que representan datos en una tabla
// son daciles de serializar (swa)\
        LectorDeTeclado lc = new LectorDeTeclado();
        OVecR2 vec = new OVecR2();
        System.out.println("\t\t\tBienvenido a La Calculadora");
        System.out.println("\t\t\n Que operacion desea reaizar \n1) Vectores\n2) Matrices");
        Integer x = lc.getInteger("Numero invalido reintente");
       if (x == 1 ){
            System.out.println("Ingrese el vector A");
            System.out.println("Ingrese i");
             vec.setI(lc.getDouble("Caracter invalido intente de nuevo"));
            System.out.println("Ingrese j");
            vec.setJ(lc.getDouble("Caracter invalido intente de nuevo"));
            System.out.println("Ingrese el vector B ");
            System.out.println("Ingrese i");
            vec.setI(lc.getDouble("Caracter invalido intente de nuevo"));
            System.out.println("Ingrese j");
            vec.setJ(lc.getDouble("Caracter invalido intente de nuevo"));


        }



    }
}

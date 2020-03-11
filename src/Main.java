import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OVecR2;


public class Main {
    public static void main(String[] args) {
// pojo
// son objetos que representan datos en una tabla
// son daciles de serializar (swa)\
        LectorDeTeclado lc = new LectorDeTeclado();
        OVecR2 vec = new OVecR2();
        String mensaje = "Numero invalido reintente";
        System.out.println("\n\t\t\tBienvenido a La Calculadora");
        System.out.println("\t\t\n Que operacion desea reaizar \n1) Vectores\n2) Matrices");
        Integer x = lc.getInteger(mensaje);
       if (x == 1 ){
           System.out.printf("\t\t\tQue operaciones desea realizar?\n1) Suma\n2)Resta\n3)Producto punto\n4)Magnitud");
           x = lc.getInteger(mensaje);
           switch (x){
               case 1:{

               }
               case 2:{}
               case 3:{
                   System.out.printf(mensaje);
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
               case 4:{
                   System.out.printf("Ingrese el Vector (i,j)\nIngrese i:");
                   vec.setI(lc.getDouble(mensaje));
                   System.out.printf("Ingrese j:");
                   vec.setJ(lc.getDouble(mensaje));
                   System.out.println(vec.magnitud());
               }

           }




        }



    }
}

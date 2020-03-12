import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OVecR2;


public class Main {
    public static void main(String[] args) {
// pojo
// son objetos que representan datos en una tabla
// son daciles de serializar (swa)\
        LectorDeTeclado lc = new LectorDeTeclado();
        OVecR2 vec = new OVecR2();
        OVecR2 b = new OVecR2();
        String mensaje = "Numero invalido reintente";
        System.out.println("\n\t\t\tBienvenido a La Calculadora");
        System.out.println("\t\t\n Que operacion desea reaizar \n1) Vectores\n2) Matrices");
        Integer x = lc.getInteger(mensaje);
       if (x == 1 ){
           System.out.printf("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Producto punto\n4) Magnitud");
           x = lc.getInteger(mensaje);
           switch (x){
               case 1:{
                   vec.lecVec2();
                   b.lecVec2b();
                   System.out.println("La sum es "+vec.suma(b));
                   break;
               }
               case 2:{
                   vec.lecVec2();
                   b.lecVec2b();
                   System.out.println("La resta de los vectpres es: " + vec.resta(b));
               }
               case 3:{
                   vec.lecVec2();
                   b.lecVec2b();
                   System.out.println("La resspuesta es: "+ vec.prodPunto(b));
                   break;
               }
               case 4:{
                   System.out.printf("Ingrese el Vector (i,j)\nIngrese i:");
                   vec.setI(lc.getDouble(mensaje));
                   System.out.printf("Ingrese j:");
                   System.out.println(vec.magnitud());
               }

           }




        }



    }
}

import hn.edu.ujcv.progra.LectorDeTeclado;
import hn.edu.ujcv.progra.OMat4x4;
import hn.edu.ujcv.progra.OVecR2;


public class Main {
    public static void main(String[] args) {
// pojo
// son objetos que representan datos en una tabla
// son daciles de serializar (swa)\
        LectorDeTeclado lc = new LectorDeTeclado();
        OVecR2 vec = new OVecR2();
        OVecR2 b = new OVecR2();

        OMat4x4 a = new OMat4x4();
        OMat4x4 b2 = new OMat4x4();
        OMat4x4 c = new OMat4x4();
        OMat4x4 d = new OMat4x4();
        String mensaje = "Numero invalido reintente";
        System.out.println("\n\t\t\tBienvenido a La Calculadora");
        System.out.println("\t\t\n Que operacion desea reaizar \n1) Vectores\n2) Matrices");
        Integer x = lc.getInteger(mensaje);
       if (x == 1 ){
           System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Producto punto\n4) Magnitud");
           x = lc.getInteger(mensaje);
           switch (x){
               case 1:{
                   switch (x){
                       case 1:{
                           vec = lc.lecVec2();
                           b = lc.lecVec2b();
                          System.out.println("La suma es "+vec.suma(b));
                           break;
                       }
                       case 2:{
                           vec = lc.lecVec2();
                           b = lc.lecVec2b();
                           System.out.println("La resta de los vectpres es: " + vec.resta(b));
                       }
                       case 3:{
                          vec = lc.lecVec2();
                          b = lc.lecVec2b();
                          System.out.println("La resspuesta es: "+ vec.prodPunto(b));
                          break;
                       }
                       case 4:{
                           System.out.printf("Ingrese el Vector (i,j)\nIngrese i:");
                           vec.setI(lc.getDouble(mensaje));
                           System.out.printf("Ingrese j:");
                           System.out.println(vec.magnitud());
                           break;
                       }
                   }
               }


           }
        }else{
           System.out.println("Con que matriz desea trabajar?\n1) 2x2\n2) 3x3\n3) 4x4");
           x = lc.getInteger(mensaje);
           switch (x){
               case 1:{
                   System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                           "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                   x = lc.getInteger(mensaje);
                   switch (x){
                       case 1:{ }
                       case 2:{}
                       case 3:{}
                       case 4:{}
                       case 5:{}
                       case 6:{}
                       case 7:{}
                   }
               }
               case 2:{
                   System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                           "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                   x = lc.getInteger(mensaje);

               }
               case 3:{
                   System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                           "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                   x = lc.getInteger(mensaje);
                   switch (x){
                       case 1:{
                           System.out.println("Ingrese la matriz");
                          a = lc.fila1();
                          b2 = lc.fila2();
                          c = lc.fila3();
                          d = lc.fila4();


                       }
                   }



               }
           }
       }
    }
}

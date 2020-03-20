import hn.edu.ujcv.progra.*;


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
        if (x == 1) {
            System.out.println("Ingrese coon que tipo de vector desea realizar\n1) Vector en R2\n2) Vector en R3\n3) Vector en R4");
            x = lc.getInteger(mensaje);
            switch (x) {
                case 1: {
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Producto punto\n4) Magnitud");
                    x = lc.getInteger(mensaje);
                    switch (x){
                        case 1:{
                            switch (x) {
                                case 1: {

                                    vec = lc.lecVec2();
                                    b = lc.lecVec2b();
                                    System.out.println("La suma es " + vec.suma(b));
                                    break;
                                }
                                case 2: {
                                    vec = lc.lecVec2();
                                    b = lc.lecVec2b();
                                    System.out.println("La resta de los vectpres es: " + vec.resta(b));
                                }
                                case 3: {
                                    vec = lc.lecVec2();
                                    b = lc.lecVec2b();
                                    System.out.println("La resspuesta es: " + vec.prodPunto(b));
                                    break;
                                }
                                case 4: {
                                    System.out.printf("Ingrese el Vector (i,j)\nIngrese i:");
                                    vec.setI(lc.getDouble(mensaje));
                                    System.out.printf("Ingrese j:");
                                    System.out.println(vec.magnitud());
                                    break;
                                }
                        }
                    }
                    }
                }
                case 2:{
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Prducto cruz\n4) Producto punto\n5) Magnitud");
                    x = lc.getInteger(mensaje);
                    OVecR3 vecR3 = new OVecR3();
                    OVecR3 vecR3B = new OVecR3();
                    switch (x){
                        case 1:{
                            vecR3 = lc.lectorR3A();
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es "+vecR3.suma(vecR3B));
                            break;
                        }
                        case 2:{
                            vecR3 = lc.lectorR3A();
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es "+vecR3.resta(vecR3B));
                            break;
                        }
                        case 3:{
                            vecR3 = lc.lectorR3A();
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es "+vecR3.prodCruz(vecR3B));
                            break;
                        }
                        case 4:{
                            vecR3 = lc.lectorR3A();
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es "+vecR3.prodPunto(vecR3B));
                            break;
                        }
                        case 5:{
                            vecR3 = lc.lectorR3A();
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es "+vecR3.magnitud());
                            break;
                        }
                    }

                }
                case 3:{
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Prducto punto\n4) Magnitud");
                    x = lc.getInteger(mensaje);
                    OVecR4 vecR4 = new OVecR4();
                    OVecR4 vecR4B = new OVecR4();
                    switch (x){
                        case 1:{
                            vecR4 = lc.lectorR4();
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es "+vecR4.suma(vecR4B));
                            break;
                        }
                        case 2:{
                            vecR4 = lc.lectorR4();
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es "+vecR4.resta(vecR4B));
                            break;
                        }
                        case 3:{
                            vecR4 = lc.lectorR4();
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es "+vecR4.prodPunto(vecR4B));
                            break;
                        }
                        case 4:{
                            vecR4 = lc.lectorR4();
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es "+vecR4.magnitud());
                            break;
                        }
                    }
                }

            }
        } else {
            System.out.println("Con que matriz desea trabajar?\n1) 2x2\n2) 3x3\n3) 4x4");
            x = lc.getInteger(mensaje);
            switch (x) {
                case 1: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                            "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                    x = lc.getInteger(mensaje);
                    switch (x) {
                        case 1: {
                        }
                        case 2: {
                        }
                        case 3: {
                        }
                        case 4: {
                        }
                        case 5: {
                        }
                        case 6: {
                        }
                        case 7: {
                        }
                    }
                }
                case 2: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                            "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                    x = lc.getInteger(mensaje);

                }
                case 3: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n 4) Resta\n4) Multiplicacion\n " +
                            "5) Determinate\n6) Rotacion\n7) Multiplicaion por vector");
                    x = lc.getInteger(mensaje);
                    switch (x) {
                        case 1: {
                            System.out.println("Ingrese la matriz");

                        }


                    }
                }
            }
        }
    }}

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
        System.out.println("\n\n\t\t\t\tBienvenido a La Calculadora!!!!!!!!!!");
        double q = 0;
        while (q == 0 ){
            System.out.println("\t\t\n Que operacion desea reaizar \n1) Vectores\n2) Matrices");
            int x = lc.getInteger(mensaje);
        if (x == 1) {
            System.out.println("Ingrese con que tipo de vector desea realizar\n1) Vector en R2\n2) Vector en R3\n3) Vector en R4\n4) Cancelar");
            x = lc.getInteger(mensaje);
            if (x == 4){break;}
            switch (x) {
                case 1: {
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Producto punto\n4) Magnitud\n5) Cancelar");
                    x = lc.getInteger(mensaje);
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
                            break;
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
                            vec.setJ(lc.getDouble(mensaje));
                            System.out.println(vec.magnitud());
                            break;
                        }
                        case 5:{break;}
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Prducto cruz\n4) Producto punto\n5) Magnitud\n6) Cancelar");
                    x = lc.getInteger(mensaje);
                    OVecR3 vecR3 = new OVecR3();
                    OVecR3 vecR3B = new OVecR3();
                    switch (x) {
                        case 1: {
                            vecR3 = lc.lectorR3A();
                            System.out.println("");
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es " + vecR3.suma(vecR3B));
                            break;
                        }
                        case 2: {
                            vecR3 = lc.lectorR3A();                            System.out.println("");
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es " + vecR3.resta(vecR3B));
                            break;
                        }
                        case 3: {
                            vecR3 = lc.lectorR3A();                            System.out.println("");
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es " + vecR3.prodCruz(vecR3B));
                            break;
                        }
                        case 4: {
                            vecR3 = lc.lectorR3A();                            System.out.println("");
                            vecR3B = lc.lectorR3B();
                            System.out.println("El resultado es " + vecR3.prodPunto(vecR3B));
                            break;
                        }
                        case 5: {
                            vecR3 = lc.lectorR3A();
                            System.out.println("El resultado es " + vecR3.magnitud());
                            break;
                        }
                        case 6:{break;}
                    }
                    break;
                }
                case 3: {
                    System.out.println("\t\t\tQue operaciones desea realizar?\n1) Suma\n2) Resta\n3) Prducto punto\n4) Magnitud\n5) Cancelar");
                    x = lc.getInteger(mensaje);
                    OVecR4 vecR4 = new OVecR4();
                    OVecR4 vecR4B = new OVecR4();
                    switch (x) {
                        case 1: {
                            System.out.println("Ingrese el vector A");
                            vecR4 = lc.lectorR4();
                            System.out.println("\nIngrese el vector B");
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es " + vecR4.suma(vecR4B));
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese el vector A");
                            vecR4 = lc.lectorR4();
                            System.out.println("\nIngrese el vector B");
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es " + vecR4.resta(vecR4B));
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese el vector A");
                            vecR4 = lc.lectorR4();
                            System.out.println("\nIngrese el vector B");
                            vecR4B = lc.lectorR4();
                            System.out.println("El resultado es " + vecR4.prodPunto(vecR4B));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el vector A");
                            vecR4 = lc.lectorR4();
                            System.out.println("El resultado es " + vecR4.magnitud());
                            break;
                        }
                        case 5:{break;}
                    }
                }
                break;
            }
        } else {
            System.out.println("Con que matriz desea trabajar?\n1) 2x2\n2) 3x3\n3) 4x4\n4) Cancelar");
            x = lc.getInteger(mensaje);
            if(x == 4){break;}
            switch (x) {
                case 1: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n4) Resta\n5) Multiplicacion\n" +
                            "6) Determinate\n7) Rotacion\n8) Multiplicaion por vector\n9) Cancelar");
                    x = lc.getInteger(mensaje);
                    OMat2x2 A = new OMat2x2();
                    OMat2x2 B = new OMat2x2();
                    switch (x) {
                        case 1: {
                            System.out.println("Ingrese la matriz");
                            A = lc.lectorDe2x2();
                            System.out.println(A.transpuesta());
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese la matriz");
                            A = lc.lectorDe2x2();
                            System.out.println(A.inversa());
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese la primera matriz");
                            A = lc.lectorDe2x2();
                            System.out.println("\nIngrese  la segunda matriz");
                            B = lc.lectorDe2x2();
                            System.out.println(A.suma(B));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese la primera matriz");
                            A = lc.lectorDe2x2();
                            System.out.println("\nIngrese  la segunda matriz");
                            B = lc.lectorDe2x2();
                            System.out.println(A.resta(B));
                            break;
                        }
                        case 5: {
                            System.out.println("Ingrese la primera matriz");
                            A = lc.lectorDe2x2();
                            System.out.println("\nIngrese  la segunda matriz");
                            B = lc.lectorDe2x2();
                            System.out.println(A.mult(B));
                            break;
                        }
                        case 6:{
                            System.out.println("Ingrese la matriz");
                            A = lc.lectorDe2x2();
                            System.out.println("\nEl determinante es "+A.determinante());
                            break;
                        }
                        case 7: {
                            System.out.println("Ingrese el angulo de rotacion");
                            A.setAlpha(lc.getDouble(mensaje));
                            System.out.println(A.rot(A.getAlpha()));
                            break;
                        }
                        case 8: {
                            System.out.println("Ingrese el vector");
                            vec = lc.lecVec2();
                            System.out.println("\nImgrese la matriz");
                            A = lc.lectorDe2x2();
                            System.out.println("\nEl resultado es "+A.mult2(vec));
                            break;
                        }
                        case 9:{break;}
                    }
                    break;
                }
                case 2: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Inversa\n3) Suma\n4) Resta\n5) Multiplicacion\n"+
                            "6) Determinate\n7) Rotacion en X\n8) Rotacion en Y\n9) Rotacion en Z\n10) Cancelar");
                    x = lc.getInteger(mensaje);
                    OMat3x3 w = new OMat3x3();
                    OMat3x3 we = new OMat3x3();
                    switch (x){
                        case 1:{
                           w = lc.lectorDe3x3();
                           System.out.println(w.transpuesta());
                           break;
                        }
                        case 2:{
                            w = lc.lectorDe3x3();
                            w.inversa(w);
                            System.out.println(w.inversa(w));
                            break;
                        }
                        case 3:{
                            System.out.println("Ingrese la primera matriz");
                            w = lc.lectorDe3x3();
                            System.out.println("\nIngrese la segunda matriz");
                            we = lc.lectorDe3x3();
                            System.out.println(w.suma(we));
                            break;
                        }
                        case 4:{
                            System.out.println("Ingrese la primera matriz");
                            w = lc.lectorDe3x3();
                            System.out.println("\nIngrese la segunda matriz");
                            we = lc.lectorDe3x3();
                            System.out.println(w.resta(we));
                            break;
                        }
                        case 5:{
                            System.out.println("Ingrese la primera matriz");
                            w = lc.lectorDe3x3();
                            System.out.println("\nIngrese la segunda matriz");
                            we = lc.lectorDe3x3();
                            System.out.println(w.mult(we));
                            break;
                        }
                        case 6:{
                            w = lc.lectorDe3x3();
                            System.out.println("El determinante es "+w.determinante());
                            break;
                        }
                        case 7:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negativos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(w.rotX(cola));
                            break;
                        }
                        case 8:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negativos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(w.rotY(cola));
                            break;
                        }
                        case 9:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negaivos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(w.rotZ(cola));
                            break;
                        }
                        case 10:{break;}
                    }
                    break;
                }
                case 3: {
                    System.out.println("Que operaciones desea?\n1) Transpuesta\n2) Suma\n3) Resta\n4) Multiplicacion\n"+
                            "5) Determinate\n6) Rotacion en X\n7) Rotacion en Y\n8) Rotacion en Z\n9) Cancelar");
                    x = lc.getInteger(mensaje);
                    OMat4x4 A = new OMat4x4();
                    OMat4x4 B = new OMat4x4();
                    switch (x) {
                        case 1: {
                          A = lc.lectorDe4x4();
                          System.out.println(A.transpuesta());
                          break;
                        }
                        case 2:{
                            System.out.println("Ingrese la primer matriz");
                            A = lc.lectorDe4x4();
                            System.out.println("\nIngerese la segunda matriz");
                            B = lc.lectorDe4x4();
                            System.out.println(A.suma(B));
                            break;
                        }
                        case 3:{
                            System.out.println("Ingrese la primer matriz");
                            A = lc.lectorDe4x4();
                            System.out.println("\nIngerese la segunda matriz");
                            B = lc.lectorDe4x4();
                            System.out.println(A.resta(B));
                            break;
                        }
                        case 4:{
                            System.out.println("Ingrese la primer matriz");
                            A = lc.lectorDe4x4();
                            System.out.println("\nIngerese la segunda matriz");
                            B = lc.lectorDe4x4();
                            System.out.println(A.mult(B));
                            break;
                        }
                        case 5:{
                            A = lc.lectorDe4x4();
                            System.out.println("El determinante es "+A.determinante());
                            break;
                        }
                        case 6:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negativos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(A.rotX(cola));
                            break;
                        }
                        case 7:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negativos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(A.rotY(cola));
                            break;
                        }
                        case 8:{
                            System.out.println("Ingrese el angulo");
                            double cola = lc.getDouble(mensaje);
                            while (cola < 0){
                                System.out.println("Los angulos no pueden ser negativos \n"+"Ingrese un angulo valido");
                                cola = lc.getDouble(mensaje);
                            }
                            System.out.println(A.rotZ(cola));
                            break;
                        }
                        case 9:{break;}
                    }
                }
                break;
            }

        }
        System.out.println("");
        System.out.println("Desea hacer otra operacion\n1) Si\n2) No");
        int lo = lc.getInteger(mensaje);
        if(lo == 1){
            q = 0;
        } else{q = 1;}
        }
    }
    }


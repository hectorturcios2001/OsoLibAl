package hn.edu.ujcv.progra;

import java.util.Scanner;

public class LectorDeTeclado {
    private static LectorDeTeclado instance;
    private Scanner sc;

    public static LectorDeTeclado getInstance() {
        if (instance == null) {
            instance = new LectorDeTeclado();
        }
        return instance;
    }

    public LectorDeTeclado() {
        sc = new Scanner(System.in);
    }

    public double getDouble(String mensaje, String reintento) {

        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public double getDouble(String reintento) {

        while (!sc.hasNextDouble()) {
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public int getInteger(String mensaje, String reintento) {

        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

    }

    public int getInteger(String reintento) {

        while (!sc.hasNextDouble()) {
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

    }

    public Scanner getSc() {
        return sc;

    }


    public OVecR2 lecVec2() {
        OVecR2 vec = new OVecR2();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        System.out.println("Ingrese el vector A\nIngrese i");
        vec.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        vec.setJ(lc.getDouble(mensaje));
        return vec;
    }

    public OVecR2 lecVec2b() {
        OVecR2 b = new OVecR2();
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("Ingrese el vector B \n");
        System.out.println("Ingrese i:");
        b.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        b.setJ(lc.getDouble(mensaje));
        return b;
    }

    public OVecR3 lectorR3A() {
        OVecR3 a = new OVecR3();
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("Ingrese el Vector A\n\nIngrese i:");
        a.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        a.setJ(lc.getDouble(mensaje));
        System.out.println("Ingrese k:");
        a.setK(lc.getDouble(mensaje));
        return a;
    }

    public OVecR3 lectorR3B() {
        OVecR3 b = new OVecR3();
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("Ingrese el Vector B\n\nIngrese i:");
        b.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        b.setJ(lc.getDouble(mensaje));
        System.out.println("Ingrese k:");
        b.setK(lc.getDouble(mensaje));
        return b;
    }

    public OVecR4 lectorR4() {
        OVecR4 a = new OVecR4();
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        System.out.println("Ingrese el Vector B\n\nIngrese i:");
        a.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        a.setJ(lc.getDouble(mensaje));
        System.out.println("Ingrese k:");
        a.setK(lc.getDouble(mensaje));
        System.out.println("Ingrese l:");
        a.setL(lc.getDouble(mensaje));
        return a;
    }

//    public OMat2x2 LecM2x2() {
//        String mensaje = "Numero invelido reintente";
//        LectorDeTeclado lc = new LectorDeTeclado();
//        OMat2x2 a = new OMat2x2();
//        double k [][]= new double[3][3];
//        int i = 1;
//        int j = 1;
//        while ( i < 3){
//            while (j < 3){
//                System.out.println("Ingrese el valo de la posicion "+i+","+j);
//                k[i][j] = lc.getDouble(mensaje);
//                j++;
//            }
//            j = 1;
//            i++;
//        }
//        a.setArre(k);
//        return a;
//
//    }
    public OMat2x2 lectorDe2x2(){
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        OMat2x2 a = new OMat2x2();
        System.out.println("Ingrese el numero de la poscion 1,1");
        a.setM11(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 1,2");
        a.setM12(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 2,1");
        a.setM21(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 2,2");
        a.setM22(lc.getDouble(mensaje));
        return a;
    }
    public OMat3x3 lectorDe3x3() {
        String mensaje = "Numero invelido reintente";
        LectorDeTeclado lc = new LectorDeTeclado();
        OMat3x3 a = new OMat3x3();
        System.out.println("Ingrese el numero de la poscion 1,1");
        a.setM11(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 1,2");
        a.setM12(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 1,3");
        a.setM13(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 2,1");
        a.setM21(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 2,2");
        a.setM22(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 2,3");
        a.setM23(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 3,1");
        a.setM31(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 3,2");
        a.setM32(lc.getDouble(mensaje));
        System.out.println("Ingrese el numero de la poscion 33");
        a.setM33(lc.getDouble(mensaje));
        return a;
    }
}


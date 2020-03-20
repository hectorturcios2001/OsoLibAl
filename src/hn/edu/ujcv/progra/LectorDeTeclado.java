package hn.edu.ujcv.progra;

import java.util.Scanner;

public class LectorDeTeclado {
    private static LectorDeTeclado instance;
    private Scanner sc;

    public static LectorDeTeclado getInstance(){
        if(instance == null){
            instance = new LectorDeTeclado();
        }
        return instance;
    }

    public LectorDeTeclado(){
        sc = new Scanner(System.in);
    }

    public double getDouble(String mensaje, String reintento){

        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public double getDouble(String reintento){

        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextDouble();

    }

    public int getInteger(String mensaje, String reintento){

        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

    }

    public int getInteger( String reintento){

        while(!sc.hasNextDouble()){
            System.out.println(reintento);
            sc.nextLine();
        }
        return sc.nextInt();

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
        System.out.println("Ingrese el vector B \n");
        System.out.println("Ingrese i:");
        b.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        b.setJ(lc.getDouble(mensaje));
        return b;
    }
    public OVecR3 lectorR3A(){
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
    public OVecR3 lectorR3B(){
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
    public OVecR4 lectorR4(){
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


}


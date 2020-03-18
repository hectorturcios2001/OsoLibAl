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
        System.out.println("Ingrese el vector B ");
        System.out.println("Ingrese i:");
        b.setI(lc.getDouble(mensaje));
        System.out.println("Ingrese j:");
        b.setJ(lc.getDouble(mensaje));
        return b;
    }
    public OMat4x4 fila1 (){
        OMat4x4 a = new OMat4x4();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        for (int i = 1; i == 4 ; i++) {
            System.out.println("Ingrese el numero en la posicion 1,"+i);
            switch (i){
                case 1:{
                    a.setI((lc.getDouble(mensaje)));
                }
                case 2:{
                    a.setJ(lc.getDouble(mensaje));
                }
                case 3:{
                    a.setK(lc.getDouble(mensaje));
                }
                case 4:{
                    a.setL(lc.getDouble(mensaje));
                }
            }

        }
        return a;
    }
    public OMat4x4 fila2 (){
        OMat4x4 b = new OMat4x4();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        for (int i = 1; i == 4 ; i++) {
            System.out.println("Ingrese el numero en la posicion 1,"+i);
            switch (i){
                case 1:{
                    b.setI((lc.getDouble(mensaje)));
                }
                case 2:{
                    b.setJ(lc.getDouble(mensaje));
                }
                case 3:{
                    b.setK(lc.getDouble(mensaje));
                }
                case 4:{
                    b.setL(lc.getDouble(mensaje));
                }
            }

        }
        return b;
    }
    public OMat4x4 fila3(){
        OMat4x4 c = new OMat4x4();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        for (int i = 1; i == 4 ; i++) {
            System.out.println("Ingrese el numero en la posicion 1,"+i);
            switch (i){
                case 1:{
                    c.setI((lc.getDouble(mensaje)));
                }
                case 2:{
                    c.setJ(lc.getDouble(mensaje));
                }
                case 3:{
                    c.setK(lc.getDouble(mensaje));
                }
                case 4:{
                    c.setL(lc.getDouble(mensaje));
                }
            }

        }
        return c;
    }
    public OMat4x4 fila4(){
        OMat4x4 d = new OMat4x4();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invelido reintente";
        for (int i = 1; i == 4 ; i++) {
            System.out.println("Ingrese el numero en la posicion 1,"+i);
            switch (i){
                case 1:{
                    d.setI((lc.getDouble(mensaje)));
                }
                case 2:{
                    d.setJ(lc.getDouble(mensaje));
                }
                case 3:{
                    d.setK(lc.getDouble(mensaje));
                }
                case 4:{
                    d.setL(lc.getDouble(mensaje));
                }
            }

        }
        return d;
    }


}


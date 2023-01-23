package com.unisys.ejercicios;

public class CasasApp {
    public static void main(String[] args) {
        Casa casa = new Casa("Madrid",60.0F);
        System.out.println(casa);
        Chalet chalet = new Chalet("Toledo",150.0f,2);
        System.out.println(chalet);
        chalet.setDireccion("Madrid");
        chalet.setMetrosCuadrados(120.0F);
        chalet.setPlantas(2);
        System.out.println(chalet);
        chalet = new Chalet("Madrid", 120F, 2);
        System.out.println(chalet);
        Piso piso = new Piso();
        System.out.println(piso);
        piso = new Piso("Madrid", 120F, 6);
        System.out.println(piso);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println(chaletDeLujo);
        chaletDeLujo = new ChaletDeLujo("Madrid", 120.0F, 2, 5);
        System.out.println(chaletDeLujo);
    }
}

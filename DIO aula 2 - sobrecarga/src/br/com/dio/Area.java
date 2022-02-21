package br.com.dio;

public class Area {

    public Area(double ladoDoQuadrado){

        System.out.println("a área do quadrado é: " + ladoDoQuadrado*ladoDoQuadrado);


    }
    public Area(double ladoDoRetangulo1, double ladoDoRetangulo2){

        System.out.println("a área do retangulo é:" + ladoDoRetangulo1*ladoDoRetangulo2);


    }

    public Area(double ladoMaior, double ladoMenos, double altura){

        System.out.println("a área do trapezio é: " + (ladoMaior+ladoMenos)/2*altura);


    }

}

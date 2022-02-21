package br.com.dio;

public class Area {



    public double area(double ladoDoQuadrado) {

        return ladoDoQuadrado * ladoDoQuadrado;


    }

    public double area(double ladoDoRetangulo1, double ladoDoRetangulo2) {

        return ladoDoRetangulo1 * ladoDoRetangulo2;


    }

    public double area(double ladoMaior, double ladoMenos, double altura) {

        return (ladoMaior + ladoMenos) / 2 * altura;


    }


}

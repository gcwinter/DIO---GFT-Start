package br.com.dio;

public class Main {
    public static void main(String[] args) {
       Area calculo = new Area();


        System.out.println("a area do quadrado é: " + calculo.area(5));
        System.out.println("a area do retangulo é: " + calculo.area(5,5));
        System.out.println("a area do trapézio é: " + calculo.area(5,5,3));

    }
}

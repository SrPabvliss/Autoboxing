
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /*
        int -Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero =10;//Autoboxing converir un tipo primitivo en un object
        System.out.println(entero.toString());
        
        int entero2 = entero; //unboxing convertir un tipo object en un primitivo
        System.out.println("entero2 = " + entero2);
    }
}

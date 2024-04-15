import javax.swing.*;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;



    //Metodos

    //metodo para pedir al usuario que digite dos numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero; "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero; "));
    }
    //metodo para sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    public void restar(){
        resta = numero1 - numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    public void dividir(){
        division = numero1/numero2;
    }

    public void mostrarResultados (){
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicación es: " +multiplicacion);
        System.out.println("La division es: " +division);

    }












}

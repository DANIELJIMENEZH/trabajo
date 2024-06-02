/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

/**
 *
 * @author FER
 */
public class IMCCalcular {
    public static double calcularIMC(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    public static String nivelDePeso(double IMC) {
        if (IMC < 16.00)
            return "Infrapeso: Delgadez severa";
        else if (IMC >= 16.00 && IMC <= 16.99)
            return "Infrapezo: Delgadez moderada";
        else if (IMC >= 17.00 && IMC <= 18.49)
            return "Infrapezo: Delgadez aceptable";
        else if (IMC >= 18.50 && IMC <= 24.99)
            return " Peso normal";
        else if (IMC >= 25.00 && IMC <= 29.99)
            return "Sobrepeso";
        else if (IMC >= 30.00 && IMC <= 34.99)
            return "Obeso: Tipo 1";
        else if (IMC >= 35.00 && IMC <= 40.99)
            return "Obeso: Tipo 2";
        else if (IMC > 40.00)
            return "Obeso: Tipo 3";
        else
            return "Sobrepeso";
    }
}


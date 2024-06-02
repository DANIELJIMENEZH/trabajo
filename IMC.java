/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

/**
 *
 * @author FER
 */
import javax.swing.JOptionPane;
public class IMC {

    public static void main(String[] args) {
        String alturaString = JOptionPane.showInputDialog(null, "Escribe tu altura actual porfavor (M): ");
        String pesoString = JOptionPane.showInputDialog(null, "Escribe tu peso actual porfavor (KG): ");

        double altura = Double.parseDouble(alturaString);
        double peso = Double.parseDouble(pesoString);

        // Calcular el IMC
        double IMC = IMCCalcular.calcularIMC(altura, peso);

        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal (IMC) es: " + IMC);

        String nivelPeso = IMCCalcular.nivelDePeso(IMC);
        JOptionPane.showMessageDialog(null, "Tu nivel de peso es: " + nivelPeso);
    }
}

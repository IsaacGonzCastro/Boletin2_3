
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
            //entrada por telcado
        float valorDeDolar,valorEuros;
        Scanner obx = new Scanner (System.in);
        System.out.println("teclea valor del dolar :");
        valorEuros = obx.nextFloat();
        System.out.println("teclea cambio euros  :");
        valorDeDolar = obx.nextFloat();
        System.out.println("cambio a dolar :"+valorDeDolar*valorEuros +"$");
    }
    
}

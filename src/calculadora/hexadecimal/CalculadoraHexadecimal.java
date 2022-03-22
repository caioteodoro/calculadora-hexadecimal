/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.hexadecimal;
import java.util.*;

public class CalculadoraHexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int a = sc.nextInt();
        
        int numero = a;
        Stack<String> convertido = new Stack<>();  
                
        while (numero != 0) {
            var resto = numero % 16;
            if (resto > 9){
                switch (resto) {
                    case 10 -> convertido.push("A");
                    case 11 -> convertido.push("B");
                    case 12 -> convertido.push("C");
                    case 13 -> convertido.push("D");
                    case 14 -> convertido.push("E");
                    case 15 -> convertido.push("F");
                }
            } else {
                convertido.push(String.format("%d", resto));
            }
            numero = numero / 16;
        }
        
        while (!convertido.empty()) {
            var topo = convertido.peek();
            System.out.print(topo);
            convertido.pop();
        }
        System.out.print("\n");
    }
}

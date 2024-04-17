import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Binario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Validador de Números Binários terminados em '0' com sequência de três '0's ou '1's seguidos");
        System.out.println("Digite 'x' para sair a qualquer momento.");

        while (true) {
            System.out.println("Digite um número binário:");
            String binaryNumber = scanner.nextLine();

            if ("x".equalsIgnoreCase(binaryNumber)) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            if (validarBinario(binaryNumber)) {
                System.out.println("O número binário é válido.");
            } else {
                System.out.println("Número binário inválido!");
            }
        }
        
        scanner.close();
    }
    
    public static boolean validarBinario(String binaryNumber) {
        String binaryRegex = "^(?=.*000|.*111).*0$";
        Pattern pattern = Pattern.compile(binaryRegex);
        Matcher matcher = pattern.matcher(binaryNumber);
        return matcher.matches();
    }
}

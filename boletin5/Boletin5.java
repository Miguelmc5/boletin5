package boletin5;
import java.util.*;
/**
 *
 * @author mmartinezcosta
 */
public class Boletin5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    Conta conta1=new Conta("Pepe", "34698", 467474.67);
    conta1.visualizar();
    
        System.out.println("El saldo actual de la cuenta es: "+conta1.getSaldo());
        
        conta1.Ingreso(123.45);
        System.out.println("El saldo después del ingreso es de: "+conta1.getSaldo());
    
        conta1.Reintegro(678.90);
        System.out.println("El saldo después del reintegroes de: "+conta1.getSaldo());
    
    Conta conta2=new Conta ("Pepa", "72041", 987632.23);
        
        System.out.println("Las cuentas antes de la tranferencia tienen:\nConta1: "+conta1.getSaldo()+"\nConta2: "+conta2.getSaldo());
        
        conta1.transferenciaIngresar(conta2, 230.56);
        conta2.transferenciaDescontar(conta1, 230.56);
        System.out.println("Después de la transferencia las cuentas quedan con: \nConta1: "+conta1.getSaldo()+" \nConta2: "+conta2.getSaldo());
        
    }
    
}

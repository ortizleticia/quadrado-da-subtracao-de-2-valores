
import java.util.Scanner;

public class Ex1 {
    
    double A,B,X;
    
    public int ler (Scanner leitor) {
        
       
       
       System.out.println ("\n Digite o primeiro valor:");
       A= leitor.nextDouble ();
       System.out.println ("\n Digite o segundo valor:");
       B= leitor.nextDouble ();
       
       return 0; }
    
       
    public double Calcular () {
                       
        
         X= (A-B);
         X = X*X;
         
         return X;
             
    }
    
    public void Mostrar () {
                       
        
       System.out.println ("\n A Diferença ao Quadrado de A - B é: " +X);
             
    }
           
    public static void main ( String [] args) { 
        
        Ex1 e1 = new Ex1 ( );
        
        Scanner leitor = new Scanner(System.in); 
        
        double  A,B,X;
        
        int tecla;  
                
        System.out.println("\nMENU \n 1- Executar\n 2 - Sair \n"); 
        tecla = leitor.nextInt();  
        
        switch (tecla) {  
            
            case 1: 
                e1. ler (leitor);
                X = e1.Calcular();
                e1.Mostrar();
                
            
            break;   
            
            case 2: 
              
            System.out.println("\nFim do programa!\n");  
            System.exit (0); 
                
            break;}} 


    
} 
 






   

    

   
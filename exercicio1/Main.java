public class Main{
    public static void main(String[] args) {

        Boolean acesa = true ;

        if (acesa) {
            System.out.println("ligada");
            } 
            else {
                System.out.println("desligada");
            }   
    }

    Boolean acesa = true ;
        
    String message = (acesa) ? "ligada" : "desligada";
    System.out.println(message);
    
    
        int idade = 50;
        if (idade < 12) {
            System.out.println("crianca");
             
        } else if (idade >= 12 && idade < 18) {
            System.out.println("adolescente");
            
        } else if (idade >= 18 && idade < 60 ) {
            System.out.println("adulto");
           
            else{
                System.out.println("idoso");
            }
        }
    
    
    
    }


}
   
   



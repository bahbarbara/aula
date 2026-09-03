
public class Main {
    public static void main(String[] args){
        String[] alunos = {"Miranata", "Savalo" ,"Aeronauta"};
        
        alunos[0] = "mariazinha";
        System.out.println("qtde de alunos: " +alunos.length);

        for(String estudante : alunos ){
              System.out.println(estudante);
        }

        int[] numeros = {1, 20, -3, 0, -2};
            for(int item : numeros){
            if (item < 0)
            System.out.println("negativo");
            if (item == 0)
            System.out.println("eh Zero");
            if (item > 0)
            System.out.println("positivo");

         }
 
    }
} 
        



package ex7;

public class testealuno {
    public static void main(String[] args){

        int[] notas = {30, 60, 80, 75};

        aluno meuAluno = new aluno("Adolfo", 20234555,"Engenharia", notas);

        int media = meuAluno.calcular();
        System.out.println("A média das notas de " + meuAluno.nome + " é " + media);





    }
}

/**
 *
 * @author Rober
 */
import java.util.Scanner;
import entidades.Aluno;
class Main 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double nota;
        double falta;
        
        System.out.println("Digite o nome do aluno");
        String name = input.nextLine();

        Aluno aluno = new Aluno(name);

        for(int i = 0; i<2; i++)
        {
            System.out.println("Digite a nota do aluno do trimestre 1");
            nota = input.nextDouble();
            if(nota <0)
            {
                System.out.println("É possível alguém dever nota ?");
            }
            else
            {
                aluno.somaTrimestre_1(nota);
            }
        }

        for(int i = 0; i<2; i++)
        {
            System.out.println("Digite a nota do aluno do trimestre 2");
            nota = input.nextDouble();
            if(nota <0)
            {
                System.out.println("É possível alguém dever nota ?");
            }
            else
            {
                aluno.somaTrimestre_2(nota);
            }
        }

        if(aluno.finalNota() > 6.99)
        {
            System.out.println("O aluno: " + aluno.getName() + " teve a nota");
            System.out.println(aluno.finalNota() + " Parabens você passou");
        }
        else
        {
            System.out.println("O aluno: " + aluno.getName() + " teve a nota");
            System.out.println(aluno.finalNota());
            falta = 7 - aluno.finalNota();
            System.out.println("Falta para passar:" + falta);
            System.out.println("Tenta outra vez ano que vem");
        }

        input.close();

    }
}

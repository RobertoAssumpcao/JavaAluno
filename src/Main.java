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
        double trimestre_1;
        double falta;
        
        System.out.println("Digite o nome do aluno");
        String name = input.nextLine();
        System.out.println("Digite a primeira nota do aluno do trimestre 1");
        nota = input.nextDouble();

        Aluno aluno = new Aluno(name);
        // preciso colocar um loop no teste do numero negativo
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_1(nota);
        }
        System.out.println("Digite a segunda nota do aluno do trimestre 1");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_1(nota);
        }
        System.out.println("Digite a terceira nota do aluno do trimestre 1");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_1(nota);
        }

        System.out.println("Digite a primeira nota do aluno do trimestre 2");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_2(nota);
        }
        System.out.println("Digite a segunda nota do aluno do trimestre 2");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_2(nota);
        }
        System.out.println("Digite a terceira nota do aluno do trimestre 2");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_2(nota);
        }

        System.out.println("Digite a primeira nota do aluno do trimestre 3");
        nota = input.nextDouble();
        if(nota < 0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_3(nota);
        }
        System.out.println("Digite a segunda nota do aluno do trimestre 3");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_3(nota);
        }
        System.out.println("Digite a terceira nota do aluno do trimestre 3");
        nota = input.nextDouble();
        if(nota <0)
        {
            System.out.println("É possível alguém dever nota ?");
        }
        else
        {
            aluno.somaTrimestre_3(nota);
        }
        
        if(aluno.finalNota() >89)
        {
            System.out.println("O aluno: " + aluno.name + " teve a nota");
            System.out.println(aluno.finalNota() + " Parabens você passou");
        }
        else
        {
            falta = 90 - aluno.finalNota();
            System.out.println("Falta para passar:" + falta);
            System.out.println("Tenta outra vez ano que vem");
        }

        input.close();

    }
}

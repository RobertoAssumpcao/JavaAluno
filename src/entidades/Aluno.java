package entidades;
/**
 *
 * @author Rober
 */
public class Aluno 
{
    private String name;
    private double trimestre_1;
    private double trimestre_2;

    public Aluno(String name)
    {
        this.name = name;
    }

    public void setName(String name) // mudar a variavel
    {
        this.name = name;
    }

    public String getName()  // returnar o valor da variavel
    {
        return name;
    }

    public double somaTrimestre_1(double nota)
    {
        trimestre_1 = trimestre_1 + nota;
        if(trimestre_1 > 10)
        {
            trimestre_1 = 10;
            return trimestre_1 ;
        }
        else
        {
            return trimestre_1;
        }
    }
    public double somaTrimestre_2(double nota)
    {
        trimestre_2 = trimestre_2 + nota;
        if(trimestre_2 > 10)
        {
            trimestre_2 = 10;
            return trimestre_2;
        }
        else
        {
            return trimestre_2;
        }
    }

    public double finalNota()
    {
        return (trimestre_1 + trimestre_2) / 2;
    }
}

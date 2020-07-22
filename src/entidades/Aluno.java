package entidades;
/**
 *
 * @author Rober
 */
public class Aluno 
{
    public String name;
    public double trimestre_1;
    public double trimestre_2;
    public double trimestre_3;

    public Aluno(String name)
    {
        this.name = name;
    }

    public double somaTrimestre_1(double nota)
    {
        trimestre_1 = trimestre_1 + nota;
        if(trimestre_1 > 30)
        {
            trimestre_1 = 30;
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
        if(trimestre_2 > 35)
        {
            trimestre_2 = 35;
            return trimestre_2;
        }
        else
        {
            return trimestre_2;
        }
    }
    public double somaTrimestre_3(double nota)
    {
        trimestre_3 = trimestre_3 + nota;
        if(trimestre_3 > 35)
        {
            trimestre_3 = 35;
            return trimestre_3;
        }
        else
        {
            return trimestre_3;
        }
    }
    public double finalNota()
    {
        return trimestre_1 + trimestre_2 + trimestre_3;
    }
}

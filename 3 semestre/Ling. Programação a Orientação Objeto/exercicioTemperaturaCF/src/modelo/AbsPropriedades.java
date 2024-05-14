package modelo;


public abstract class AbsPropriedades implements IMetodos
{
  
    public Double temp;
    public String temperatura;
    public String tipo;

    public AbsPropriedades(Double temp, String tipo)
    {
        this.temp = temp;
        this.tipo = tipo;
    }

    public AbsPropriedades(String termperatura, String tipo)
    {
        this.temperatura = termperatura;
        this.tipo = tipo;
    }

    public AbsPropriedades(String termperatura)
    {
        this.temperatura = termperatura;
    }

    @Override
    public String toString()
    {
        return "AbsPropriedades{" + "temp=" + temp + ", temperatura=" + temperatura + ", tipo=" + tipo + '}';
    }
    
}

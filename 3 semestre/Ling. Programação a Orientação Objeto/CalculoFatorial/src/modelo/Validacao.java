package modelo;

<<<<<<< HEAD

public class Validacao extends AbsPropriedades
{

=======
public class Validacao extends AbsPropriedades
{
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
    public Validacao(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        try
        {
<<<<<<< HEAD
           this.num = Integer.parseInt(this.numero);
        } 
        catch (Exception e)
        {
            Estaticos.MENSAGEM = "Digite números validos!";
=======
            this.num = Integer.parseInt(this.numero);
        }
        catch (Exception e)
        {
            Estaticos.MENSAGEM = "Digite números válidos";
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
        }
    }
    
}

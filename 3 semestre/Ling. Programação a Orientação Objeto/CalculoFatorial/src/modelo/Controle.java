package modelo;

<<<<<<< HEAD

=======
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
public class Controle extends AbsPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
<<<<<<< HEAD
      Estaticos.MENSAGEM = "";
      // Validacao validacao = new Validacao(this.numero);
      AbsPropriedades validacao = new Validacao(this.numero);
      if (Estaticos.MENSAGEM.equals(""))
      {
          // CalculoFatorial calculoFatorial = new CalculoFatorial(validacao.num);
          AbsPropriedades calculoFatorial = new CalculoFatorial(validacao.num);
          this.numero = calculoFatorial.toString();
      }
=======
        Estaticos.MENSAGEM = "";
        //Validacao validacao = new Validacao(this.numero);
        AbsPropriedades validacao = new Validacao(this.numero);
        if (Estaticos.MENSAGEM.equals(""))
        {
            AbsPropriedades calculoFatorial = 
                    new CalculoFatorial(validacao.num);
            this.numero = calculoFatorial.toString();
        }
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
    }

    @Override
    public String toString()
    {
        return this.numero;
    }
    
<<<<<<< HEAD
=======
    
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
}

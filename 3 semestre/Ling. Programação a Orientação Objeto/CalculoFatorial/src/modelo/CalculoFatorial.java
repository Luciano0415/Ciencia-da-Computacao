package modelo;

<<<<<<< HEAD

=======
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
public class CalculoFatorial extends AbsPropriedades
{

    public CalculoFatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void Executar()
    {
<<<<<<< HEAD
         int base = num;
         for (int i = 1; i < base; i++)
             num *= i;
=======
        int base = num;
        for(int i = 1; i < base; i++)
            num *= i;
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
    }

    @Override
    public String toString()
    {
<<<<<<< HEAD
        return num.toString(); 
    }
    
=======
        return num.toString();
    }
    
    
>>>>>>> 52c9c1fd75e77b51432e917b94f6bf6798054475
}

package modelo;

public final class Triangulos extends AbsPropriedades
{

    public Triangulos(Double l1,Double l2,Double l3)
    {
        /*this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;*/
        super(l1, l2, l3);
        this.Executar();
    }
    
    private void Executar()
    {
        if (l1.equals(l2) && l2.equals(l3))
            this.resposta = "Triângulo equilátero";
        else
            if(!l1.equals(l2) && !l2.equals(l3) && !l1.equals(l3))
                this.resposta = "Triângulo escaleno";
            else
                this.resposta = "Triângulo isósceles";
    }
    
}

public class BombaCombustivel {
    String tipoCombustivel;
    Double valorLitro;
    Double quantidadeCombustivel;

    public BombaCombustivel(String init_tipo, Double init_valor, Double init_quantidade) {
        this.tipoCombustivel = init_tipo;
        this.valorLitro = init_valor;
        this.quantidadeCombustivel = init_quantidade;
    }

//========================================================================================

    public void abastecerPorValor(Double valor) {
        Double litragem = valor / valorLitro; 
        if (quantidadeCombustivel >= litragem) {
            quantidadeCombustivel -= litragem;
            System.out.printf("Você abasteceu %.2f litos de %s com %.2fR$\n",litragem, tipoCombustivel, valor);
           
        } else {
            System.out.println("A bomba não tem combustível o bastante.");
        }
    }

    public void abastecerPorLitro(Double litragem) {
        Double valor = litragem * valorLitro;
        if (quantidadeCombustivel >= litragem) {
            quantidadeCombustivel -= litragem;
            System.out.printf("Você abasteceu %.2f litos de %s com %.2fR$\n",litragem, tipoCombustivel, valor);
        } else {
            System.out.println("A bomba não tem combustível o bastante.");
        }
    }
 
    public void alterarCombustivel(String conbustivel, Double preco) {
        tipoCombustivel = conbustivel;
        valorLitro = preco;
    }

    public void combustivelNaBomba(Double litragem) {
        if (quantidadeCombustivel + litragem > 0) {
            quantidadeCombustivel += litragem;
            System.out.printf("Agora a litragem da bomba é de %.2f litros\n",quantidadeCombustivel);
        } else {
            System.out.println("A Quamtidade de combustível na bomba não pode ser negativa.");
        }
    }

    public void feedback() {
        System.out.printf("\n> > > > Feedback < < < < \nLitros de combustível = %.2fL \nTipo de combustível   = %s \nValor do litro        = %.2fR$\n",quantidadeCombustivel, tipoCombustivel, valorLitro);
    }

//========================================================================================

    public static void main(String[] args) {
        BombaCombustivel bomba01 = new BombaCombustivel("Gasolina", 7.3, 100.0);
        bomba01.abastecerPorValor(50.0);
        bomba01.abastecerPorLitro(50.0);
        bomba01.combustivelNaBomba(50.0);
        bomba01.alterarCombustivel("Disel", 6.7);
        bomba01.feedback();
    }
}
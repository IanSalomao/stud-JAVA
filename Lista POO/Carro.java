public class Carro {
    Double tanque;
    Double Km_por_L;

    public Carro(Double initKm_por_l) {
        this.tanque = 0.0;
        this.Km_por_L = initKm_por_l;
    }

    public void andar(Double Km) {
        if (tanque >= Km/Km_por_L) {
            tanque -= Km/Km_por_L;
            System.out.printf("O carro percorreu %.1fKm com %.2fL\n", Km, Km/Km_por_L);
        } else {
            System.out.println("o carro não tem combustível para percorrer essa distância.");
        }
    }

    public void abastecer(Double litragem){
        if (litragem > 0) {      
            tanque+=litragem;
            System.out.printf("Você abasteceu %.2fL de combustível\n", litragem);

        } else {
            System.out.println("Você não pode abastecer com valores abaixo de 0.");
        } 
    }
    
    public void getTanque() {
        System.out.printf("O carro possui %.2fL de combustível.\n",tanque);
    }

    public void setKm_por_L(Double km_por_L) {
        Km_por_L = km_por_L;
        System.out.printf("O carro agora faz %.2fKm por litro.\n", km_por_L);
    }

//========================================================================================
    public static void main(String[] args) {
        Carro subuwu = new Carro(9.0);
        subuwu.abastecer(50.0);
        subuwu.andar(20.0);
        subuwu.getTanque();
        subuwu.andar(200.0);
        subuwu.getTanque();

    }

}

public class TestaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Kwid");
        carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.50));

        Carro carro2 = new Carro("Preto", "Ka", 50);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.50));


    }
}

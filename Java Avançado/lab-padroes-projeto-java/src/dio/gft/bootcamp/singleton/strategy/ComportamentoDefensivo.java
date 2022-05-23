package dio.gft.bootcamp.singleton.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo defensivamente...");
    }
}

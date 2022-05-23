package dio.gft.bootcamp.singleton.strategy;

public class ComportamentAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo agressivamente...");
    }
}

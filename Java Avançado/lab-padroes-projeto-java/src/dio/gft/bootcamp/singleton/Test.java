package dio.gft.bootcamp.singleton;

import dio.gft.bootcamp.singleton.facade.Facade;
import dio.gft.bootcamp.singleton.singleton.SingletonEager;
import dio.gft.bootcamp.singleton.singleton.SingletonLazy;
import dio.gft.bootcamp.singleton.singleton.SingletonLazyHolder;
import dio.gft.bootcamp.singleton.strategy.*;

public class Test {
    public static void main(String[] args) {

        //singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("Thiago", "88115520");
    }
}

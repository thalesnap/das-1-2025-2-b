package br.univille.observer;

public class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String context) {
        System.out.println(name + " recebeu atualizacao: " + context);
    }

}

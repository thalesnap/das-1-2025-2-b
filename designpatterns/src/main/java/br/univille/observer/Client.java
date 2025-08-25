package br.univille.observer;

public class Client {
    public static void main(String[] args) {
        var publisher = new Publisher();

        Subscriber s1 = new ConcreteSubscriber("Pedri");
        Subscriber s2 = new ConcreteSubscriber("Gavi");
        Subscriber s3 = new ConcreteSubscriber("Dimoa");

        publisher.addSubscriber(s1);
        publisher.addSubscriber(s2);
        publisher.addSubscriber(s3);

        publisher.setMainState("Entrou" );

        System.out.println("--- --- ---");

        publisher.removeSubscriber(s1);
        publisher.setMainState("Pedri saiu" );

        System.out.println("--- --- ---");

        publisher.addSubscriber(s1);
        publisher.setMainState("Pedri entrou" );
        
    }
}
package org.example.behavioral.visitor.basic;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal monkey = new Monkey();

        AnimalVisitor feedingVisitor = new FeedingVisitor();
        AnimalVisitor playVisitor = new PlayVisitor();

        lion.accept(feedingVisitor);
        monkey.accept(feedingVisitor);

        lion.accept(playVisitor);
        monkey.accept(playVisitor);

    }
}

package org.example.behavioral.visitor.basic;

public class PlayVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Playing with the lion with a ball.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Playing catch with the monkey.");
    }
}

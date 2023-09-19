package org.example.behavioral.visitor.basic;

public class FeedingVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding the lion.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Feeding the monkey with bananas.");
    }
}

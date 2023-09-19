package org.example.behavioral.visitor.parametrized;

import org.example.behavioral.visitor.basic.Lion;
import org.example.behavioral.visitor.basic.Monkey;

public class FeedingVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion, Object foodAmount) {
        System.out.println("Feeding the lion with " + foodAmount + " units of food.");
    }

    @Override
    public void visit(Monkey monkey, Object bananas) {
        System.out.println("Feeding the monkey with " + bananas + " bananas.");
    }
}

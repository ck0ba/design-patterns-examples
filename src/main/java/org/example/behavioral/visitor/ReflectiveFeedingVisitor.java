package org.example.behavioral.visitor;

import org.example.behavioral.visitor.basic.Lion;
import org.example.behavioral.visitor.basic.Monkey;

public class ReflectiveFeedingVisitor implements ReflectiveVisitor {
    @Override
    public void visit(Object element) {
        if (element instanceof Lion) {
            System.out.println("Feeding the lion.");
        } else if (element instanceof Monkey) {
            System.out.println("Feeding the monkey with bananas.");
        }
    }
}
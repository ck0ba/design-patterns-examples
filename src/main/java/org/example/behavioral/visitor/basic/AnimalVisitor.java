package org.example.behavioral.visitor.basic;

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Monkey monkey);
}


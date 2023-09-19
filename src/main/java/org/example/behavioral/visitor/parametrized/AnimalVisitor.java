package org.example.behavioral.visitor.parametrized;

import org.example.behavioral.visitor.basic.Lion;
import org.example.behavioral.visitor.basic.Monkey;

public interface AnimalVisitor {
    void visit(Lion lion, Object data);
    void visit(Monkey monkey, Object data);
}


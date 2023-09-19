package org.example.behavioral.visitor.returnvalues;

import org.example.behavioral.visitor.basic.Lion;
import org.example.behavioral.visitor.basic.Monkey;

public interface AnimalVisitor<T> {
    T visit(Lion lion);
    T visit(Monkey monkey);
}


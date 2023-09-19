package org.example.behavioral.visitor.returnvalues;

import org.example.behavioral.visitor.basic.Lion;
import org.example.behavioral.visitor.basic.Monkey;

public class HealthCheckVisitor implements AnimalVisitor<String> {
    @Override
    public String visit(Lion lion) {
        return "Lion is healthy!";
    }

    @Override
    public String visit(Monkey monkey) {
        return "Monkey looks energetic!";
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;

class StructuralEvaluator$Not
extends StructuralEvaluator {
    public StructuralEvaluator$Not(Evaluator evaluator) {
        super(evaluator);
    }

    public int cost() {
        return this.evaluator.cost() + 2;
    }

    public boolean matches(Element element, Element element2) {
        return this.memoMatches(element, element2) ^ true;
    }

    public String toString() {
        Evaluator evaluator = this.evaluator;
        Object[] objectArray = new Object[]{evaluator};
        return String.format(":not(%s)", objectArray);
    }
}


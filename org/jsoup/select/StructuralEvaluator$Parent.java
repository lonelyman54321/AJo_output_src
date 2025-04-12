/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;

class StructuralEvaluator$Parent
extends StructuralEvaluator {
    public StructuralEvaluator$Parent(Evaluator evaluator) {
        super(evaluator);
    }

    public int cost() {
        return this.evaluator.cost() * 2;
    }

    public boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        for (element2 = element2.parent(); element2 != null; element2 = element2.parent()) {
            boolean bl2 = this.memoMatches(element, element2);
            if (bl2) {
                return true;
            }
            if (element2 == element) break;
        }
        return false;
    }

    public String toString() {
        Evaluator evaluator = this.evaluator;
        Object[] objectArray = new Object[]{evaluator};
        return String.format("%s ", objectArray);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;

class StructuralEvaluator$PreviousSibling
extends StructuralEvaluator {
    public StructuralEvaluator$PreviousSibling(Evaluator evaluator) {
        super(evaluator);
    }

    public int cost() {
        return this.evaluator.cost() * 3;
    }

    public boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        for (Element element3 = element2.firstElementSibling(); element3 != null && element3 != element2; element3 = element3.nextElementSibling()) {
            boolean bl2 = this.memoMatches(element, element3);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        Evaluator evaluator = this.evaluator;
        Object[] objectArray = new Object[]{evaluator};
        return String.format("%s ~ ", objectArray);
    }
}


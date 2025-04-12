/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;

class StructuralEvaluator$ImmediatePreviousSibling
extends StructuralEvaluator {
    public StructuralEvaluator$ImmediatePreviousSibling(Evaluator evaluator) {
        super(evaluator);
    }

    public int cost() {
        return this.evaluator.cost() + 2;
    }

    public boolean matches(Element element, Element element2) {
        boolean bl2;
        boolean bl3 = false;
        if (element == element2) {
            return false;
        }
        if ((element2 = element2.previousElementSibling()) != null && (bl2 = this.memoMatches(element, element2))) {
            bl3 = true;
        }
        return bl3;
    }

    public String toString() {
        Evaluator evaluator = this.evaluator;
        Object[] objectArray = new Object[]{evaluator};
        return String.format("%s + ", objectArray);
    }
}


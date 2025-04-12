/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator$IndexEvaluator;

public final class Evaluator$IndexLessThan
extends Evaluator$IndexEvaluator {
    public Evaluator$IndexLessThan(int n3) {
        super(n3);
    }

    public boolean matches(Element element, Element element2) {
        int n3;
        int n4;
        if (element != element2 && (n4 = element2.elementSiblingIndex()) < (n3 = this.index)) {
            n4 = 1;
        } else {
            n4 = 0;
            element = null;
        }
        return n4 != 0;
    }

    public String toString() {
        Integer n3 = this.index;
        Object[] objectArray = new Object[]{n3};
        return String.format(":lt(%d)", objectArray);
    }
}


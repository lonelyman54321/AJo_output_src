/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator$IndexEvaluator;

public final class Evaluator$IndexGreaterThan
extends Evaluator$IndexEvaluator {
    public Evaluator$IndexGreaterThan(int n3) {
        super(n3);
    }

    public boolean matches(Element element, Element element2) {
        int n3;
        int n4 = element2.elementSiblingIndex();
        n4 = n4 > (n3 = this.index) ? 1 : 0;
        return n4 != 0;
    }

    public String toString() {
        Integer n3 = this.index;
        Object[] objectArray = new Object[]{n3};
        return String.format(":gt(%d)", objectArray);
    }
}


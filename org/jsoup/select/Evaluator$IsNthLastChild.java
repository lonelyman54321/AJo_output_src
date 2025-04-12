/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator$CssNthEvaluator;

public final class Evaluator$IsNthLastChild
extends Evaluator$CssNthEvaluator {
    public Evaluator$IsNthLastChild(int n3, int n4) {
        super(n3, n4);
    }

    public int calculatePosition(Element element, Element element2) {
        element = element2.parent();
        if (element == null) {
            return 0;
        }
        int n3 = element2.parent().childrenSize();
        int n4 = element2.elementSiblingIndex();
        return n3 - n4;
    }

    public String getPseudoClass() {
        return "nth-last-child";
    }
}


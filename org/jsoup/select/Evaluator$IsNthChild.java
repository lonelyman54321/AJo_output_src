/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator$CssNthEvaluator;

public final class Evaluator$IsNthChild
extends Evaluator$CssNthEvaluator {
    public Evaluator$IsNthChild(int n3, int n4) {
        super(n3, n4);
    }

    public int calculatePosition(Element element, Element element2) {
        return element2.elementSiblingIndex() + 1;
    }

    public String getPseudoClass() {
        return "nth-child";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator$CssNthEvaluator;

public class Evaluator$IsNthLastOfType
extends Evaluator$CssNthEvaluator {
    public Evaluator$IsNthLastOfType(int n3, int n4) {
        super(n3, n4);
    }

    public int calculatePosition(Element element, Element element2) {
        element = element2.parent();
        int n3 = 0;
        if (element == null) {
            return 0;
        }
        for (element = element2; element != null; element = element.nextElementSibling()) {
            String string2;
            String string3 = element.normalName();
            boolean bl2 = string3.equals(string2 = element2.normalName());
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public String getPseudoClass() {
        return "nth-last-of-type";
    }
}


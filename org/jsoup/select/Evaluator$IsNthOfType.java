/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator$CssNthEvaluator;

public class Evaluator$IsNthOfType
extends Evaluator$CssNthEvaluator {
    public Evaluator$IsNthOfType(int n3, int n4) {
        super(n3, n4);
    }

    public int calculatePosition(Element element, Element element2) {
        element = element2.parent();
        if (element == null) {
            return 0;
        }
        int n3 = element.childNodeSize();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            Node node = element.childNode(i3);
            String string3 = node.normalName();
            boolean bl2 = string3.equals(string2 = element2.normalName());
            if (bl2) {
                ++n4;
            }
            if (node == element2) break;
        }
        return n4;
    }

    public String getPseudoClass() {
        return "nth-of-type";
    }
}


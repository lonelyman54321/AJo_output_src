/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$IsOnlyOfType
extends Evaluator {
    public boolean matches(Element element, Element element2) {
        int n3;
        element = element2.parent();
        boolean bl2 = false;
        if (element != null && (n3 = element instanceof Document) == 0) {
            int n4;
            element = element.firstElementChild();
            n3 = 0;
            while (true) {
                String string2;
                n4 = 1;
                if (element == null) break;
                String string3 = element.normalName();
                boolean bl3 = string3.equals(string2 = element2.normalName());
                if (bl3) {
                    ++n3;
                }
                if (n3 > n4) break;
                element = element.nextElementSibling();
            }
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public String toString() {
        return ":only-of-type";
    }
}


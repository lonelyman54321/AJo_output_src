/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$IsLastChild
extends Evaluator {
    public boolean matches(Element element, Element element2) {
        boolean bl2;
        boolean bl3;
        element = element2.parent();
        if (element != null && !(bl3 = element instanceof Document) && element2 == (element = element.lastElementChild())) {
            bl2 = true;
        } else {
            bl2 = false;
            element = null;
        }
        return bl2;
    }

    public String toString() {
        return ":last-child";
    }
}


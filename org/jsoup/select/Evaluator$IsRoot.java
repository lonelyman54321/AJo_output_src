/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$IsRoot
extends Evaluator {
    public int cost() {
        return 1;
    }

    public boolean matches(Element element, Element element2) {
        boolean bl2;
        boolean bl3 = element instanceof Document;
        if (bl3) {
            element = element.firstElementChild();
        }
        if (element2 == element) {
            bl2 = true;
        } else {
            bl2 = false;
            element = null;
        }
        return bl2;
    }

    public String toString() {
        return ":root";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

class StructuralEvaluator$Root
extends Evaluator {
    public int cost() {
        return 1;
    }

    public boolean matches(Element element, Element element2) {
        boolean bl2;
        if (element == element2) {
            bl2 = true;
        } else {
            bl2 = false;
            element = null;
        }
        return bl2;
    }

    public String toString() {
        return "";
    }
}


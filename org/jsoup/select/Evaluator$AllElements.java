/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$AllElements
extends Evaluator {
    public int cost() {
        return 10;
    }

    public boolean matches(Element element, Element element2) {
        return true;
    }

    public String toString() {
        return "*";
    }
}


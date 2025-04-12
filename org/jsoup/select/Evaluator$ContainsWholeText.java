/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$ContainsWholeText
extends Evaluator {
    private final String searchText;

    public Evaluator$ContainsWholeText(String string2) {
        this.searchText = string2;
    }

    public int cost() {
        return 10;
    }

    public boolean matches(Element object, Element object2) {
        object = ((Element)object2).wholeText();
        object2 = this.searchText;
        return ((String)object).contains((CharSequence)object2);
    }

    public String toString() {
        String string2 = this.searchText;
        return cP.a(":containsWholeText(", string2, ")");
    }
}


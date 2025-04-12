/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$ContainsWholeOwnText
extends Evaluator {
    private final String searchText;

    public Evaluator$ContainsWholeOwnText(String string2) {
        this.searchText = string2;
    }

    public boolean matches(Element object, Element object2) {
        object = ((Element)object2).wholeOwnText();
        object2 = this.searchText;
        return ((String)object).contains((CharSequence)object2);
    }

    public String toString() {
        String string2 = this.searchText;
        return cP.a(":containsWholeOwnText(", string2, ")");
    }
}


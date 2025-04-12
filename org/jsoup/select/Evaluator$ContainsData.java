/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$ContainsData
extends Evaluator {
    private final String searchText;

    public Evaluator$ContainsData(String string2) {
        this.searchText = string2 = Normalizer.lowerCase(string2);
    }

    public boolean matches(Element object, Element object2) {
        object = Normalizer.lowerCase(((Element)object2).data());
        object2 = this.searchText;
        return ((String)object).contains((CharSequence)object2);
    }

    public String toString() {
        String string2 = this.searchText;
        return cP.a(":containsData(", string2, ")");
    }
}


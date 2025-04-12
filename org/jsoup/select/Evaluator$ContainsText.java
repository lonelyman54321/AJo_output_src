/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$ContainsText
extends Evaluator {
    private final String searchText;

    public Evaluator$ContainsText(String string2) {
        this.searchText = string2 = Normalizer.lowerCase(StringUtil.normaliseWhitespace(string2));
    }

    public int cost() {
        return 10;
    }

    public boolean matches(Element object, Element object2) {
        object = Normalizer.lowerCase(((Element)object2).text());
        object2 = this.searchText;
        return ((String)object).contains((CharSequence)object2);
    }

    public String toString() {
        String string2 = this.searchText;
        return cP.a(":contains(", string2, ")");
    }
}


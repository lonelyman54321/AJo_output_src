/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$Tag
extends Evaluator {
    private final String tagName;

    public Evaluator$Tag(String string2) {
        this.tagName = string2;
    }

    public int cost() {
        return 1;
    }

    public boolean matches(Element object, Element object2) {
        object = ((Element)object2).normalName();
        object2 = this.tagName;
        return ((String)object).equals(object2);
    }

    public String toString() {
        String string2 = this.tagName;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}


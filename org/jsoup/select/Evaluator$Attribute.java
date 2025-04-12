/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$Attribute
extends Evaluator {
    private final String key;

    public Evaluator$Attribute(String string2) {
        this.key = string2;
    }

    public int cost() {
        return 2;
    }

    public boolean matches(Element object, Element element) {
        object = this.key;
        return element.hasAttr((String)object);
    }

    public String toString() {
        String string2 = this.key;
        return cP.a("[", string2, "]");
    }
}


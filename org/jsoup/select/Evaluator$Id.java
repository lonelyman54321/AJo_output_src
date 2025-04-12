/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$Id
extends Evaluator {
    private final String id;

    public Evaluator$Id(String string2) {
        this.id = string2;
    }

    public int cost() {
        return 2;
    }

    public boolean matches(Element object, Element object2) {
        object = this.id;
        object2 = ((Element)object2).id();
        return ((String)object).equals(object2);
    }

    public String toString() {
        String string2 = this.id;
        return kp1_0.c("#", string2);
    }
}


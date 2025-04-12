/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$Class
extends Evaluator {
    private final String className;

    public Evaluator$Class(String string2) {
        this.className = string2;
    }

    public int cost() {
        return 6;
    }

    public boolean matches(Element object, Element element) {
        object = this.className;
        return element.hasClass((String)object);
    }

    public String toString() {
        String string2 = this.className;
        return kp1_0.c(".", string2);
    }
}


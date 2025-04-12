/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator$AttributeKeyPair;

public final class Evaluator$AttributeWithValueNot
extends Evaluator$AttributeKeyPair {
    public Evaluator$AttributeWithValueNot(String string2, String string3) {
        super(string2, string3);
    }

    public int cost() {
        return 3;
    }

    public boolean matches(Element object, Element object2) {
        object = this.value;
        String string2 = this.key;
        object2 = ((Node)object2).attr(string2);
        return ((String)object).equalsIgnoreCase((String)object2) ^ true;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("[", string2, "!=", string3, "]");
    }
}


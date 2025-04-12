/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator$AttributeKeyPair;

public final class Evaluator$AttributeWithValue
extends Evaluator$AttributeKeyPair {
    public Evaluator$AttributeWithValue(String string2, String string3) {
        super(string2, string3);
    }

    public int cost() {
        return 3;
    }

    public boolean matches(Element object, Element object2) {
        String string2;
        object = this.key;
        boolean bl2 = ((Node)object2).hasAttr((String)object);
        if (bl2 && (bl2 = ((String)(object = this.value)).equalsIgnoreCase((String)(object2 = ((Node)object2).attr(string2 = this.key).trim())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("[", string2, "=", string3, "]");
    }
}


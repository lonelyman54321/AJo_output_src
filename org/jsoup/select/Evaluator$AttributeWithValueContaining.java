/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator$AttributeKeyPair;

public final class Evaluator$AttributeWithValueContaining
extends Evaluator$AttributeKeyPair {
    public Evaluator$AttributeWithValueContaining(String string2, String string3) {
        super(string2, string3);
    }

    public int cost() {
        return 6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean matches(Element object, Element object2) {
        object = this.key;
        boolean bl2 = ((Node)object2).hasAttr((String)object);
        if (!bl2) return false;
        object = this.key;
        bl2 = ((String)(object = Normalizer.lowerCase(((Node)object2).attr((String)object)))).contains((CharSequence)(object2 = this.value));
        if (!bl2) return false;
        return true;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("[", string2, "*=", string3, "]");
    }
}


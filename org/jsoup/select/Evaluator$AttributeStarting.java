/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$AttributeStarting
extends Evaluator {
    private final String keyPrefix;

    public Evaluator$AttributeStarting(String string2) {
        Validate.notEmpty(string2);
        this.keyPrefix = string2 = Normalizer.lowerCase(string2);
    }

    public int cost() {
        return 6;
    }

    public boolean matches(Element object, Element object2) {
        boolean bl2;
        object = ((Element)object2).attributes().asList().iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            object2 = Normalizer.lowerCase((String)((Attribute)object.next()).getKey());
            bl2 = ((String)object2).startsWith(string2 = this.keyPrefix);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        String string2 = this.keyPrefix;
        return cP.a("[^", string2, "]");
    }
}


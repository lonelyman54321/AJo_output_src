/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.safety.Safelist$TypedValue;

class Safelist$AttributeValue
extends Safelist$TypedValue {
    public Safelist$AttributeValue(String string2) {
        super(string2);
    }

    public static Safelist$AttributeValue valueOf(String string2) {
        Safelist$AttributeValue safelist$AttributeValue = new Safelist$AttributeValue(string2);
        return safelist$AttributeValue;
    }
}


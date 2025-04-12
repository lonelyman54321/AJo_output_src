/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.jsoup.safety.Safelist$TypedValue;

class Safelist$AttributeKey
extends Safelist$TypedValue {
    public Safelist$AttributeKey(String string2) {
        super(string2);
    }

    public static Safelist$AttributeKey valueOf(String string2) {
        string2 = Normalizer.lowerCase(string2);
        Safelist$AttributeKey safelist$AttributeKey = new Safelist$AttributeKey(string2);
        return safelist$AttributeKey;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.jsoup.safety.Safelist$TypedValue;

class Safelist$TagName
extends Safelist$TypedValue {
    public Safelist$TagName(String string2) {
        super(string2);
    }

    public static Safelist$TagName valueOf(String string2) {
        string2 = Normalizer.lowerCase(string2);
        Safelist$TagName safelist$TagName = new Safelist$TagName(string2);
        return safelist$TagName;
    }
}


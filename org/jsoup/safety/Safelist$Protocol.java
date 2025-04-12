/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.safety.Safelist$TypedValue;

class Safelist$Protocol
extends Safelist$TypedValue {
    public Safelist$Protocol(String string2) {
        super(string2);
    }

    public static Safelist$Protocol valueOf(String string2) {
        Safelist$Protocol safelist$Protocol = new Safelist$Protocol(string2);
        return safelist$Protocol;
    }
}


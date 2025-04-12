/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.internal;

import java.util.Locale;

public final class Normalizer {
    public static String lowerCase(String string2) {
        if (string2 != null) {
            Locale locale = Locale.ENGLISH;
            string2 = string2.toLowerCase(locale);
        } else {
            string2 = "";
        }
        return string2;
    }

    public static String normalize(String string2) {
        return Normalizer.lowerCase(string2).trim();
    }

    public static String normalize(String string2, boolean bl2) {
        string2 = bl2 ? Normalizer.lowerCase(string2) : Normalizer.normalize(string2);
        return string2;
    }
}


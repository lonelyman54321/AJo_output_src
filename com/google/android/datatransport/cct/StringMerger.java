/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

public final class StringMerger {
    public static String mergeStrings(String object, String string2) {
        int n3 = ((String)object).length();
        int n4 = string2.length();
        if ((n3 -= n4) >= 0 && n3 <= (n4 = 1)) {
            char c2;
            n4 = ((String)object).length();
            int c22 = string2.length() + n4;
            StringBuilder stringBuilder = new StringBuilder(c22);
            for (n4 = 0; n4 < (c2 = ((String)object).length()); ++n4) {
                c2 = ((String)object).charAt(n4);
                stringBuilder.append(c2);
                c2 = string2.length();
                if (c2 <= n4) continue;
                c2 = string2.charAt(n4);
                stringBuilder.append(c2);
            }
            return stringBuilder.toString();
        }
        object = new IllegalArgumentException("Invalid input received");
        throw object;
    }
}


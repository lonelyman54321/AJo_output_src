/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zze {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String string2) {
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0) {
            int n4;
            Matcher matcher = zza.matcher(string2);
            StringBuilder stringBuilder = null;
            int n7 = 0;
            Object object = null;
            while ((n4 = matcher.find()) != 0) {
                char c2;
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                int n8 = n4 = matcher.start();
                while (true) {
                    char c3;
                    c2 = '\\';
                    if (n8 < 0 || (c3 = string2.charAt(n8)) != c2) break;
                    n8 += -1;
                }
                n4 -= n8;
                n8 = 2;
                if ((n4 %= n8) == 0) continue;
                String string3 = matcher.group().substring(n8);
                n4 = Integer.parseInt(string3, 16);
                n8 = matcher.start();
                stringBuilder.append(string2, n7, n8);
                if (n4 == c2) {
                    object = "\\\\";
                    stringBuilder.append((String)object);
                } else {
                    object = Character.toChars(n4);
                    stringBuilder.append((char[])object);
                }
                n7 = matcher.end();
            }
            if (stringBuilder != null) {
                n4 = matcher.regionEnd();
                if (n7 < n4) {
                    n3 = matcher.regionEnd();
                    stringBuilder.append(string2, n7, n3);
                }
                string2 = stringBuilder.toString();
            }
        }
        return string2;
    }
}


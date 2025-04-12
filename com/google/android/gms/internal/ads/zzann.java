/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import java.util.regex.Pattern;

public final class zzann {
    private static final Pattern zza = Pattern.compile("^NOTE([ \t].*)?$");

    public static float zza(String object) {
        String string2 = "%";
        boolean n3 = ((String)object).endsWith(string2);
        if (n3) {
            int n4 = ((String)object).length() + -1;
            return Float.parseFloat(((String)object).substring(0, n4)) / 100.0f;
        }
        object = new NumberFormatException("Percentages must end with %");
        throw object;
    }

    public static long zzb(String object) {
        int n3 = 1;
        int n4 = zzgd.zza;
        int n7 = 2;
        object = object.split("\\.", n7);
        String[] stringArray = object[0];
        String string2 = ":";
        int n8 = -1;
        stringArray = stringArray.split(string2, n8);
        int n10 = stringArray.length;
        long l2 = 0L;
        for (n4 = 0; n4 < n10; n4 += n3) {
            String string3 = stringArray[n4];
            long l3 = 60;
            l2 *= l3;
            long l4 = Long.parseLong(string3);
            l2 += l4;
        }
        long l7 = 1000L;
        l2 *= l7;
        n4 = ((String[])object).length;
        if (n4 == n7) {
            object = object[n3];
            long l8 = Long.parseLong((String)object);
            l2 += l8;
        }
        return l2 * l7;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Serializable serializable;
        Locale locale = Locale.ROOT;
        zza = serializable = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = serializable = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        serializable = new StringBuilder(33);
        zzc = serializable;
    }

    public static String zza(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            SimpleDateFormat simpleDateFormat = zza;
            Date date = new Date(l2);
            return simpleDateFormat.format(date);
        }
        return Long.toString(l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zzb(long l2) {
        StringBuilder stringBuilder = zzc;
        synchronized (stringBuilder) {
            stringBuilder.setLength(0);
            zzeo.zzc(l2, stringBuilder);
            return stringBuilder.toString();
        }
    }

    public static StringBuilder zzc(long l2, StringBuilder stringBuilder) {
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        String string2;
        long l14 = 0L;
        long l15 = l2 - l14;
        Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object == false) {
            stringBuilder.append("0s");
            return stringBuilder;
        }
        int n3 = stringBuilder.length() + 27;
        stringBuilder.ensureCapacity(n3);
        n3 = 1;
        int n4 = 0;
        String string3 = null;
        if (object < 0) {
            string2 = "-";
            stringBuilder.append(string2);
            l12 = Long.MIN_VALUE;
            object = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
            if (object != false) {
                l2 = -l2;
            } else {
                l2 = Long.MAX_VALUE;
                n4 = 1;
            }
        }
        if ((object = (l8 = l2 - (l12 = 86400000L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0) {
            long l16 = l2 / l12;
            stringBuilder.append(l16);
            string2 = "d";
            stringBuilder.append(string2);
            l2 %= l12;
        }
        if (n3 == n4) {
            l2 = 25975808L;
        }
        long l17 = 3600000L;
        n4 = (int)(l2 == l17 ? 0 : (l2 < l17 ? -1 : 1));
        if (n4 >= 0) {
            l7 = l2 / l17;
            stringBuilder.append(l7);
            string3 = "h";
            stringBuilder.append(string3);
            l2 %= l17;
        }
        if ((n4 = (int)((l4 = l2 - (l17 = 60000L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) >= 0) {
            l7 = l2 / l17;
            stringBuilder.append(l7);
            string3 = "m";
            stringBuilder.append(string3);
            l2 %= l17;
        }
        if ((n4 = (int)((l3 = l2 - (l17 = 1000L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) >= 0) {
            l7 = l2 / l17;
            stringBuilder.append(l7);
            string3 = "s";
            stringBuilder.append(string3);
            l2 %= l17;
        }
        if ((object = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1)) > 0) {
            stringBuilder.append(l2);
            String string4 = "ms";
            stringBuilder.append(string4);
        }
        return stringBuilder;
    }
}


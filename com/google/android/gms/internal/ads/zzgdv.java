/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzgdv {
    public static long zza(String string2, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(l2);
        stringBuilder.append(") must be >= 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void zzb(boolean bl2) {
        if (bl2) {
            return;
        }
        ArithmeticException arithmeticException = new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        throw arithmeticException;
    }
}


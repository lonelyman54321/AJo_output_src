/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzqt
extends Exception {
    public zzqt(long l2, long l3) {
        StringBuilder stringBuilder = D70.c(l3, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
        stringBuilder.append(l2);
        String string2 = stringBuilder.toString();
        super(string2);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzn;

final class zzo
extends zzn {
    private final char zza;

    public zzo(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        int n3 = 6;
        Object object = new char[n3];
        object[0] = 92;
        object[1] = 117;
        object[2] = '\u0000';
        object[3] = '\u0000';
        int n4 = 4;
        object[n4] = '\u0000';
        object[5] = '\u0000';
        int n7 = this.zza;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = 5 - i3;
            int n10 = n7 & 0xF;
            String string2 = "0123456789ABCDEF";
            object[n8] = n10 = (int)string2.charAt(n10);
            n7 >>= n4;
        }
        object = String.copyValueOf(object);
        return cP.a("CharMatcher.is('", (String)object, "')");
    }

    public final boolean zza(char c2) {
        char c3 = this.zza;
        return c2 == c3;
    }
}


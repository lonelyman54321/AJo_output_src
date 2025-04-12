/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class zzay {
    final String zza;
    final byte[] zzb;

    public zzay(String string2, byte[] byArray) {
        this.zza = string2;
        this.zzb = byArray;
    }

    public final String toString() {
        int n3 = Arrays.hashCode(this.zzb);
        StringBuilder stringBuilder = new StringBuilder("KeyAndSerialized: key = ");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(" serialized hash = ");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}


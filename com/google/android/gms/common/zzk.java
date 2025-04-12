/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.zzj;
import java.util.Arrays;

final class zzk
extends zzj {
    private final byte[] zza;

    public zzk(byte[] byArray) {
        byte[] byArray2 = Arrays.copyOfRange(byArray, 0, 25);
        super(byArray2);
        this.zza = byArray;
    }

    public final byte[] zzf() {
        return this.zza;
    }
}


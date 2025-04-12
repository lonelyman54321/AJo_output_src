/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbc;
import com.google.android.gms.internal.clearcut.zzbf;
import java.util.Arrays;

final class zzbd
implements zzbf {
    private zzbd() {
    }

    public /* synthetic */ zzbd(zzbc zzbc2) {
        this();
    }

    public final byte[] zzc(byte[] byArray, int n3, int n4) {
        return Arrays.copyOfRange(byArray, n3, n4 += n3);
    }
}


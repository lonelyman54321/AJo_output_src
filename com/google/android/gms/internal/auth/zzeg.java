/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzei;

final class zzeg
extends zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = -1 >>> 1;

    public /* synthetic */ zzeg(byte[] byArray, int n3, int n4, boolean bl2, zzef zzef2) {
        super(null);
        this.zzb = byArray;
        this.zzc = 0;
    }

    public final int zza(int n3) {
        n3 = this.zze;
        this.zze = 0;
        int n4 = this.zzc;
        int n7 = this.zzd;
        this.zzc = n4 += n7;
        if (n4 > 0) {
            this.zzd = n4;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return n3;
    }
}


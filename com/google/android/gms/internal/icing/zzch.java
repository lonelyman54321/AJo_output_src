/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcg;
import com.google.android.gms.internal.icing.zzci;

final class zzch
extends zzci {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = -1 >>> 1;

    public /* synthetic */ zzch(byte[] byArray, int n3, int n4, boolean bl2, zzcg zzcg2) {
        super(null);
        this.zza = byArray;
        this.zzb = 0;
    }

    public final int zza(int n3) {
        n3 = this.zzd;
        this.zzd = 0;
        int n4 = this.zzb;
        int n7 = this.zzc;
        this.zzb = n4 += n7;
        if (n4 > 0) {
            this.zzc = n4;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return n3;
    }
}


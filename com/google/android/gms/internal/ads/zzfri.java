/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrk;

final class zzfri
extends zzfrf {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    public final zzfrf zza(String object) {
        if (object != null) {
            this.zza = object;
            return this;
        }
        object = new NullPointerException("Null clientVersion");
        throw object;
    }

    public final zzfrf zzb(boolean bl2) {
        byte by2;
        this.zzc = true;
        this.zzd = by2 = (byte)(this.zzd | 2);
        return this;
    }

    public final zzfrf zzc(boolean bl2) {
        byte by2;
        this.zzb = bl2;
        this.zzd = by2 = (byte)(this.zzd | 1);
        return this;
    }

    public final zzfrg zzd() {
        CharSequence charSequence;
        int n3 = this.zzd;
        int n4 = 3;
        if (n3 == n4 && (charSequence = this.zza) != null) {
            boolean bl2 = this.zzb;
            boolean bl3 = this.zzc;
            zzfrk zzfrk2 = new zzfrk((String)charSequence, bl2, bl3, null);
            return zzfrk2;
        }
        charSequence = new StringBuilder();
        Object object = this.zza;
        if (object == null) {
            object = " clientVersion";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((n4 = this.zzd & 1) == 0) {
            object = " shouldGetAdvertisingId";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((n4 = this.zzd & 2) == 0) {
            object = " isGooglePlayServicesAvailable";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = ((Object)charSequence).toString();
        charSequence = "Missing required properties:".concat((String)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }
}


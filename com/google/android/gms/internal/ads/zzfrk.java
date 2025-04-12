/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;

final class zzfrk
extends zzfrg {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfrk(String string2, boolean bl2, boolean bl3, zzfrj zzfrj2) {
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = bl3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        String string2;
        String string3;
        boolean bl4 = true;
        if (object == this) {
            return bl4;
        }
        boolean bl5 = object instanceof zzfrg;
        if (bl5 && (bl5 = (string3 = this.zza).equals(string2 = ((zzfrg)(object = (zzfrg)object)).zzb())) && (bl5 = this.zzb) == (bl3 = ((zzfrg)object).zzd()) && (bl5 = this.zzc) == (bl2 = ((zzfrg)object).zzc())) {
            return bl4;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zza;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        int n7 = this.zzb;
        int n8 = 1231;
        int n10 = 1;
        n7 = n10 != n7 ? 1237 : 1231;
        n3 = (n3 * n4 ^ n7) * n4;
        n4 = (int)(this.zzc ? 1 : 0);
        if (n10 != n4) {
            n8 = 1237;
        }
        return n3 ^ n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdShield2Options{clientVersion=");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", shouldGetAdvertisingId=");
        boolean bl2 = this.zzb;
        stringBuilder.append(bl2);
        stringBuilder.append(", isGooglePlayServicesAvailable=");
        bl2 = this.zzc;
        return Vm.a("}", bl2, stringBuilder);
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}


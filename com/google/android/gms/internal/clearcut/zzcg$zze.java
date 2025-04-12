/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzca;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zza;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzdp;
import com.google.android.gms.internal.clearcut.zzdv;
import com.google.android.gms.internal.clearcut.zzfl;
import com.google.android.gms.internal.clearcut.zzfq;

final class zzcg$zze
implements zzca {
    final int number;
    private final zzck zzjw = null;
    final zzfl zzjx;
    final boolean zzjy;
    final boolean zzjz;

    public zzcg$zze(zzck zzck2, int n3, zzfl zzfl2, boolean bl2, boolean bl3) {
        this.number = 66321687;
        this.zzjx = zzfl2;
        this.zzjy = false;
        this.zzjz = false;
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (zzcg$zze)object;
        int n3 = this.number;
        int n4 = ((zzcg$zze)object).number;
        return n3 - n4;
    }

    public final zzdp zza(zzdp zzdp2, zzdo zzdo2) {
        zzdp2 = (zzcg$zza)zzdp2;
        zzdo2 = (zzcg)zzdo2;
        return ((zzcg$zza)zzdp2).zza((zzcg)zzdo2);
    }

    public final zzdv zza(zzdv object, zzdv zzdv2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final zzfl zzau() {
        return this.zzjx;
    }

    public final zzfq zzav() {
        return this.zzjx.zzek();
    }

    public final boolean zzaw() {
        return false;
    }

    public final boolean zzax() {
        return false;
    }

    public final int zzc() {
        return this.number;
    }
}


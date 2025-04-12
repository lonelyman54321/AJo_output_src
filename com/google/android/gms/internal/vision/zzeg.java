/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;
import java.util.List;

final class zzeg
extends zzee {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzee zzc;

    public zzeg(zzee zzee2, int n3, int n4) {
        this.zzc = zzee2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzde.zza(n3, n4);
        zzee zzee2 = this.zzc;
        int n7 = this.zza;
        return zzee2.get(n3 += n7);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ List subList(int n3, int n4) {
        return this.zza(n3, n4);
    }

    public final zzee zza(int n3, int n4) {
        int n7 = this.zzb;
        zzde.zza(n3, n4, n7);
        zzee zzee2 = this.zzc;
        int n8 = this.zza;
        return (zzee)zzee2.subList(n3 += n8, n4 += n8);
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        return n3 + n4;
    }

    public final int zzd() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        n3 += n4;
        n4 = this.zzb;
        return n3 + n4;
    }

    public final boolean zzf() {
        return true;
    }
}


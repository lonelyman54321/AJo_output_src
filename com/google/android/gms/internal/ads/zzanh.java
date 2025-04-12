/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzanf;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzani;
import java.util.Comparator;

final class zzanh {
    private static final Comparator zza;
    private final zzani zzb;
    private final int zzc;

    static {
        zzanf zzanf2 = new zzanf();
        zza = zzanf2;
    }

    public /* synthetic */ zzanh(zzani zzani2, int n3, zzang zzang2) {
        this.zzb = zzani2;
        this.zzc = n3;
    }

    public static /* bridge */ /* synthetic */ int zza(zzanh zzanh2) {
        return zzanh2.zzc;
    }

    public static /* synthetic */ int zzb(zzanh zzanh2, zzanh zzanh3) {
        int n3 = zzanh2.zzb.zzb;
        int n4 = zzanh3.zzb.zzb;
        return Integer.compare(n3, n4);
    }

    public static /* bridge */ /* synthetic */ zzani zzc(zzanh zzanh2) {
        return zzanh2.zzb;
    }

    public static /* bridge */ /* synthetic */ Comparator zzd() {
        return zza;
    }
}


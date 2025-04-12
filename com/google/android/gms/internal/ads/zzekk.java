/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekl;

final class zzekk
extends zzbsx {
    final /* synthetic */ zzekl zza;
    private final zzeho zzb;

    public /* synthetic */ zzekk(zzekl zzekl2, zzeho zzeho2, zzekj zzekj2) {
        this.zza = zzekl2;
        this.zzb = zzeho2;
    }

    public final void zze(String string2) {
        ((zzejh)this.zzb.zzc).zzi(0, string2);
    }

    public final void zzf(zze zze2) {
        ((zzejh)this.zzb.zzc).zzh(zze2);
    }

    public final void zzg(zzbru zzbru2) {
        zzekl.zzc(this.zza, zzbru2);
        ((zzejh)this.zzb.zzc).zzo();
    }
}


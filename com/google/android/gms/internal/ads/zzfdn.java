/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzfdq;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfdn
implements zzgfa {
    public final /* synthetic */ zzfdq zza;
    public final /* synthetic */ zzfel zzb;
    public final /* synthetic */ zzfdp zzc;
    public final /* synthetic */ zzfej zzd;
    public final /* synthetic */ zzcys zze;

    public /* synthetic */ zzfdn(zzfdq zzfdq2, zzfel zzfel2, zzfdp zzfdp2, zzfej zzfej2, zzcys zzcys2) {
        this.zza = zzfdq2;
        this.zzb = zzfel2;
        this.zzc = zzfdp2;
        this.zzd = zzfej2;
        this.zze = zzcys2;
    }

    public final ListenableFuture zza(Object object) {
        zzfdq zzfdq2 = this.zza;
        zzfel zzfel2 = this.zzb;
        zzfdp zzfdp2 = this.zzc;
        zzfej zzfej2 = this.zzd;
        zzcys zzcys2 = this.zze;
        Object object2 = object;
        object2 = (zzfdv)object;
        return zzfdq2.zzb(zzfel2, zzfdp2, zzfej2, zzcys2, (zzfdv)object2);
    }
}


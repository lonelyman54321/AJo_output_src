/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzewx;
import com.google.android.gms.internal.ads.zzgez;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public final class zzewu
implements zzgez {
    public final /* synthetic */ zzewx zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ Bundle zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzewu(zzewx zzewx2, String string2, List list, Bundle bundle, boolean bl2, boolean bl3) {
        this.zza = zzewx2;
        this.zzb = string2;
        this.zzc = list;
        this.zzd = bundle;
        this.zze = bl2;
        this.zzf = bl3;
    }

    public final ListenableFuture zza() {
        zzewx zzewx2 = this.zza;
        String string2 = this.zzb;
        List list = this.zzc;
        Bundle bundle = this.zzd;
        boolean bl2 = this.zze;
        boolean bl3 = this.zzf;
        return zzewx2.zzd(string2, list, bundle, bl2, bl3);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfn
extends zzed$zzb {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzed zzi;

    public zzfn(zzed zzed2, Long l2, String string2, String string3, Bundle bundle, boolean bl2, boolean bl3) {
        this.zzc = l2;
        this.zzd = string2;
        this.zze = string3;
        this.zzf = bundle;
        this.zzg = bl2;
        this.zzh = bl3;
        this.zzi = zzed2;
        super(zzed2);
    }

    public final void zza() {
        Object object = this.zzc;
        long l2 = object == null ? this.zza : (Long)object;
        Object object2 = object = Preconditions.checkNotNull(zzed.zza(this.zzi));
        object2 = (zzdl)object;
        String string2 = this.zzd;
        String string3 = this.zze;
        Bundle bundle = this.zzf;
        boolean bl2 = this.zzg;
        boolean bl3 = this.zzh;
        object2.logEvent(string2, string3, bundle, bl2, bl3, l2);
    }
}


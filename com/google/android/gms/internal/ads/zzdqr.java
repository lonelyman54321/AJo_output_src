/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzdqs;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdqr
implements zzblp {
    final /* synthetic */ zzdqs zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzblp zzd;

    public /* synthetic */ zzdqr(zzdqs zzdqs2, WeakReference weakReference, String string2, zzblp zzblp2, zzdqq zzdqq2) {
        this.zza = zzdqs2;
        this.zzb = weakReference;
        this.zzc = string2;
        this.zzd = zzblp2;
    }

    public final void zza(Object object, Map object2) {
        object = this.zzb.get();
        if (object == null) {
            object = this.zza;
            object2 = this.zzc;
            ((zzdqs)object).zzn((String)object2, this);
            return;
        }
        this.zzd.zza(object, (Map)object2);
    }
}


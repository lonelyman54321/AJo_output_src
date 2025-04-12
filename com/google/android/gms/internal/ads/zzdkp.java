/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdko;
import com.google.android.gms.internal.ads.zzdkq;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdkp
implements zzblp {
    private final WeakReference zza;

    public /* synthetic */ zzdkp(zzdkq zzdkq2, zzdko weakReference) {
        this.zza = weakReference = new WeakReference<zzdkq>(zzdkq2);
    }

    public final void zza(Object object, Map map2) {
        object = (zzdkq)this.zza.get();
        if (object == null) {
            return;
        }
        zzdkq.zzc((zzdkq)object).zza();
    }
}


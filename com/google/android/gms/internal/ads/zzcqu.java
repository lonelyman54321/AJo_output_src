/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcqt;
import com.google.android.gms.internal.ads.zzcqv;
import java.util.Map;

final class zzcqu
implements zzblp {
    final /* synthetic */ zzcqv zza;

    public zzcqu(zzcqv zzcqv2) {
        this.zza = zzcqv2;
    }

    public final void zza(Object object, Map object2) {
        object = this.zza;
        boolean bl2 = zzcqv.zzg((zzcqv)object, (Map)object2);
        if (!bl2) {
            return;
        }
        object = zzcqv.zzb(this.zza);
        object2 = new zzcqt(this);
        object.execute((Runnable)object2);
    }
}


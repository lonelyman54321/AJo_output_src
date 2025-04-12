/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcqp;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.List;

final class zzcqo
implements zzgfp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcqp zzb;

    public zzcqo(zzcqp zzcqp2, String string2) {
        this.zza = string2;
        this.zzb = zzcqp2;
    }

    public final void zza(Throwable object) {
        object = this.zzb;
        zzfia zzfia2 = zzcqp.zzj((zzcqp)object);
        zzfoa zzfoa2 = zzcqp.zzk((zzcqp)object);
        zzfhf zzfhf2 = zzcqp.zzi((zzcqp)object);
        zzfgt zzfgt2 = zzcqp.zzh((zzcqp)object);
        List list = zzcqp.zzl((zzcqp)object);
        String string2 = this.zza;
        object = zzfoa2.zzd(zzfhf2, zzfgt2, false, string2, null, list);
        zzfia2.zza((List)object);
    }
}


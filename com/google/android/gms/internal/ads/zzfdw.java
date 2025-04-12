/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfds;
import com.google.android.gms.internal.ads.zzfdt;
import com.google.android.gms.internal.ads.zzfdu;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzfef;
import com.google.android.gms.internal.ads.zzfeg;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfdw
implements zzfek {
    private final zzfjc zza;
    private final Executor zzb;
    private final zzgfp zzc;

    public zzfdw(zzfjc zzfjc2, Executor executor) {
        zzfdu zzfdu2 = new zzfdu(this);
        this.zzc = zzfdu2;
        this.zza = zzfjc2;
        this.zzb = executor;
    }

    public final /* synthetic */ ListenableFuture zza(zzcys object, zzfef object2) {
        Object object3 = this.zza;
        zzfjm zzfjm2 = ((zzfef)object2).zzb;
        object2 = ((zzfef)object2).zza;
        if ((object3 = object3.zzb(zzfjm2)) != null && object2 != null) {
            object = object.zzb().zzh((zzbxu)object2);
            zzgfp zzgfp2 = this.zzc;
            Executor executor = this.zzb;
            zzgft.zzr((ListenableFuture)object, zzgfp2, executor);
        }
        object = new zzfdv(zzfjm2, (zzbxu)object2, (zzfjl)object3);
        return zzgft.zzh(object);
    }

    public final ListenableFuture zzb(zzfel object, zzfej object2, zzcys object3) {
        object2 = this.zza;
        Executor executor = this.zzb;
        object = new zzfeg((zzfjc)object2, (zzcys)object3, executor);
        object = zzgfk.zzu(((zzfeg)object).zzc());
        object2 = new zzfds(this, (zzcys)object3);
        object3 = this.zzb;
        object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
        object2 = new zzfdt(this);
        object3 = this.zzb;
        return zzgft.zze((ListenableFuture)object, Exception.class, (zzfxu)object2, (Executor)object3);
    }
}


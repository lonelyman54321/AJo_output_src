/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

public final class zzcfh
extends zzb {
    final zzcee zza;
    final zzcfp zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcfh(zzcee zzcee2, zzcfp zzcfp2, String string2, String[] stringArray) {
        this.zza = zzcee2;
        this.zzb = zzcfp2;
        this.zzc = string2;
        this.zzd = stringArray;
        zzu.zzy().zzb(this);
    }

    public final void zza() {
        String[] stringArray;
        Object object;
        Object object2;
        try {
            object2 = this.zzb;
        }
        catch (Throwable throwable) {
            object = zzt.zza;
            stringArray = new zzcfg(this);
            object.post((Runnable)stringArray);
            throw throwable;
        }
        object = this.zzc;
        stringArray = this.zzd;
        object2.zzu((String)object, stringArray);
        object2 = zzt.zza;
        object = new zzcfg(this);
        object2.post((Runnable)object);
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzbX;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = (object = this.zzb) instanceof zzcfy)) {
            object = zzcci.zze;
            object2 = new zzcff(this);
            return object.zzb((Callable)object2);
        }
        return super.zzb();
    }

    public final /* synthetic */ Boolean zzd() {
        zzcfp zzcfp2 = this.zzb;
        String string2 = this.zzc;
        String[] stringArray = this.zzd;
        return zzcfp2.zzw(string2, stringArray, this);
    }

    public final String zze() {
        return this.zzc;
    }
}


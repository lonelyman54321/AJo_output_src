/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzevz;
import com.google.android.gms.internal.ads.zzewb;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

public final class zzewa
implements zzexw {
    private final zzgge zza;
    private final Context zzb;
    private final Set zzc;

    public zzewa(zzgge zzgge2, Context context, Set set) {
        this.zza = zzgge2;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final ListenableFuture zzb() {
        zzevz zzevz2 = new zzevz(this);
        return this.zza.zzb(zzevz2);
    }

    public final /* synthetic */ zzewb zzc() {
        Object object = zzbep.zzeZ;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            boolean bl3;
            object = zzbep.zzfk;
            object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2 || (bl3 = (object = this.zzc).contains(object2 = "rewarded")) || (bl3 = object.contains(object2 = "interstitial")) || (bl3 = object.contains(object2 = "native")) || (bl2 = object.contains(object2 = "banner"))) {
                object = this.zzb;
                object = zzu.zzA().zzf((Context)object);
                object2 = new zzewb((String)object);
                return object2;
            }
        }
        object = new zzewb(null);
        return object;
    }
}


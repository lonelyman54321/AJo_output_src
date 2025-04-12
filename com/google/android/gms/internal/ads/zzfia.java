/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhz;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

public final class zzfia {
    private final zzfgt zza;
    private final zzfgw zzb;
    private final zzefz zzc;
    private final zzfoe zzd;
    private final zzfmn zze;
    private final zzcqd zzf;

    public zzfia(zzefz zzefz2, zzfoe zzfoe2, zzfgt zzfgt2, zzfgw zzfgw2, zzcqd zzcqd2, zzfmn zzfmn2) {
        this.zza = zzfgt2;
        this.zzb = zzfgw2;
        this.zzc = zzefz2;
        this.zzd = zzfoe2;
        this.zzf = zzcqd2;
        this.zze = zzfmn2;
    }

    public final void zza(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            int n3 = 2;
            this.zzb(string2, n3);
        }
    }

    public final void zzb(String string2, int n3) {
        Object object = this.zza;
        boolean bl2 = ((zzfgt)object).zzaj;
        if (!bl2) {
            zzfoe zzfoe2 = this.zzd;
            object = this.zze;
            zzfoe2.zzc(string2, (zzfmn)object);
            return;
        }
        long l2 = zzu.zzB().currentTimeMillis();
        String string3 = this.zzb.zzb;
        object = new zzegb(l2, string3, string2, n3);
        this.zzc.zzd((zzegb)object);
    }

    public final void zzc(List object, int n3) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (String)object.next();
            Object object3 = zzbep.zzka;
            Object object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            boolean bl3 = (Boolean)object3;
            if (bl3 && (bl3 = zzcqd.zzj((String)object2))) {
                object3 = this.zzf;
                object4 = zzay.zze();
                object2 = ((zzcqd)object3).zzb((String)object2, (Random)object4);
            } else {
                object2 = zzgft.zzh(object2);
            }
            object3 = new zzfhz(this, n3);
            object4 = zzcci.zza;
            zzgft.zzr((ListenableFuture)object2, (zzgfp)object3, (Executor)object4);
        }
    }
}


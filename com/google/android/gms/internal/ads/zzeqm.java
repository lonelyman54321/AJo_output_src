/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeql;
import com.google.android.gms.internal.ads.zzeqn;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfid;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeqm
implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final zzfid zzc;

    public zzeqm(zzgge zzgge2, zzfho zzfho2, zzfid zzfid2) {
        this.zza = zzgge2;
        this.zzb = zzfho2;
        this.zzc = zzfid2;
    }

    public final int zza() {
        return 5;
    }

    public final ListenableFuture zzb() {
        zzeql zzeql2 = new zzeql(this);
        return this.zza.zzb(zzeql2);
    }

    public final /* synthetic */ zzeqn zzc() {
        Object object = zzbep.zzhr;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        String string2 = null;
        if (bl2) {
            object = this.zzb.zzd;
            String string3 = "requester_type_2";
            bl2 = string3.equals(object = zzp.zzc((zzl)object));
            if (bl2) {
                string2 = zzfid.zza();
            }
        }
        zzeqn zzeqn2 = new zzeqn(string2);
        return zzeqn2;
    }
}


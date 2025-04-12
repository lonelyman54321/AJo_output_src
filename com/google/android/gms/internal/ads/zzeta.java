/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzesz;
import com.google.android.gms.internal.ads.zzetb;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzeta
implements zzexw {
    private final zzgge zza;
    private final zzdsy zzb;
    private final String zzc;
    private final zzfho zzd;

    public zzeta(zzgge zzgge2, zzdsy zzdsy2, zzfho zzfho2, String string2) {
        this.zza = zzgge2;
        this.zzb = zzdsy2;
        this.zzd = zzfho2;
        this.zzc = string2;
    }

    public final int zza() {
        return 17;
    }

    public final ListenableFuture zzb() {
        zzesz zzesz2 = new zzesz(this);
        return this.zza.zzb(zzesz2);
    }

    public final /* synthetic */ zzetb zzc() {
        Object object = this.zzd;
        zzdsy zzdsy2 = this.zzb;
        object = ((zzfho)object).zzf;
        Object object2 = this.zzc;
        object = zzdsy2.zzb((String)object, (String)object2);
        zzdsy2 = zzdsy2.zza();
        object2 = new zzetb((JSONObject)object, (JSONObject)zzdsy2);
        return object2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbpu;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

public final class zzbqt
implements zzgfa {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final String zzc;
    private final ListenableFuture zzd;

    public zzbqt(ListenableFuture listenableFuture, String string2, zzbqa zzbqa2, zzbpz zzbpz2) {
        this.zzd = listenableFuture;
        this.zzc = "google.afma.activeView.handleUpdate";
        this.zzb = zzbqa2;
        this.zza = zzbpz2;
    }

    public final ListenableFuture zza(Object object) {
        return this.zzb(object);
    }

    public final ListenableFuture zzb(Object object) {
        zzbqr zzbqr2 = new zzbqr(this, object);
        object = this.zzd;
        zzgge zzgge2 = zzcci.zzf;
        return zzgft.zzn((ListenableFuture)object, zzbqr2, zzgge2);
    }

    public final /* synthetic */ ListenableFuture zzc(Object object, zzbpu zzbpu2) {
        zzccn zzccn2 = new zzccn();
        zzu.zzp();
        String string2 = UUID.randomUUID().toString();
        zzbmf zzbmf2 = zzblo.zzo;
        zzbqs zzbqs2 = new zzbqs(this, zzccn2);
        zzbmf2.zzc(string2, zzbqs2);
        zzbmf2 = new JSONObject();
        zzbmf2.put("id", string2);
        object = (JSONObject)object;
        zzbmf2.put("args", object);
        object = this.zzc;
        zzbpu2.zzl((String)object, (JSONObject)zzbmf2);
        return zzccn2;
    }
}


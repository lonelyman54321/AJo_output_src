/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzbqq {
    private final zzbpt zza;
    private ListenableFuture zzb;

    public zzbqq(zzbpt zzbpt2) {
        this.zza = zzbpt2;
    }

    private final void zzd() {
        ListenableFuture listenableFuture = this.zzb;
        if (listenableFuture == null) {
            this.zzb = listenableFuture = new zzccn();
            zzbpn zzbpn2 = this.zza.zzb(null);
            zzbqn zzbqn2 = new zzbqn((zzccn)listenableFuture);
            zzbqo zzbqo2 = new zzbqo((zzccn)listenableFuture);
            zzbpn2.zzj(zzbqn2, zzbqo2);
        }
    }

    public final zzbqt zza(String object, zzbqa zzbqa2, zzbpz zzbpz2) {
        this.zzd();
        ListenableFuture listenableFuture = this.zzb;
        object = new zzbqt(listenableFuture, "google.afma.activeView.handleUpdate", zzbqa2, zzbpz2);
        return object;
    }

    public final void zzb(String object, zzblp zzblp2) {
        this.zzd();
        ListenableFuture listenableFuture = this.zzb;
        zzbqp zzbqp2 = new zzbqp((String)object, zzblp2);
        object = zzcci.zzf;
        this.zzb = object = zzgft.zzn(listenableFuture, zzbqp2, (Executor)object);
    }

    public final void zzc(String object, zzblp zzblp2) {
        ListenableFuture listenableFuture = this.zzb;
        zzbqm zzbqm2 = new zzbqm((String)object, zzblp2);
        object = zzcci.zzf;
        this.zzb = object = zzgft.zzm(listenableFuture, zzbqm2, (Executor)object);
    }
}


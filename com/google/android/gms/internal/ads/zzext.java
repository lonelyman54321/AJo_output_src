/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzexr;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzexv;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzext
implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzext(zzgge zzgge2, Context context) {
        this.zza = zzgge2;
        this.zzb = context;
    }

    public final int zza() {
        return 37;
    }

    public final ListenableFuture zzb() {
        zzexr zzexr2 = new zzexr(this);
        return this.zza.zzb(zzexr2);
    }

    public final /* synthetic */ zzexv zzc() {
        Object object = zzbep.zzgo;
        object = (String)zzba.zzc().zza((zzbeg)object);
        Object object2 = this.zzb;
        boolean bl2 = (object = zzad.zzb(object2, (String)object)).isEmpty();
        if (bl2) {
            return null;
        }
        object2 = new zzexs((Bundle)object);
        return object2;
    }
}


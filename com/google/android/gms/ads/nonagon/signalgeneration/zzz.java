/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzcbk;
import java.util.concurrent.Callable;

public final class zzz
implements Callable {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ zzcbk zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzz(zzaj zzaj2, zzcbk zzcbk2, Bundle bundle) {
        this.zza = zzaj2;
        this.zzb = zzcbk2;
        this.zzc = bundle;
    }

    public final Object call() {
        zzaj zzaj2 = this.zza;
        zzcbk zzcbk2 = this.zzb;
        Bundle bundle = this.zzc;
        return zzaj2.zzq(zzcbk2, bundle);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public final class zzw
implements Callable {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ IObjectWrapper zzc;

    public /* synthetic */ zzw(zzaj zzaj2, Uri uri, IObjectWrapper iObjectWrapper) {
        this.zza = zzaj2;
        this.zzb = uri;
        this.zzc = iObjectWrapper;
    }

    public final Object call() {
        zzaj zzaj2 = this.zza;
        Uri uri = this.zzb;
        IObjectWrapper iObjectWrapper = this.zzc;
        return zzaj2.zzn(uri, iObjectWrapper);
    }
}


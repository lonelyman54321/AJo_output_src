/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzx
implements zzgfa {
    public final /* synthetic */ zzaj zza;

    public /* synthetic */ zzx(zzaj zzaj2) {
        this.zza = zzaj2;
    }

    public final ListenableFuture zza(Object object) {
        zzaj zzaj2 = this.zza;
        object = (Uri)object;
        return zzaj.zzt(zzaj2, (Uri)object);
    }
}


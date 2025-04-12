/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzy
implements zzfxu {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ Uri zzb;

    public /* synthetic */ zzy(zzaj zzaj2, Uri uri) {
        this.zza = zzaj2;
        this.zzb = uri;
    }

    public final Object apply(Object object) {
        Uri uri = this.zzb;
        object = (String)object;
        return zzaj.zzQ(uri, (String)object);
    }
}


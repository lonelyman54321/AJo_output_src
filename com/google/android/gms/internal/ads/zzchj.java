/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.List;

final class zzchj
implements zzgfp {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzchl zzd;

    public zzchj(zzchl zzchl2, List list, String string2, Uri uri) {
        this.zza = list;
        this.zzb = string2;
        this.zzc = uri;
        this.zzd = zzchl2;
    }

    public final void zza(Throwable object) {
        object = String.valueOf(this.zzc);
        zzm.zzj("Failed to parse gmsg params for: ".concat((String)object));
    }
}


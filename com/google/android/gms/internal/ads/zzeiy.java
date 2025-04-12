/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzeja;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeiy
implements zzgfa {
    public final /* synthetic */ zzeja zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ zzfhf zzc;
    public final /* synthetic */ zzfgt zzd;

    public /* synthetic */ zzeiy(zzeja zzeja2, Uri uri, zzfhf zzfhf2, zzfgt zzfgt2) {
        this.zza = zzeja2;
        this.zzb = uri;
        this.zzc = zzfhf2;
        this.zzd = zzfgt2;
    }

    public final ListenableFuture zza(Object object) {
        zzeja zzeja2 = this.zza;
        Uri uri = this.zzb;
        zzfhf zzfhf2 = this.zzc;
        zzfgt zzfgt2 = this.zzd;
        return zzeja2.zzc(uri, zzfhf2, zzfgt2, object);
    }
}


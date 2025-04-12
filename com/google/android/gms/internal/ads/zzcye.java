/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzcye
implements zzfxu {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfho zzc;

    public /* synthetic */ zzcye(Context context, VersionInfoParcel versionInfoParcel, zzfho zzfho2) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfho2;
    }

    public final Object apply(Object object) {
        object = (zzfgt)object;
        Object object2 = this.zza;
        zzau zzau2 = new zzau((Context)object2);
        object2 = ((zzfgt)object).zzC;
        zzau2.zzp((String)object2);
        object = ((zzfgt)object).zzD.toString();
        zzau2.zzq((String)object);
        object = this.zzb.afmaVersion;
        zzau2.zzo((String)object);
        object = this.zzc.zzf;
        zzau2.zzn((String)object);
        return zzau2;
    }
}


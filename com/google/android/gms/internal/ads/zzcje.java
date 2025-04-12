/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

public final class zzcje {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public static /* bridge */ /* synthetic */ long zza(zzcje zzcje2) {
        return zzcje2.zzc;
    }

    public static /* bridge */ /* synthetic */ Context zzb(zzcje zzcje2) {
        return zzcje2.zzb;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzc(zzcje zzcje2) {
        return zzcje2.zza;
    }

    public static /* bridge */ /* synthetic */ WeakReference zzg(zzcje zzcje2) {
        return zzcje2.zzd;
    }

    public final zzcje zzd(long l2) {
        this.zzc = l2;
        return this;
    }

    public final zzcje zze(Context context) {
        Context context2;
        this.zzd = context2 = new WeakReference(context);
        context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcje zzf(VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }
}


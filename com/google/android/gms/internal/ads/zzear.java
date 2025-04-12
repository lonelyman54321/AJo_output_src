/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 */
package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.internal.ads.zzbxm;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzebi;
import java.io.InputStream;

public final class zzear
extends zzbxm {
    final /* synthetic */ zzeas zza;

    public zzear(zzeas zzeas2) {
        this.zza = zzeas2;
    }

    public final void zze(zzbb object) {
        zzccn zzccn2 = this.zza.zza;
        object = ((zzbb)object).zza();
        zzccn2.zzd((Throwable)object);
    }

    public final void zzf(ParcelFileDescriptor object) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(object);
        object = this.zza;
        zzbxu zzbxu2 = object.zze;
        zzebi zzebi2 = new zzebi((InputStream)autoCloseInputStream, zzbxu2);
        object.zza.zzc(zzebi2);
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxu zzbxu2) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzebi zzebi2 = new zzebi((InputStream)autoCloseInputStream, zzbxu2);
        this.zza.zza.zzc(zzebi2);
    }
}


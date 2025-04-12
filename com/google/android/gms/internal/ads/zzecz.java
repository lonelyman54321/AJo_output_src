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
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzeda;

public final class zzecz
extends zzbxj {
    final /* synthetic */ zzeda zza;

    public zzecz(zzeda zzeda2) {
        this.zza = zzeda2;
    }

    public final void zze(zzbb object) {
        zzccn zzccn2 = this.zza.zza;
        object = ((zzbb)object).zza();
        zzccn2.zzd((Throwable)object);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.zza.zza.zzc(autoCloseInputStream);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbsy;

public final class zzbsw
extends zzbad
implements zzbsy {
    public zzbsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void zze(String string2) {
        string2 = this.zza();
        string2.writeString("Adapter returned null.");
        this.zzdc(2, (Parcel)string2);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(3, parcel);
    }

    public final void zzg(zzbru zzbru2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbru2);
        this.zzdc(1, parcel);
    }
}


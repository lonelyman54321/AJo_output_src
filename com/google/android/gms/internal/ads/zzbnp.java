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
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbnr;

public final class zzbnp
extends zzbad
implements zzbnr {
    public zzbnp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void zze(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(3, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }
}


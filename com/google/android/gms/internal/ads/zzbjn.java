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
import com.google.android.gms.internal.ads.zzbjp;

public final class zzbjn
extends zzbad
implements zzbjp {
    public zzbjn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzf(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(1, parcel);
    }
}


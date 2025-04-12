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
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiz;

public final class zzbix
extends zzbad
implements zzbiz {
    public zzbix(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbip zzbip2, String string2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbip2);
        parcel.writeString(string2);
        this.zzdc(1, parcel);
    }
}


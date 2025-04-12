/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzdh
extends zzbad
implements zzdj {
    public zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    public final void zze(String string2, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, iObjectWrapper2);
        this.zzdc(1, parcel);
    }
}


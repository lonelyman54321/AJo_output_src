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
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.internal.ads.zzbad;

public final class zzbz
extends zzbad
implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void zzc(String string2, String string3) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzdc(1, parcel);
    }
}


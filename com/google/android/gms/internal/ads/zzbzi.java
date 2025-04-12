/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyx;

public final class zzbzi
extends zzbad
implements IInterface {
    public zzbzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbyx zzbyx2, String string2, String string3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbyx2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzdc(2, parcel);
    }
}


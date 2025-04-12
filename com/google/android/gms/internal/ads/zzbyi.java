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
import com.google.android.gms.internal.ads.zzbyh;

public final class zzbyi
extends zzbad
implements IInterface {
    public zzbyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbyh zzbyh2, String string2, String string3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbyh2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzdc(2, parcel);
    }
}


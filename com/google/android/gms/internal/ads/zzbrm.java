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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbro;

public final class zzbrm
extends zzbad
implements zzbro {
    public zzbrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public final IObjectWrapper zze() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(1, parcel));
    }

    public final boolean zzf() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(2, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}


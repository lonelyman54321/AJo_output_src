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
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.internal.ads.zzbad;

public final class zzcq
extends zzbad
implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }
}


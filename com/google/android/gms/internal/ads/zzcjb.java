/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzcja;
import com.google.android.gms.internal.ads.zzcjc;

public abstract class zzcjb
extends zzbae
implements zzcjc {
    public static zzcjc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        boolean bl2 = iInterface instanceof zzcjc;
        if (bl2) {
            return (zzcjc)iInterface;
        }
        iInterface = new zzcja(iBinder);
        return iInterface;
    }
}


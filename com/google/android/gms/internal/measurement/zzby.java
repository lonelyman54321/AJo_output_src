/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzca;

public abstract class zzby
extends zzbx
implements zzbz {
    public static zzbz zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        boolean bl2 = iInterface instanceof zzbz;
        if (bl2) {
            return (zzbz)iInterface;
        }
        iInterface = new zzca(iBinder);
        return iInterface;
    }
}


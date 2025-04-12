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
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmu;

public abstract class zzbmt
extends zzbae
implements zzbmu {
    public static zzbmu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        boolean bl2 = iInterface instanceof zzbmu;
        if (bl2) {
            return (zzbmu)iInterface;
        }
        iInterface = new zzbms(iBinder);
        return iInterface;
    }
}


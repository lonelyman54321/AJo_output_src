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
import com.google.android.gms.internal.ads.zzbva;
import com.google.android.gms.internal.ads.zzbvc;

public abstract class zzbvb
extends zzbae
implements zzbvc {
    public static zzbvc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        boolean bl2 = iInterface instanceof zzbvc;
        if (bl2) {
            return (zzbvc)iInterface;
        }
        iInterface = new zzbva(iBinder);
        return iInterface;
    }
}


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
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbyn;

public abstract class zzbym
extends zzbae
implements zzbyn {
    public static zzbyn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        boolean bl2 = iInterface instanceof zzbyn;
        if (bl2) {
            return (zzbyn)iInterface;
        }
        iInterface = new zzbyl(iBinder);
        return iInterface;
    }
}


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
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbvs;

public final class zzbvr
extends zzbae
implements zzbvs {
    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        boolean bl2 = iInterface instanceof zzbvs;
        if (bl2) {
            return (zzbvs)iInterface;
        }
        iInterface = new zzbvq(iBinder);
        return iInterface;
    }
}


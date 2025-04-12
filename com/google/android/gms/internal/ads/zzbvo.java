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
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbvp;

public final class zzbvo
extends zzbae
implements zzbvp {
    public static zzbvp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        boolean bl2 = iInterface instanceof zzbvp;
        if (bl2) {
            return (zzbvp)iInterface;
        }
        iInterface = new zzbvn(iBinder);
        return iInterface;
    }
}


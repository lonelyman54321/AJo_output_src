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
import com.google.android.gms.internal.ads.zzbig;
import com.google.android.gms.internal.ads.zzbii;

public abstract class zzbih
extends zzbae
implements zzbii {
    public static zzbii zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        boolean bl2 = iInterface instanceof zzbii;
        if (bl2) {
            return (zzbii)iInterface;
        }
        iInterface = new zzbig(iBinder);
        return iInterface;
    }
}


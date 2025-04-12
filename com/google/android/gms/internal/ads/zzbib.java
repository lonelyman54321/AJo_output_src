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
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;

public abstract class zzbib
extends zzbae
implements zzbic {
    public static zzbic zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        boolean bl2 = iInterface instanceof zzbic;
        if (bl2) {
            return (zzbic)iInterface;
        }
        iInterface = new zzbia(iBinder);
        return iInterface;
    }
}


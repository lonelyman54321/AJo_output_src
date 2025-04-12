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
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvj;

public abstract class zzbvi
extends zzbae
implements zzbvj {
    public static zzbvj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        boolean bl2 = iInterface instanceof zzbvj;
        if (bl2) {
            return (zzbvj)iInterface;
        }
        iInterface = new zzbvh(iBinder);
        return iInterface;
    }
}


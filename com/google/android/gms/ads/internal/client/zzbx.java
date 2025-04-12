/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.internal.ads.zzbae;

public abstract class zzbx
extends zzbae
implements zzby {
    public static zzby zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        boolean bl2 = iInterface instanceof zzby;
        if (bl2) {
            return (zzby)iInterface;
        }
        iInterface = new zzbw(iBinder);
        return iInterface;
    }
}


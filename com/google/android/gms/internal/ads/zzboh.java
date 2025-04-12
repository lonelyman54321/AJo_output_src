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
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzboi;

public abstract class zzboh
extends zzbae
implements zzboi {
    public static zzboi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        boolean bl2 = iInterface instanceof zzboi;
        if (bl2) {
            return (zzboi)iInterface;
        }
        iInterface = new zzbog(iBinder);
        return iInterface;
    }
}


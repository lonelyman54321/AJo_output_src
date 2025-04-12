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
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfk;

public abstract class zzbfj
extends zzbae
implements zzbfk {
    public static zzbfk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        boolean bl2 = iInterface instanceof zzbfk;
        if (bl2) {
            return (zzbfk)iInterface;
        }
        iInterface = new zzbfi(iBinder);
        return iInterface;
    }
}


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
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbj;

public abstract class zzcbi
extends zzbae
implements zzcbj {
    public static zzcbj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        boolean bl2 = iInterface instanceof zzcbj;
        if (bl2) {
            return (zzcbj)iInterface;
        }
        iInterface = new zzcbh(iBinder);
        return iInterface;
    }
}


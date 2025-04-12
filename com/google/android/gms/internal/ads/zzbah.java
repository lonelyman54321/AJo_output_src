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
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbai;

public abstract class zzbah
extends zzbae
implements zzbai {
    public static zzbai zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        boolean bl2 = iInterface instanceof zzbai;
        if (bl2) {
            return (zzbai)iInterface;
        }
        iInterface = new zzbag(iBinder);
        return iInterface;
    }
}


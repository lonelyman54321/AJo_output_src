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
import com.google.android.gms.internal.ads.zzfvm;
import com.google.android.gms.internal.ads.zzfvo;

public abstract class zzfvn
extends zzbae
implements zzfvo {
    public static zzfvo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        boolean bl2 = iInterface instanceof zzfvo;
        if (bl2) {
            return (zzfvo)iInterface;
        }
        iInterface = new zzfvm(iBinder);
        return iInterface;
    }
}


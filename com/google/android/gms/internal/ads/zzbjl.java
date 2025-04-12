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
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjm;

public abstract class zzbjl
extends zzbae
implements zzbjm {
    public static zzbjm zzb(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        boolean bl2 = iInterface instanceof zzbjm;
        if (bl2) {
            return (zzbjm)iInterface;
        }
        iInterface = new zzbjk(iBinder);
        return iInterface;
    }
}


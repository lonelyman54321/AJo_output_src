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
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbit;

public abstract class zzbis
extends zzbae
implements zzbit {
    public static zzbit zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        boolean bl2 = iInterface instanceof zzbit;
        if (bl2) {
            return (zzbit)iInterface;
        }
        iInterface = new zzbir(iBinder);
        return iInterface;
    }
}


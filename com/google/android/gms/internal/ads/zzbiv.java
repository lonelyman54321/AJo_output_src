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
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbiw;

public abstract class zzbiv
extends zzbae
implements zzbiw {
    public static zzbiw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        boolean bl2 = iInterface instanceof zzbiw;
        if (bl2) {
            return (zzbiw)iInterface;
        }
        iInterface = new zzbiu(iBinder);
        return iInterface;
    }
}


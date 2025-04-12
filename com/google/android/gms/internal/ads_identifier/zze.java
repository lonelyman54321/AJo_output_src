/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads_identifier.zzb;
import com.google.android.gms.internal.ads_identifier.zzd;
import com.google.android.gms.internal.ads_identifier.zzf;

public abstract class zze
extends zzb
implements zzf {
    public static zzf zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        boolean bl2 = iInterface instanceof zzf;
        if (bl2) {
            return (zzf)iInterface;
        }
        iInterface = new zzd(iBinder);
        return iInterface;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhu;
import com.google.android.gms.internal.gtm.zzhv;
import com.google.android.gms.internal.gtm.zzmx;
import java.util.Map;

final class zzhs
implements zzmx {
    final /* synthetic */ zzhv zza;

    public /* synthetic */ zzhs(zzhv zzhv2, zzhu zzhu2) {
        this.zza = zzhv2;
    }

    public final Object zza(String string2, Map map2) {
        Object object;
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            string2 = String.valueOf(remoteException.getMessage());
            zzhi.zza("Error calling customEvaluator proxy:".concat(string2));
            return null;
        }
        object = zzhv.zza((zzhv)object);
        return object.zzb(string2, map2);
    }
}


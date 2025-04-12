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

final class zzhr
implements zzmx {
    final /* synthetic */ zzhv zza;

    public /* synthetic */ zzhr(zzhv zzhv2, zzhu zzhu2) {
        this.zza = zzhv2;
    }

    public final Object zza(String string2, Map object) {
        Object object2 = this.zza;
        object2 = zzhv.zza((zzhv)object2);
        try {
            object2.zzc(string2, (Map)object);
        }
        catch (RemoteException remoteException) {
            string2 = String.valueOf(remoteException.getMessage());
            object = "Error calling customEvaluator proxy:";
            string2 = ((String)object).concat(string2);
            zzhi.zza(string2);
        }
        return null;
    }
}


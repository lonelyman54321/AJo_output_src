/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.flags;

import android.os.RemoteException;
import com.google.android.gms.flags.Flag;
import com.google.android.gms.flags.zzc;

public class Flag$LongFlag
extends Flag {
    public Flag$LongFlag(int n3, String string2, Long l2) {
        super(n3, string2, l2, null);
    }

    private final Long zzd(zzc zzc2) {
        String string2;
        try {
            string2 = this.getKey();
        }
        catch (RemoteException remoteException) {
            return (Long)this.zzb();
        }
        Object object = this.zzb();
        object = (Long)object;
        long l2 = (Long)object;
        int n3 = this.getSource();
        long l3 = zzc2.getLongFlagValue(string2, l2, n3);
        return l3;
    }

    public final /* synthetic */ Object zza(zzc zzc2) {
        return this.zzd(zzc2);
    }
}


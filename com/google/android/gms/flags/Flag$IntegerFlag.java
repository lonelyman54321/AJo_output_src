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

public class Flag$IntegerFlag
extends Flag {
    public Flag$IntegerFlag(int n3, String string2, Integer n4) {
        super(n3, string2, n4, null);
    }

    private final Integer zzc(zzc zzc2) {
        String string2;
        try {
            string2 = this.getKey();
        }
        catch (RemoteException remoteException) {
            return (Integer)this.zzb();
        }
        Object object = this.zzb();
        object = (Integer)object;
        int n3 = (Integer)object;
        int n4 = this.getSource();
        int n7 = zzc2.getIntFlagValue(string2, n3, n4);
        return n7;
    }

    public final /* synthetic */ Object zza(zzc zzc2) {
        return this.zzc(zzc2);
    }
}


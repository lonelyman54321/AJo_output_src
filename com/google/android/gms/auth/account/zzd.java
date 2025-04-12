/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.auth.account.zze;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd
extends zzb
implements zze {
    public static zze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        boolean bl2 = iInterface instanceof zze;
        if (bl2) {
            return (zze)iInterface;
        }
        iInterface = new zzc(iBinder);
        return iInterface;
    }
}


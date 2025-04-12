/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.system.ErrnoException
 *  android.system.OsConstants
 */
package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

final class zzhq {
    public static /* bridge */ /* synthetic */ boolean zza(Throwable throwable) {
        return zzhq.zzb(throwable);
    }

    private static boolean zzb(Throwable throwable) {
        int n3 = throwable instanceof ErrnoException;
        if (n3 != 0) {
            throwable = (ErrnoException)throwable;
            int n4 = ((ErrnoException)throwable).errno;
            n3 = OsConstants.EACCES;
            if (n4 == n3) {
                return true;
            }
        }
        return false;
    }
}


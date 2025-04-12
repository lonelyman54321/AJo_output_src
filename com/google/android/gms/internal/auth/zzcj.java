/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 */
package com.google.android.gms.internal.auth;

import android.os.Binder;
import com.google.android.gms.internal.auth.zzck;

public final class zzcj {
    public static Object zza(zzck object) {
        long l2;
        try {
            object = object.zza();
        }
        catch (SecurityException securityException) {
            l2 = Binder.clearCallingIdentity();
            object = object.zza();
            return object;
        }
        return object;
        {
            finally {
                Binder.restoreCallingIdentity((long)l2);
            }
        }
    }
}


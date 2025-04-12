/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;

public class Wrappers {
    private static final Wrappers zza;
    private PackageManagerWrapper zzb = null;

    static {
        Wrappers wrappers;
        zza = wrappers = new Wrappers();
    }

    public static PackageManagerWrapper packageManager(Context context) {
        return zza.zza(context);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final PackageManagerWrapper zza(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                PackageManagerWrapper packageManagerWrapper;
                block4: {
                    try {
                        packageManagerWrapper = this.zzb;
                        if (packageManagerWrapper != null) return this.zzb;
                        packageManagerWrapper = object.getApplicationContext();
                        if (packageManagerWrapper == null) break block4;
                        object = object.getApplicationContext();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.zzb = packageManagerWrapper = new PackageManagerWrapper((Context)object);
                return this.zzb;
            }
            throw throwable2;
        }
    }
}


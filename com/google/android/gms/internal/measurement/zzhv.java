/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import com.google.common.base.Optional;

public final class zzhv {
    private static volatile Optional zza;
    private static final Object zzb;

    static {
        Object object;
        zza = Optional.absent();
        zzb = object = new Object();
    }

    private static boolean zza(Context context) {
        context = context.getPackageManager();
        String string2 = "com.google.android.gms";
        try {
            context = context.getApplicationInfo(string2, 0);
            int n3 = context.flags & 0x81;
            if (n3 != 0) {
                return true;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(Context object, Uri object2) {
        object2 = object2.getAuthority();
        boolean bl2 = "com.google.android.gms.phenotype".equals(object2);
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object2 = zza;
        bl2 = ((Optional)object2).isPresent();
        if (bl2) {
            return (Boolean)zza.get();
        }
        object2 = zzb;
        synchronized (object2) {
            try {
                block12: {
                    block11: {
                        Object object3 = zza;
                        boolean bl4 = ((Optional)object3).isPresent();
                        if (bl4) {
                            object = zza;
                            object = ((Optional)object).get();
                            object = (Boolean)object;
                            return (Boolean)object;
                        }
                        object3 = "com.google.android.gms";
                        String string2 = object.getPackageName();
                        bl4 = ((String)object3).equals(string2);
                        if (bl4) break block11;
                        object3 = object.getPackageManager();
                        string2 = "com.google.android.gms.phenotype";
                        int n3 = Build.VERSION.SDK_INT;
                        int n4 = 29;
                        n3 = n3 < n4 ? 0 : 0x10000000;
                        object3 = object3.resolveContentProvider(string2, n3);
                        if (object3 == null || !(bl4 = (string2 = "com.google.android.gms").equals(object3 = ((ProviderInfo)object3).packageName))) break block12;
                    }
                    boolean bl5 = zzhv.zza((Context)object);
                    if (bl5) {
                        bl3 = true;
                    }
                }
                object = bl3;
                zza = object = Optional.of(object);
                return (Boolean)zza.get();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.google.android.gms.internal.vision.zzcy;

public final class zzbg {
    private static volatile zzcy zza;
    private static final Object zzb;

    static {
        Object object;
        zza = zzcy.zzc();
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
        Object object3 = "com.google.android.gms.phenotype";
        boolean bl2 = ((String)object3).equals(object2);
        boolean bl3 = false;
        if (!bl2) {
            int n3 = lE2.a(91, (String)object2);
            new StringBuilder(n3);
            return false;
        }
        object2 = zza;
        boolean bl4 = ((zzcy)object2).zza();
        if (bl4) {
            return (Boolean)zza.zzb();
        }
        object2 = zzb;
        synchronized (object2) {
            try {
                block12: {
                    block11: {
                        object3 = zza;
                        bl2 = ((zzcy)object3).zza();
                        if (bl2) {
                            object = zza;
                            object = ((zzcy)object).zzb();
                            object = (Boolean)object;
                            return (Boolean)object;
                        }
                        object3 = "com.google.android.gms";
                        String string2 = object.getPackageName();
                        bl2 = ((String)object3).equals(string2);
                        if (bl2) break block11;
                        object3 = object.getPackageManager();
                        string2 = "com.google.android.gms.phenotype";
                        if ((object3 = object3.resolveContentProvider(string2, 0)) == null || !(bl2 = (string2 = "com.google.android.gms").equals(object3 = ((ProviderInfo)object3).packageName))) break block12;
                    }
                    boolean bl5 = zzbg.zza((Context)object);
                    if (bl5) {
                        bl3 = true;
                    }
                }
                object = bl3;
                zza = object = zzcy.zza(object);
                return (Boolean)zza.zzb();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


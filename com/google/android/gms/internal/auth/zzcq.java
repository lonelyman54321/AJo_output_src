/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.auth.zzdh;

public final class zzcq {
    static volatile zzdh zza;
    private static final Object zzb;

    static {
        Object object;
        zza = zzdh.zzc();
        zzb = object = new Object();
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
            String.valueOf(object2).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        object2 = zza;
        boolean bl4 = ((zzdh)object2).zzb();
        if (bl4) {
            return (Boolean)zza.zza();
        }
        object2 = zzb;
        synchronized (object2) {
            try {
                block12: {
                    block11: {
                        object3 = zza;
                        bl2 = ((zzdh)object3).zzb();
                        if (bl2) {
                            object = zza;
                            object = ((zzdh)object).zza();
                            object = (Boolean)object;
                            return (Boolean)object;
                        }
                        object3 = "com.google.android.gms";
                        String string2 = object.getPackageName();
                        bl2 = ((String)object3).equals(string2);
                        if (bl2) break block11;
                        object3 = object.getPackageManager();
                        string2 = "com.google.android.gms.phenotype";
                        int n3 = Build.VERSION.SDK_INT;
                        int n4 = 29;
                        n3 = n3 < n4 ? 0 : 0x10000000;
                        object3 = object3.resolveContentProvider(string2, n3);
                        if (object3 == null || !(bl2 = (string2 = "com.google.android.gms").equals(object3 = ((ProviderInfo)object3).packageName))) break block12;
                    }
                    object = object.getPackageManager();
                    object3 = "com.google.android.gms";
                    try {
                        object = object.getApplicationInfo((String)object3, 0);
                        int n7 = ((ApplicationInfo)object).flags & 0x81;
                        if (n7 != 0) {
                            bl3 = true;
                        }
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                }
                object = bl3;
                zza = object = zzdh.zzd(object);
                return (Boolean)zza.zza();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzah {
    private static final Object zza;
    private static boolean zzb;
    private static String zzc;
    private static int zzd;

    static {
        Object object;
        zza = object = new Object();
    }

    public static int zza(Context context) {
        zzah.zzc(context);
        return zzd;
    }

    public static String zzb(Context context) {
        zzah.zzc(context);
        return zzc;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzc(Context object) {
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block9: {
                    String string2;
                    block8: {
                        boolean bl2;
                        try {
                            bl2 = zzb;
                            if (bl2) {
                                return;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        zzb = bl2 = true;
                        string2 = object.getPackageName();
                        object = Wrappers.packageManager((Context)object);
                        int n3 = 128;
                        try {
                            object = ((PackageManagerWrapper)object).getApplicationInfo(string2, n3);
                            object = ((ApplicationInfo)object).metaData;
                            if (object != null) break block8;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {
                            string2 = "MetadataValueReader";
                            String string3 = "This should never happen.";
                            Log.wtf((String)string2, (String)string3, (Throwable)nameNotFoundException);
                            break block9;
                        }
                        return;
                    }
                    string2 = "com.google.app.id";
                    {
                        int n4;
                        zzc = string2 = object.getString(string2);
                        string2 = "com.google.android.gms.version";
                        zzd = n4 = object.getInt(string2);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


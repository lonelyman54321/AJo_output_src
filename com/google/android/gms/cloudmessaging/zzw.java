/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzw {
    private final Context zza;
    private int zzb;
    private int zzc = 0;

    public zzw(Context context) {
        this.zza = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        synchronized (this) {
            try {
                int n3 = this.zzb;
                if (n3 != 0) return this.zzb;
                String string2 = "com.google.android.gms";
                try {
                    Object object = this.zza;
                    object = Wrappers.packageManager((Context)object);
                    string2 = ((PackageManagerWrapper)object).getPackageInfo(string2, 0);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    String string3 = "Failed to find package ";
                    string2 = ((Object)((Object)nameNotFoundException)).toString();
                    string3.concat(string2);
                    n3 = 0;
                    string2 = null;
                }
                if (string2 == null) return this.zzb;
                this.zzb = n3 = ((PackageInfo)string2).versionCode;
                return this.zzb;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzb() {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                int n3;
                int n4;
                block14: {
                    block12: {
                        String string2;
                        PackageManager packageManager;
                        Object object;
                        block11: {
                            block10: {
                                block9: {
                                    try {
                                        n4 = this.zzc;
                                        if (n4 == 0) break block9;
                                    }
                                    catch (Throwable throwable2) {}
                                    return n4;
                                }
                                object = this.zza;
                                packageManager = object.getPackageManager();
                                object = Wrappers.packageManager((Context)object);
                                String string3 = "com.google.android.c2dm.permission.SEND";
                                String string4 = "com.google.android.gms";
                                n4 = ((PackageManagerWrapper)object).checkPermission(string3, string4);
                                n3 = -1;
                                string4 = null;
                                if (n4 != n3) break block10;
                                return 0;
                            }
                            n4 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
                            n3 = 1;
                            if (n4 != 0) break block11;
                            string2 = "com.google.android.c2dm.intent.REGISTER";
                            object = new Intent(string2);
                            string2 = "com.google.android.gms";
                            object.setPackage(string2);
                            object = packageManager.queryIntentServices((Intent)object, 0);
                            if (object == null || (n4 = (int)(object.isEmpty() ? 1 : 0)) != 0) break block11;
                            break block12;
                            break block13;
                        }
                        string2 = "com.google.iid.TOKEN_REQUEST";
                        object = new Intent(string2);
                        string2 = "com.google.android.gms";
                        object.setPackage(string2);
                        object = packageManager.queryBroadcastReceivers((Intent)object, 0);
                        if (object == null || (n4 = (int)(object.isEmpty() ? 1 : 0)) != 0) break block14;
                        n3 = 2;
                    }
                    this.zzc = n3;
                    return n3;
                }
                n4 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
                if (n3 == n4) {
                    n3 = 2;
                }
                this.zzc = n3;
                return n3;
            }
            throw throwable2;
        }
    }
}


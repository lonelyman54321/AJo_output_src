/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.UserManager
 */
package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class zzaa {
    private static volatile UserManager zzdc;
    private static volatile boolean zzdd;

    static {
        zzdd = zzaa.zzf() ^ true;
    }

    private zzaa() {
    }

    public static boolean zze(Context context) {
        boolean bl2;
        boolean bl3 = zzaa.zzf();
        return bl3 && !(bl2 = zzaa.zzf(context));
    }

    private static boolean zzf() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        return n3 >= n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean zzf(Context object) {
        boolean bl2;
        block8: {
            UserManager userManager;
            block9: {
                bl2 = zzdd;
                if (bl2) break block8;
                userManager = zzdc;
                if (userManager == null) {
                    Class<zzaa> clazz = zzaa.class;
                    synchronized (clazz) {
                        Throwable throwable2;
                        block7: {
                            block6: {
                                try {
                                    userManager = zzdc;
                                    if (userManager != null) break block6;
                                    object = ck3_1.a(object);
                                    object = (UserManager)object;
                                    zzdc = object;
                                    if (object == null) {
                                        boolean bl3;
                                        zzdd = bl3 = true;
                                        return bl3;
                                    }
                                }
                                catch (Throwable throwable2) {
                                    break block7;
                                }
                                userManager = object;
                            }
                            break block9;
                        }
                        throw throwable2;
                    }
                }
            }
            zzdd = bl2 = dk3_1.a(userManager);
            if (bl2) {
                boolean bl4 = false;
                object = null;
                zzdc = null;
            }
        }
        return bl2;
    }
}


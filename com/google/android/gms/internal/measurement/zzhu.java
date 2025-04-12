/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

public final class zzhu {
    private static final Jp zza;

    static {
        Jp jp;
        zza = jp = new Jp();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri zza(String string2) {
        Class<zzhu> clazz = zzhu.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        Jp jp = zza;
                        object = jp.get(string2);
                        object = (Uri)object;
                        if (object != null) break block4;
                        object = Uri.encode((String)string2);
                        String string3 = "content://com.google.android.gms.phenotype/";
                        StringBuilder stringBuilder = new StringBuilder(string3);
                        stringBuilder.append((String)object);
                        object = stringBuilder.toString();
                        object = Uri.parse((String)object);
                        jp.put(string2, object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static String zza(Context object, String string2) {
        String string3 = "#";
        boolean bl2 = string2.contains(string3);
        if (!bl2) {
            object = object.getPackageName();
            return n1.a(string2, string3, (String)object);
        }
        string2 = "The passed in package cannot already have a subpackage: ".concat(string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static boolean zza(String string2, String string3) {
        boolean bl2;
        String string4 = "eng";
        boolean bl3 = string2.equals(string4);
        return !(!bl3 && !(bl2 = string2.equals(string4 = "userdebug")) || !(bl2 = string3.contains(string2 = "dev-keys")) && !(bl2 = string3.contains(string2 = "test-keys")));
        {
        }
    }
}


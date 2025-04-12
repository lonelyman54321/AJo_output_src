/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.net.Uri;

public final class zzcr {
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
    public static Uri zza(String object) {
        object = zzcr.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                String string2 = "com.google.android.gms.auth_account";
                try {
                    Jp jp = zza;
                    object2 = jp.get(string2);
                    object2 = (Uri)object2;
                    if (object2 == null) {
                        object2 = "content://com.google.android.gms.phenotype/";
                        String string3 = Uri.encode((String)string2);
                        string3 = String.valueOf(string3);
                        object2 = ((String)object2).concat(string3);
                        object2 = Uri.parse((String)object2);
                        jp.put(string2, object2);
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return object2;
            }
            throw throwable2;
        }
    }
}


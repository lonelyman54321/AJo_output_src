/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.net.Uri;

public final class zzbj {
    private static final Jp zza;

    static {
        Jp jp;
        zza = jp = new Jp();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri zza(String string2) {
        Class<zzbj> clazz = zzbj.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                Object object;
                block3: {
                    Jp jp;
                    block5: {
                        String string3;
                        block4: {
                            try {
                                jp = zza;
                                object = jp.get(string2);
                                object = (Uri)object;
                                if (object != null) break block3;
                                object = "content://com.google.android.gms.phenotype/";
                                string3 = Uri.encode((String)string2);
                                int n3 = (string3 = String.valueOf(string3)).length();
                                if (n3 == 0) break block4;
                                object = ((String)object).concat(string3);
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        string3 = new String((String)object);
                        object = string3;
                    }
                    object = Uri.parse((String)object);
                    jp.put(string2, object);
                }
                return object;
            }
            throw throwable2;
        }
    }
}


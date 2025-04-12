/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.vision.L;
import java.util.HashMap;

public final class zzr {
    private static final Object zza;
    private static final HashMap zzb;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        zzb = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(String string2, String object) {
        int n3 = 1;
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block11: {
                int n4;
                Object object3;
                block10: {
                    block9: {
                        try {
                            string2 = String.valueOf(string2);
                            object3 = String.valueOf(object);
                            n4 = ((String)object3).length();
                            if (n4 == 0) break block9;
                            string2 = string2.concat((String)object3);
                            break block10;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                    }
                    object3 = new String(string2);
                    string2 = object3;
                }
                object3 = zzb;
                n4 = (int)(((HashMap)object3).containsKey(string2) ? 1 : 0);
                if (n4 != 0) {
                    Object object4 = ((HashMap)object3).get(string2);
                    object4 = (Integer)object4;
                    n4 = (Integer)object4;
                } else {
                    n4 = 0;
                    Object var6_9 = null;
                }
                int n7 = n4 & 1;
                if (n7 != 0) {
                    return n3 != 0;
                }
                try {
                    System.loadLibrary((String)object);
                    n7 = n4 | 1;
                    Integer n8 = n7;
                    ((HashMap)object3).put(string2, n8);
                    return n3 != 0;
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                    n7 = n4 & 4;
                    if (n7 == 0) {
                        String string3 = "System.loadLibrary failed: %s";
                        Object object5 = new Object[n3];
                        object5[0] = object;
                        L.e(unsatisfiedLinkError, string3, object5);
                        object = zzb;
                        n3 = n4 | 4;
                        object5 = n3;
                        ((HashMap)object).put(string2, object5);
                    }
                    return false;
                }
            }
            throw throwable2;
        }
    }
}


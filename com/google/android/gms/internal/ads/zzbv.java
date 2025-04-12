/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.HashSet;

public final class zzbv {
    private static final HashSet zza;
    private static String zzb;

    static {
        HashSet hashSet;
        zza = hashSet = new HashSet();
        zzb = "media3.common";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza() {
        Class<zzbv> clazz = zzbv.class;
        synchronized (clazz) {
            return zzb;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzb(String string2) {
        Class<zzbv> clazz = zzbv.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zza;
                    boolean bl2 = ((HashSet)object).add(string2);
                    if (bl2) {
                        object = zzb;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object);
                        object = ", ";
                        stringBuilder.append((String)object);
                        stringBuilder.append(string2);
                        zzb = string2 = stringBuilder.toString();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}


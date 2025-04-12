/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

final class zzhi {
    private static final Class zza;
    private static final boolean zzb;

    static {
        boolean bl2;
        zza = zzhi.zza("libcore.io.Memory");
        Class clazz = zzhi.zza("org.robolectric.Robolectric");
        if (clazz != null) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        zzb = bl2;
    }

    private static Class zza(String string2) {
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static boolean zza() {
        boolean bl2;
        Class clazz = zza;
        return clazz != null && !(bl2 = zzb);
    }

    public static Class zzb() {
        return zza;
    }
}


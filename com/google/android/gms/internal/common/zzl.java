/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzj;

public final class zzl {
    public static Object zza(Class clazz, String string2, zzj ... zzjArray) {
        return zzl.zzc(clazz, "isIsolated", null, false, zzjArray);
    }

    public static Object zzb(String string2, String string3, ClassLoader classLoader, zzj ... zzjArray) {
        return zzl.zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zzjArray);
    }

    private static Object zzc(Class clazz, String string2, Object objectArray, boolean bl2, zzj ... zzjArray) {
        int n3;
        int n4 = zzjArray.length;
        Class[] classArray = new Class[n4];
        objectArray = new Object[n4];
        for (int i3 = 0; i3 < (n3 = zzjArray.length); ++i3) {
            Object object = zzjArray[i3];
            object.getClass();
            classArray[i3] = object = ((zzj)object).zzc();
            objectArray[i3] = object = zzjArray[i3].zzd();
        }
        return clazz.getDeclaredMethod(string2, classArray).invoke(null, objectArray);
    }
}


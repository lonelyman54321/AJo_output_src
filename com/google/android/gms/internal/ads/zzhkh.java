/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkc;
import com.google.android.gms.internal.ads.zzhke;

public abstract class zzhkh {
    public static zzhkh zzb(Class object) {
        String string2;
        Object object2 = System.getProperty("java.vm.name");
        boolean bl2 = ((String)object2).equalsIgnoreCase(string2 = "Dalvik");
        if (bl2) {
            object = ((Class)object).getSimpleName();
            object2 = new zzhkc((String)object);
            return object2;
        }
        object = ((Class)object).getSimpleName();
        object2 = new zzhke((String)object);
        return object2;
    }

    public abstract void zza(String var1);
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzar;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;

final class zzbc
implements zzar {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zza(Object object, File object2, File clazz) {
        Class<String> clazz2;
        Class<Boolean> clazz3;
        String string2;
        boolean bl2 = false;
        clazz = "dalvik.system.DexFile";
        try {
            clazz = Class.forName((String)((Object)clazz));
            string2 = "isDexOptNeeded";
            clazz3 = Boolean.class;
            clazz2 = String.class;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return bl2;
        }
        object2 = ((File)object2).getPath();
        object2 = zzbk.zzf(clazz, string2, clazz3, clazz2, object2);
        object2 = (Boolean)object2;
        boolean bl3 = (Boolean)object2;
        if (bl3) return bl2;
        return true;
    }
}


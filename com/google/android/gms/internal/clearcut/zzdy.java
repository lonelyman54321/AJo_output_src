/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzdw;
import com.google.android.gms.internal.clearcut.zzdx;
import java.lang.reflect.Constructor;

final class zzdy {
    private static final zzdw zzna = zzdy.zzcl();
    private static final zzdw zznb;

    static {
        zzdx zzdx2 = new zzdx();
        zznb = zzdx2;
    }

    public static zzdw zzcj() {
        return zzna;
    }

    public static zzdw zzck() {
        return zznb;
    }

    private static zzdw zzcl() {
        Constructor constructor = "com.google.protobuf.NewInstanceSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzdw)((Object)constructor);
    }
}


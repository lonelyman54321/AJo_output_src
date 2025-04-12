/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbu;
import com.google.android.gms.internal.clearcut.zzbv;
import java.lang.reflect.Constructor;

final class zzbx {
    private static final zzbu zzgr;
    private static final zzbu zzgs;

    static {
        zzbv zzbv2 = new zzbv();
        zzgr = zzbv2;
        zzgs = zzbx.zzao();
    }

    private static zzbu zzao() {
        Constructor constructor = "com.google.protobuf.ExtensionSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzbu)((Object)constructor);
    }

    public static zzbu zzap() {
        return zzgr;
    }

    public static zzbu zzaq() {
        Object object = zzgs;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw object;
    }
}


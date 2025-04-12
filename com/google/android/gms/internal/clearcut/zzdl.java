/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzdj;
import com.google.android.gms.internal.clearcut.zzdk;
import java.lang.reflect.Constructor;

final class zzdl {
    private static final zzdj zzmf = zzdl.zzce();
    private static final zzdj zzmg;

    static {
        zzdk zzdk2 = new zzdk();
        zzmg = zzdk2;
    }

    public static zzdj zzcc() {
        return zzmf;
    }

    public static zzdj zzcd() {
        return zzmg;
    }

    private static zzdj zzce() {
        Constructor constructor = "com.google.protobuf.MapFieldSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzdj)((Object)constructor);
    }
}


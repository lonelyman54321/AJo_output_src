/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzdd;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzeg;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzea {
    private static final zzea zznc;
    private final zzeg zznd;
    private final ConcurrentMap zzne;

    static {
        zzea zzea2;
        zznc = zzea2 = new zzea();
    }

    private zzea() {
        String[] stringArray;
        this.zzne = stringArray = new ConcurrentHashMap();
        stringArray = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzeg zzeg2 = null;
        for (int i3 = 0; i3 <= 0 && (zzeg2 = zzea.zzk(stringArray[0])) == null; ++i3) {
        }
        if (zzeg2 == null) {
            zzeg2 = new zzdd();
        }
        this.zznd = zzeg2;
    }

    public static zzea zzcm() {
        return zznc;
    }

    private static zzeg zzk(String constructor) {
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Throwable throwable) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzeg)((Object)constructor);
    }

    public final zzef zze(Class object) {
        Object object2 = "messageType";
        zzci.zza(object, (String)object2);
        Object object3 = (zzef)this.zzne.get(object);
        if (object3 == null) {
            object3 = this.zznd.zzd((Class)object);
            zzci.zza(object, (String)object2);
            zzci.zza(object3, "schema");
            object2 = this.zzne;
            object = object2.putIfAbsent(object, object3);
            if (object != null) {
                object3 = object;
            }
        }
        return object3;
    }

    public final zzef zzp(Object clazz) {
        clazz = clazz.getClass();
        return this.zze(clazz);
    }
}


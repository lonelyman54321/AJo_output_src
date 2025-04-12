/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.io.Serializable;

public final class zzjk {
    public static Object zza(Bundle object, String string2, Class object2, Object serializable) {
        if ((object = object.get(string2)) == null) {
            return serializable;
        }
        serializable = object.getClass();
        boolean bl2 = ((Class)object2).isAssignableFrom((Class<?>)serializable);
        if (bl2) {
            return object;
        }
        object2 = ((Class)object2).getCanonicalName();
        object = object.getClass().getCanonicalName();
        object = h30_0.a(og_1.a("Invalid conditional user property field type. '", string2, "' expected [", (String)object2, "] but was ["), (String)object, "]");
        serializable = new Serializable((String)object);
        throw serializable;
    }

    public static void zza(Bundle bundle, Object object) {
        boolean bl2 = object instanceof Double;
        String string2 = "value";
        if (bl2) {
            double d2 = (Double)object;
            bundle.putDouble(string2, d2);
            return;
        }
        bl2 = object instanceof Long;
        if (bl2) {
            long l2 = (Long)object;
            bundle.putLong(string2, l2);
            return;
        }
        object = object.toString();
        bundle.putString(string2, (String)object);
    }
}


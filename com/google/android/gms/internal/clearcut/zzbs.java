/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbt;
import java.lang.reflect.Method;

final class zzbs {
    private static final Class zzgl = zzbs.zzak();

    private static Class zzak() {
        String string2 = "com.google.protobuf.ExtensionRegistry";
        try {
            return Class.forName(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static zzbt zzal() {
        Object object = zzgl;
        if (object != null) {
            String string2 = "getEmptyRegistry";
            try {
                object = ((Class)object).getDeclaredMethod(string2, null);
            }
            catch (Exception exception) {}
            object = ((Method)object).invoke(null, null);
            return (zzbt)object;
        }
        return zzbt.zzgo;
    }
}


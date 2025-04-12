/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzfza {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Object object;
        Object object2;
        zza = object2 = zzfza.zza();
        Method method = null;
        if (object2 == null) {
            boolean bl2 = false;
            object = null;
        } else {
            int n3 = 2;
            object = new Class[n3];
            object[0] = Throwable.class;
            Object object3 = Integer.TYPE;
            int n4 = 1;
            object[n4] = object3;
            object3 = "getStackTraceElement";
            object = zzfza.zzb((String)object3, object);
        }
        zzb = object;
        if (object2 != null) {
            method = zzfza.zzc(object2);
        }
        zzc = method;
    }

    private static Object zza() {
        Object var0 = null;
        Object object = "sun.misc.SharedSecrets";
        String string2 = null;
        object = Class.forName((String)object, false, null);
        string2 = "getJavaLangAccess";
        object = ((Class)object).getMethod(string2, null);
        try {
            return ((Method)object).invoke(null, null);
        }
        catch (ThreadDeath threadDeath) {
        }
        catch (Throwable throwable) {
            return null;
        }
        throw threadDeath;
    }

    private static Method zzb(String string2, Class ... classArray) {
        Object object = "sun.misc.JavaLangAccess";
        object = Class.forName((String)object, false, null);
        try {
            return ((Class)object).getMethod(string2, classArray);
        }
        catch (ThreadDeath threadDeath) {
        }
        catch (Throwable throwable) {
            return null;
        }
        throw threadDeath;
    }

    private static Method zzc(Object object) {
        Object object2;
        Object object3;
        int n3;
        block8: {
            n3 = 1;
            object3 = "getStackTraceDepth";
            object2 = new Class[n3];
            Class<Throwable> clazz = Throwable.class;
            object2[0] = clazz;
            object3 = zzfza.zzb((String)object3, object2);
            if (object3 != null) break block8;
            return null;
        }
        object2 = new Throwable();
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        try {
            ((Method)object3).invoke(object, objectArray);
            return object3;
        }
        catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException exception) {
            return null;
        }
    }
}


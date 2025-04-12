/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvc;
import com.google.android.gms.internal.gtm.zzvh;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class zzva {
    private static final zzvc zza = zzva.zzb(zzvc.zzo());

    public static /* bridge */ /* synthetic */ zzvc zza() {
        return zza;
    }

    private static zzvc zzb(String[] object) {
        Object object2;
        String string2 = null;
        try {
            object2 = zzvh.zza;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            object2 = null;
        }
        if (object2 != null) {
            return object2;
        }
        object2 = new StringBuilder();
        for (Object object3 : object) {
            Object throwable;
            try {
                throwable = Class.forName((String)object3);
            }
            catch (Throwable throwable2) {
                char c2 = throwable2 instanceof InvocationTargetException;
                if (c2 != '\u0000') {
                    throwable = throwable2.getCause();
                }
                c2 = '\n';
                ((StringBuilder)object2).append(c2);
                ((StringBuilder)object2).append((String)object3);
                object3 = ": ";
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(throwable);
                continue;
            }
            throwable = ((Class)throwable).getConstructor(null);
            throwable = ((Constructor)throwable).newInstance(null);
            return (zzvc)throwable;
        }
        string2 = ((StringBuilder)object2).insert(0, "No logging platforms found:").toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzfyw;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class zzaat
implements zzfyw {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        Object object = "androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder";
        try {
            object = Class.forName((String)object);
            Object var2_3 = null;
            Constructor constructor = ((Class)object).getConstructor(null);
            constructor = constructor.newInstance(null);
            String string2 = "build";
            object = ((Class)object).getMethod(string2, null);
            object = ((Method)object).invoke(constructor, null);
            if (object == null) throw null;
            return (zzdr)object;
        }
        catch (Exception exception) {}
        IllegalStateException illegalStateException = new IllegalStateException(exception);
        throw illegalStateException;
    }
}


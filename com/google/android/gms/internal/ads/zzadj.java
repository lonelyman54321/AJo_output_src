/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzadu;
import java.lang.reflect.Constructor;

public final class zzadj
implements zzadl {
    public final Constructor zza() {
        Class<zzadu> clazz = Class.forName("androidx.media3.decoder.flac.FlacLibrary");
        Class<Integer> clazz2 = null;
        Class[] classArray = Boolean.TRUE;
        boolean bl2 = classArray.equals(clazz = clazz.getMethod("isAvailable", null).invoke(null, null));
        if (bl2) {
            clazz = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadu.class);
            clazz2 = Integer.TYPE;
            classArray = new Class[]{clazz2};
            return clazz.getConstructor(classArray);
        }
        return null;
    }
}


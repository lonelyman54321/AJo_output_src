/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.ads.zzftz;
import java.io.File;

public final class zzftv {
    public static String zza(zzftw object, File file, String string2) {
        object = zzftz.zza;
        object = new File(file, string2);
        return ((File)object).getPath();
    }
}


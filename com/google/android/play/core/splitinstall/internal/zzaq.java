/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzar;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;

final class zzaq
implements zzar {
    public final boolean zza(Object object, File file, File file2) {
        object = (String)zzbk.zzg(object.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2);
        file = new File((String)object);
        return file.exists();
    }
}


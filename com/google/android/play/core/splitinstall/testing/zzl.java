/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileFilter;

public final class zzl
implements FileFilter {
    public static final /* synthetic */ zzl zza;

    static {
        zzl zzl2;
        zza = zzl2 = new zzl();
    }

    private /* synthetic */ zzl() {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}


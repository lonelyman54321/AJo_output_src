/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class zzgdn
implements FilenameFilter {
    private final Pattern zza;

    public zzgdn(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final boolean accept(File file, String string2) {
        return this.zza.matcher(string2).matches();
    }
}


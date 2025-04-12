/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.ff;
import java.io.File;
import java.io.FilenameFilter;

public final class fe
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return ff.b(file, string2);
    }
}


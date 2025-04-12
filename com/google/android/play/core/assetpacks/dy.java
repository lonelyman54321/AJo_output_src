/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.ed;
import java.io.File;
import java.io.FilenameFilter;

public final class dy
implements FilenameFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ dy(String string2) {
        this.a = string2;
    }

    public final boolean accept(File object, String string2) {
        int n3 = ed.a;
        object = String.valueOf(this.a);
        String string3 = "-";
        n3 = (int)(string2.startsWith((String)(object = ((String)object).concat(string3))) ? 1 : 0);
        return n3 != 0 && (n3 = (int)(string2.endsWith((String)(object = ".apk")) ? 1 : 0)) != 0;
    }
}


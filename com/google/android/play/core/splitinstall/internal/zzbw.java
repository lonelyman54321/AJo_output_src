/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import java.io.File;

public final class zzbw {
    public static String zza(File object) {
        String string2;
        String string3 = ((File)object).getName();
        boolean bl2 = string3.endsWith(string2 = ".apk");
        if (bl2) {
            object = ((File)object).getName();
            string2 = "";
            bl2 = ((String)(object = ((String)object).replaceFirst("(_\\d+)?\\.apk", string2))).equals(string3 = "base-master");
            if (!bl2 && !(bl2 = ((String)object).equals(string3 = "base-main"))) {
                string3 = "base-";
                boolean bl3 = ((String)object).startsWith(string3);
                if (bl3) {
                    return ((String)object).replace(string3, "config.");
                }
                return ((String)object).replace("-", ".config.").replace(".config.master", string2).replace(".config.main", string2);
            }
            return string2;
        }
        object = new IllegalArgumentException("Non-apk found in splits directory.");
        throw object;
    }
}


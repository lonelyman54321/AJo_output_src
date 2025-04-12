/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

final class zzt {
    private final Context zza;

    public zzt(Context context) {
        this.zza = context;
    }

    private static long zzb(File fileArray) {
        boolean bl2 = fileArray.isDirectory();
        if (!bl2) {
            return fileArray.length();
        }
        fileArray = fileArray.listFiles();
        long l2 = 0L;
        if (fileArray != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = fileArray.length); ++i3) {
                File file = fileArray[i3];
                long l3 = zzt.zzb(file);
                l2 += l3;
            }
        }
        return l2;
    }

    public final long zza() {
        File file = this.zza.getFilesDir();
        File file2 = new File(file, "assetpacks");
        return zzt.zzb(file2);
    }
}


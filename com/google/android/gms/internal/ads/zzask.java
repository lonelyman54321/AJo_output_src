/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarz;
import java.io.File;

final class zzask
implements zzarz {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzask(Context context) {
        this.zza = context;
    }

    public final File zza() {
        File file = this.zzb;
        if (file == null) {
            File file2;
            file = this.zza;
            file = file.getCacheDir();
            String string2 = "volley";
            this.zzb = file2 = new File(file, string2);
        }
        return this.zzb;
    }
}


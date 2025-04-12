/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Callable;

public final class zzn
implements Callable {
    public final /* synthetic */ Uri zza;

    public /* synthetic */ zzn(Uri uri) {
        this.zza = uri;
    }

    public final Object call() {
        zzu.zzp();
        return zzt.zzP(this.zza);
    }
}


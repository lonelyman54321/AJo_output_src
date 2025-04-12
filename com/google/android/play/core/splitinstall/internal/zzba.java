/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzaw;
import com.google.android.play.core.splitinstall.internal.zzay;
import java.io.File;
import java.util.Set;

final class zzba
implements zzan {
    public final void zza(ClassLoader classLoader, Set set) {
        zzaw zzaw2 = new zzaw();
        zzay.zzc(classLoader, set, zzaw2);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        return zzay.zzd(classLoader, file, file2, bl2, "zip");
    }
}


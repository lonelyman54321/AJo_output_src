/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzav;
import com.google.android.play.core.splitinstall.internal.zzbd;
import com.google.android.play.core.splitinstall.internal.zzbf;
import java.io.File;
import java.util.Set;

final class zzbg
implements zzan {
    public final void zza(ClassLoader classLoader, Set set) {
        zzbd.zzc(classLoader, set);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        zzav zzav2 = new zzav();
        zzbf zzbf2 = new zzbf();
        return zzat.zze(classLoader, file, file2, bl2, zzav2, "path", zzbf2);
    }
}


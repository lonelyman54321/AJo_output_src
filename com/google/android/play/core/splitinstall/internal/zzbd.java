/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzav;
import com.google.android.play.core.splitinstall.internal.zzay;
import com.google.android.play.core.splitinstall.internal.zzbb;
import com.google.android.play.core.splitinstall.internal.zzbc;
import java.io.File;
import java.util.Set;

final class zzbd
implements zzan {
    public static void zzc(ClassLoader classLoader, Set set) {
        zzbb zzbb2 = new zzbb();
        zzay.zzc(classLoader, set, zzbb2);
    }

    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean bl2) {
        zzav zzav2 = new zzav();
        zzbc zzbc2 = new zzbc();
        return zzat.zze(classLoader, file, file2, bl2, zzav2, "path", zzbc2);
    }

    public final void zza(ClassLoader classLoader, Set set) {
        zzbd.zzc(classLoader, set);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        return zzbd.zzd(classLoader, file, file2, bl2);
    }
}


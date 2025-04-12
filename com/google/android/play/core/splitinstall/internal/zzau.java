/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzap;
import com.google.android.play.core.splitinstall.internal.zzaq;
import com.google.android.play.core.splitinstall.internal.zzat;
import java.io.File;
import java.util.Set;

final class zzau
implements zzan {
    public final void zza(ClassLoader classLoader, Set set) {
        zzat.zzd(classLoader, set);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        zzap zzap2 = new zzap();
        zzaq zzaq2 = new zzaq();
        return zzat.zze(classLoader, file, file2, bl2, zzap2, "zip", zzaq2);
    }
}


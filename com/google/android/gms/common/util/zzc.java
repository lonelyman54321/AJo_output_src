/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$VmPolicy
 *  android.os.StrictMode$VmPolicy$Builder
 */
package com.google.android.gms.common.util;

import android.os.StrictMode;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.zzb;

public final class zzc {
    public static StrictMode.VmPolicy zza() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        boolean bl2 = PlatformVersion.isAtLeastS();
        if (bl2) {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(vmPolicy);
            builder = zzb.zza(builder).build();
            StrictMode.setVmPolicy((StrictMode.VmPolicy)builder);
        }
        return vmPolicy;
    }
}


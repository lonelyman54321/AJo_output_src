/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.ump;

import com.google.android.ump.ConsentDebugSettings$Builder;
import com.google.android.ump.zza;

public class ConsentDebugSettings {
    private final boolean zza;
    private final int zzb;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ ConsentDebugSettings(boolean bl2, ConsentDebugSettings$Builder consentDebugSettings$Builder, zza zza2) {
        void var2_3;
        int n3;
        this.zza = bl2;
        this.zzb = n3 = ConsentDebugSettings$Builder.zza((ConsentDebugSettings$Builder)var2_3);
    }

    public int getDebugGeography() {
        return this.zzb;
    }

    public boolean isTestDevice() {
        return this.zza;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitcompat;

import android.content.Context;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzs;
import com.google.android.play.core.splitinstall.zzx;

public final class zzo
implements Runnable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzo(Context context) {
        this.zza = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        boolean bl2;
        Object object = this.zza;
        int n3 = SplitCompat.zza;
        try {
            object = zzx.zzg((Context)object);
            bl2 = true;
        }
        catch (SecurityException securityException) {
            return;
        }
        ((zzs)object).zzc(bl2);
    }
}


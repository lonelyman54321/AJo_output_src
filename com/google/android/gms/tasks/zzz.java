/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;

final class zzz
implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzz(zzw zzw2, Callable callable) {
        this.zza = zzw2;
        this.zzb = callable;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        try {
            var1_1 = this.zza;
            var2_4 = this.zzb;
            var2_4 = var2_4.call();
            var1_1.zzb(var2_4);
            return;
        }
        catch (Exception var1_3) {}
        ** finally { 
lbl9:
        // 1 sources

        var2_4 = this.zza;
        var3_5 = new RuntimeException(var1_2);
        var2_4.zza(var3_5);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzfre;

final class zzawv
implements Runnable {
    final /* synthetic */ zzaww zza;

    public zzawv(zzaww zzaww2) {
        this.zza = zzaww2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        block8: {
            Object object = zzaww.zzd(this.zza);
            // MONITORENTER : object
            Object object2 = this.zza;
            boolean bl2 = zzaww.zzq((zzaww)object2);
            if (bl2) break block8;
            object2 = this.zza;
            int n3 = 1;
            zzaww.zzi((zzaww)object2, n3 != 0);
            // MONITOREXIT : object
            try {
                object = this.zza;
                zzaww.zzj((zzaww)object);
            }
            catch (Exception exception) {
                object2 = zzaww.zzc(this.zza);
                n3 = 2023;
                long l2 = -1;
                ((zzfre)object2).zzc(n3, l2, exception);
            }
            object = this.zza;
            object2 = zzaww.zzd((zzaww)object);
            // MONITORENTER : object2
            object = this.zza;
            n3 = 0;
            zzaww.zzi((zzaww)object, false);
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object
    }
}


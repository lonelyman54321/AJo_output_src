/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tagmanager.zzaf;
import com.google.android.gms.tagmanager.zzag;
import com.google.android.gms.tagmanager.zzah;
import com.google.android.gms.tagmanager.zzdb;
import com.google.android.gms.tagmanager.zzx;

final class zzab
implements zzdb {
    final /* synthetic */ zzag zza;

    public /* synthetic */ zzab(zzag zzag2, zzaf zzaf2) {
        this.zza = zzag2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza(int n3) {
        block5: {
            Object object2;
            block6: {
                Object object;
                int n4 = 4;
                if (n3 == n4) {
                    object = zzag.zzf(this.zza);
                    ((zzah)object).zzc();
                }
                object = this.zza;
                // MONITORENTER : object
                object2 = this.zza;
                n4 = (int)(((BasePendingResult)object2).isReady() ? 1 : 0);
                if (n4 != 0) break block5;
                object2 = this.zza;
                if ((object2 = zzag.zze((zzag)object2)) == null) break block6;
                object2 = this.zza;
                zzx zzx2 = zzag.zze((zzag)object2);
                ((BasePendingResult)object2).setResult(zzx2);
                break block5;
            }
            object2 = this.zza;
            Result result2 = Status.RESULT_TIMEOUT;
            result2 = ((zzag)object2).zzd((Status)result2);
            ((BasePendingResult)object2).setResult(result2);
        }
        // MONITOREXIT : object
        long l2 = zzag.zzf(this.zza).zzb();
        zzag.zzi(this.zza, l2);
    }
}


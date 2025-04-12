/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.zzae;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.ExecutionException;

final class zzaf
implements zzae {
    private final Object zza;
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int n3, zzw zzw2) {
        Object object;
        this.zza = object = new Object();
        this.zzb = n3;
        this.zzc = zzw2;
    }

    private final void zza() {
        int n3 = this.zzd;
        int n4 = this.zze;
        n3 += n4;
        n4 = this.zzf;
        if ((n3 += n4) == (n4 = this.zzb)) {
            Object object = this.zzg;
            if (object != null) {
                object = this.zzc;
                int n7 = this.zze;
                int n8 = this.zzb;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n7);
                stringBuilder.append(" out of ");
                stringBuilder.append(n8);
                stringBuilder.append(" underlying tasks failed");
                String string2 = stringBuilder.toString();
                Exception exception = this.zzg;
                ExecutionException executionException = new ExecutionException(string2, exception);
                ((zzw)object).zza(executionException);
                return;
            }
            n3 = (int)(this.zzh ? 1 : 0);
            if (n3 != 0) {
                this.zzc.zzc();
                return;
            }
            object = this.zzc;
            n4 = 0;
            Object var4_5 = null;
            ((zzw)object).zzb(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCanceled() {
        Object object = this.zza;
        synchronized (object) {
            int n3 = this.zzf;
            int n4 = 1;
            this.zzf = n3 += n4;
            this.zzh = n4;
            this.zza();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onFailure(Exception exception) {
        Object object = this.zza;
        synchronized (object) {
            int n3;
            this.zze = n3 = this.zze + 1;
            this.zzg = exception;
            this.zza();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(Object object) {
        object = this.zza;
        synchronized (object) {
            int n3;
            this.zzd = n3 = this.zzd + 1;
            this.zza();
            return;
        }
    }
}


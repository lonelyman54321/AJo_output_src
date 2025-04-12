/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazk
extends zzazs {
    private final StackTraceElement[] zzi;

    public zzazk(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, StackTraceElement[] stackTraceElementArray) {
        super(zzaye2, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", zzatp2, n3, 45);
        this.zzi = stackTraceElementArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzi;
        if (object == null) {
            return;
        }
        Object object2 = this.zzf;
        boolean bl2 = false;
        Object object3 = null;
        int n3 = 1;
        Object object4 = new Object[n3];
        object4[0] = object;
        object = (String)((Method)object2).invoke(null, (Object[])object4);
        object2 = new zzaxv((String)object);
        object = this.zze;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block7: {
                    block5: {
                        try {
                            object3 = this.zze;
                            object4 = ((zzaxv)object2).zza;
                            long l2 = (Long)object4;
                            ((zzatp)object3).zzL(l2);
                            object3 = ((zzaxv)object2).zzb;
                            bl2 = (Boolean)object3;
                            if (bl2) {
                                object3 = this.zze;
                                object2 = ((zzaxv)object2).zzc;
                                boolean bl3 = (Boolean)object2;
                                object2 = bl3 ? zzavc.zza : zzavc.zzb;
                            }
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        ((zzatp)object3).zzA((zzavc)object2);
                        break block7;
                    }
                    object2 = this.zze;
                    object3 = zzavc.zzc;
                    ((zzatp)object2).zzA((zzavc)object3);
                }
                return;
            }
            throw throwable2;
        }
    }
}


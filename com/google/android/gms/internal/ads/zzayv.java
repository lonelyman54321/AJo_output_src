/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;

public final class zzayv
extends zzazs {
    private final long zzi;

    public zzayv(zzaye zzaye2, String string2, String string3, zzatp zzatp2, long l2, int n3, int n4) {
        super(zzaye2, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzatp2, n3, 25);
        this.zzi = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = (Long)this.zzf.invoke(null, null);
        long l2 = (Long)object;
        zzatp zzatp2 = this.zze;
        synchronized (zzatp2) {
            Throwable throwable2;
            block5: {
                block4: {
                    zzatp zzatp3;
                    long l3;
                    try {
                        zzatp zzatp4 = this.zze;
                        zzatp4.zzv(l2);
                        l3 = this.zzi;
                        long l4 = 0L;
                        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                        if (l7 == false) break block4;
                        zzatp3 = this.zze;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzatp3.zzZ(l2 -= l3);
                    object = this.zze;
                    l3 = this.zzi;
                    ((zzatp)object).zzab(l3);
                }
                return;
            }
            throw throwable2;
        }
    }
}


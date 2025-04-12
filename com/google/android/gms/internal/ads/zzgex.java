/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeu;
import com.google.android.gms.internal.ads.zzgew;
import com.google.android.gms.internal.ads.zzgey;
import java.util.Set;

final class zzgex
extends zzgeu {
    private zzgex() {
        throw null;
    }

    public /* synthetic */ zzgex(zzgew zzgew2) {
        super(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(zzgey zzgey2) {
        synchronized (zzgey2) {
            int n3 = zzgey.zzz(zzgey2) + -1;
            zzgey.zzD(zzgey2, n3);
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzgey zzgey2, Set set, Set set2) {
        synchronized (zzgey2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        set = zzgey.zzB(zzgey2);
                        if (set != null) break block3;
                        zzgey.zzE(zzgey2, set2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


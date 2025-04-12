/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaig;

public final class zzaii
extends zzacc
implements zzadm {
    private static final zzaii zzd;
    private byte zze = (byte)2;

    static {
        zzaii zzaii2;
        zzd = zzaii2 = new zzaii();
        zzacf.zzao(zzaii.class, zzaii2);
    }

    private zzaii() {
    }

    public static /* bridge */ /* synthetic */ zzaii zzc() {
        return zzd;
    }

    public static zzaii zze() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        if ((n3 += -1) != 0) {
            int n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            if (object == null) {
                                n3 = 0;
                                Object var5_5 = null;
                            } else {
                                n3 = 1;
                            }
                            this.zze = (byte)n3;
                            return null;
                        }
                        return zzd;
                    }
                    zzaig zzaig2 = new zzaig(null);
                    return zzaig2;
                }
                zzaii zzaii2 = new zzaii();
                return zzaii2;
            }
            return zzacf.zzal(zzd, "\u0003\u0000", null);
        }
        return this.zze;
    }
}


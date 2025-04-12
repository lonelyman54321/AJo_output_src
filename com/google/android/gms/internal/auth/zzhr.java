/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzfx;
import com.google.android.gms.internal.auth.zzhq;
import java.util.List;

public final class zzhr
extends zzeu
implements zzfx {
    private static final zzhr zzb;
    private zzey zzd;

    static {
        zzhr zzhr2;
        zzb = zzhr2 = new zzhr();
        zzeu.zzg(zzhr.class, zzhr2);
    }

    private zzhr() {
        zzey zzey2;
        this.zzd = zzey2 = zzeu.zzc();
    }

    public static /* synthetic */ zzhr zzj() {
        return zzb;
    }

    public static zzhr zzk(byte[] byArray) {
        return (zzhr)zzeu.zzb(zzb, byArray);
    }

    public final Object zzi(int n3, Object object, Object object2) {
        int n4 = 1;
        if ((n3 += -1) != 0) {
            int n7 = 2;
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return null;
                        }
                        return zzb;
                    }
                    zzhq zzhq2 = new zzhq(null);
                    return zzhq2;
                }
                zzhr zzhr2 = new zzhr();
                return zzhr2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            return zzeu.zzf(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objectArray);
        }
        return (byte)n4;
    }

    public final List zzl() {
        return this.zzd;
    }
}


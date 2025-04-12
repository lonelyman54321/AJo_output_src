/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzae;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzv;

public final class zzaf
extends zzacf
implements zzadm {
    private static final zzaf zza;
    private int zzd;
    private String zze = "";
    private zzap zzf;
    private zzv zzg;
    private byte zzh = (byte)2;

    static {
        zzaf zzaf2;
        zza = zzaf2 = new zzaf();
        zzacf.zzao(zzaf.class, zzaf2);
    }

    private zzaf() {
    }

    public static /* bridge */ /* synthetic */ zzaf zzc() {
        return zza;
    }

    public final zzv zza() {
        zzv zzv2 = this.zzg;
        if (zzv2 == null) {
            zzv2 = zzv.zzc();
        }
        return zzv2;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzae zzae2 = new zzae(null);
                    return zzae2;
                }
                zzaf zzaf2 = new zzaf();
                return zzaf2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002", objectArray);
        }
        return this.zzh;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        int n3 = this.zzd & 4;
        return n3 != 0;
    }

    public final boolean zzf() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}


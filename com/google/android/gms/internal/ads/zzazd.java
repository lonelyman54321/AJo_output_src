/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzaxh;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazd
extends zzazs {
    private final zzaxh zzi;
    private final long zzj;
    private final long zzk;

    public zzazd(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, zzaxh zzaxh2, long l2, long l3) {
        super(zzaye2, "gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", zzatp2, n3, 11);
        this.zzi = zzaxh2;
        this.zzj = l2;
        this.zzk = l3;
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
        object = ((zzaxh)object).zzb();
        long l2 = this.zzj;
        Object object3 = l2;
        long l3 = this.zzk;
        Long l4 = l3;
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object3;
        objectArray[2] = l4;
        object = (String)((Method)object2).invoke(null, objectArray);
        object2 = new zzaxf((String)object);
        object = this.zze;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                long l7;
                long l8;
                long l12;
                block5: {
                    try {
                        object3 = this.zze;
                        l4 = ((zzaxf)object2).zza;
                        l3 = l4;
                        ((zzatp)object3).zzE(l3);
                        object3 = ((zzaxf)object2).zzb;
                        l2 = (Long)object3;
                        l12 = 0L;
                        l8 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
                        if (l8 < 0) break block5;
                        object3 = this.zze;
                        l4 = ((zzaxf)object2).zzb;
                        long l14 = l4;
                        ((zzatp)object3).zzW(l14);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((l8 = (l7 = (l2 = ((Long)(object3 = ((zzaxf)object2).zzc)).longValue()) - l12) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0) {
                    object3 = this.zze;
                    object2 = ((zzaxf)object2).zzc;
                    l3 = (Long)object2;
                    ((zzatp)object3).zzg(l3);
                }
                return;
            }
            throw throwable2;
        }
    }
}


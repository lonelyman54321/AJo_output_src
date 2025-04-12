/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzayt
extends zzazs {
    public zzayt(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "2/TrxXzdli4Us4FPDPyGZmc5MrxtH8QgmFF/OAjS44SLVVLbzYRftaNDX3sVzVmu", "9ObkV+9nuY0gPBNLH25GoxM7YATuF1pi7IORvVFb3+Q=", zzatp2, n3, 5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zze;
        long l2 = -1;
        ((zzatp)object).zzn(l2);
        this.zze.zzm(l2);
        object = this.zzf;
        Object object2 = this.zzb.zzb();
        Object object3 = 1;
        Object object4 = new Object[object3];
        int n3 = false;
        object4[0] = object2;
        object = (int[])((Method)object).invoke(null, (Object[])object4);
        object2 = this.zze;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object4 = this.zze;
                        n3 = object[0];
                        long l3 = n3;
                        ((zzatp)object4).zzn(l3);
                        object4 = this.zze;
                        object3 = object[object3];
                        l3 = object3;
                        ((zzatp)object4).zzm(l3);
                        object3 = 2;
                        Object object5 = object[object3];
                        object3 = -1 << -1;
                        if (object5 == object3) break block3;
                        zzatp zzatp2 = this.zze;
                        long l4 = (long)object5;
                        zzatp2.zzl(l4);
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


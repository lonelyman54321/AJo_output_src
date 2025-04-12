/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;
import java.util.List;

public final class zzazi
extends zzazs {
    private List zzi = null;
    private final Context zzj;

    public zzazi(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, Context context) {
        super(zzaye2, "/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", zzatp2, n3, 31);
        this.zzj = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        int n3;
        int n4;
        List list;
        Object object;
        Object object2 = null;
        int n7 = 1;
        Object object3 = this.zze;
        long l2 = -1;
        ((zzatp)object3).zzad(l2);
        this.zze.zzY(l2);
        object3 = this.zzj;
        if (object3 == null) {
            object3 = this.zzb.zzb();
        }
        if ((object = this.zzi) == null) {
            object = this.zzf;
            list = null;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object3;
            this.zzi = object3 = (List)((Method)object).invoke(null, objectArray);
        }
        if ((object3 = this.zzi) != null && (n4 = object3.size()) == (n3 = 2)) {
            object3 = this.zze;
            synchronized (object3) {
                object = this.zze;
                list = this.zzi;
                object2 = list.get(0);
                object2 = (Long)object2;
                long l3 = (Long)object2;
                ((zzatp)object).zzad(l3);
                object2 = this.zze;
                object = this.zzi;
                Object object4 = object.get(n7);
                object4 = (Long)object4;
                l2 = (Long)object4;
                ((zzatp)object2).zzY(l2);
                return;
            }
        }
    }
}


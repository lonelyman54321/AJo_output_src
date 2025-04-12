/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;
import java.util.Map;

public final class zzayz
extends zzazs {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzayz(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, Map map2, View view, Context context) {
        super(zzaye2, "SKSJAjN3UKeguXyEasCGg04d/yJuUN8XZYgactMp4rfMtHcIJcD0mydl5RKvI49M", "lnMUlT0qopStslq/RfZHkyvg0xAUTVuMPsMot4SEaYA=", zzatp2, n3, 85);
        this.zzi = map2;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int n3) {
        Map map2 = this.zzi;
        Integer n4 = n3;
        boolean bl2 = map2.containsKey(n4);
        if (bl2) {
            return (Long)this.zzi.get(n4);
        }
        return Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        int n3 = 3;
        int n4 = 1;
        long l2 = this.zzc(n4);
        int n7 = 2;
        Object object = this.zzc(n7);
        Object object2 = new long[n7];
        object2[0] = l2;
        object2[n4] = object;
        Object object3 = this.zzk;
        if (object3 == null) {
            object3 = this.zzb.zzb();
        }
        Object object4 = this.zzf;
        View view = this.zzj;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        objectArray[n4] = object3;
        objectArray[n7] = view;
        object3 = (long[])((Method)object4).invoke(null, objectArray);
        object = object3[0];
        object4 = this.zzi;
        object2 = n4;
        Context context = object3[n4];
        Object object5 = (long)context;
        object4.put(object2, object5);
        Context context2 = object3[n7];
        object5 = this.zzi;
        object4 = n7;
        Context context3 = object3[n3];
        Object object6 = (long)context3;
        object5.put(object4, object6);
        object6 = this.zze;
        synchronized (object6) {
            object5 = this.zze;
            ((zzatp)object5).zzx((long)object);
            object5 = this.zze;
            ((zzatp)object5).zzw((long)context2);
            return;
        }
    }
}


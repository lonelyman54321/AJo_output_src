/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazl
extends zzazs {
    public zzazl(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "6JHAw9/xzu8LcH4q9f7Udi9sTntehS9dfukXhX8DEHhp54WYBhd6ZhWkqnOAMGmY", "bFK3lRg0oaTUwYDrSsMiLa/j4LG9nRlI5KKEyt63x08=", zzatp2, n3, 51);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzatp zzatp2 = this.zze;
        synchronized (zzatp2) {
            Object object = this.zzf;
            Object object2 = null;
            object = ((Method)object).invoke(null, null);
            object = (String)object;
            object2 = new zzaxz((String)object);
            object = this.zze;
            Long l2 = ((zzaxz)object2).zza;
            long l3 = l2;
            ((zzatp)object).zzq(l3);
            object = this.zze;
            object2 = ((zzaxz)object2).zzb;
            long l4 = (Long)object2;
            ((zzatp)object).zzr(l4);
            return;
        }
    }
}


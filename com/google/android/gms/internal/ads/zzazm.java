/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazm
extends zzazs {
    private final zzayl zzi;
    private long zzj;

    public zzazm(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, zzayl zzayl2) {
        String string4 = "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=";
        int n7 = 53;
        String string5 = "1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa";
        super(zzaye2, string5, string4, zzatp2, n3, n7);
        this.zzi = zzayl2;
        if (zzayl2 != null) {
            long l2;
            this.zzj = l2 = zzayl2.zza();
        }
    }

    public final void zza() {
        Object object = this.zzi;
        if (object != null) {
            object = this.zze;
            Object object2 = this.zzf;
            long l2 = this.zzj;
            Long l3 = l2;
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = l3;
            l3 = null;
            object2 = (Long)((Method)object2).invoke(null, objectArray);
            long l4 = (Long)object2;
            ((zzatp)object).zzV(l4);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkw;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzld;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzln;
import com.google.android.gms.internal.measurement.zzlq;
import com.google.android.gms.internal.measurement.zzls;
import com.google.android.gms.internal.measurement.zzlu;
import com.google.android.gms.internal.measurement.zzlw;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmg;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzmu;

final class zzla
implements zzmh {
    private static final zzln zza;
    private final zzln zzb;

    static {
        zzld zzld2 = new zzld();
        zza = zzld2;
    }

    public zzla() {
        zzln zzln2 = zzke.zza();
        zzln[] zzlnArray = new zzln[2];
        zzlnArray[0] = zzln2;
        zzln2 = zza;
        zzlnArray[1] = zzln2;
        zzlf zzlf2 = new zzlf(zzlnArray);
        this(zzlf2);
    }

    private zzla(zzln zzln2) {
        this.zzb = zzln2 = (zzln)zzkj.zza(zzln2, "messageInfoFactory");
    }

    public final zzme zza(Class object) {
        zzmg.zza((Class)object);
        Object object2 = this.zzb;
        zzlk zzlk2 = object2.zza((Class)object);
        boolean n3 = zzlk2.zzc();
        if (n3) {
            object = zzmg.zza();
            object2 = zzjx.zza();
            zzlm zzlm2 = zzlk2.zza();
            return zzls.zza((zzmu)object, (zzjv)object2, zzlm2);
        }
        zzlu zzlu2 = zzlw.zza();
        zzkw zzkw2 = zzky.zza();
        zzmu zzmu2 = zzmg.zza();
        object2 = zzlc.zza;
        Object object3 = zzlk2.zzb();
        int n4 = object3.ordinal();
        Object object4 = object2[n4];
        if (object4 != (n4 = 1)) {
            object2 = zzjx.zza();
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        zzlj zzlj2 = zzll.zza();
        object3 = object;
        return zzlq.zza((Class)object, zzlk2, zzlu2, zzkw2, zzmu2, (zzjv)object2, zzlj2);
    }
}


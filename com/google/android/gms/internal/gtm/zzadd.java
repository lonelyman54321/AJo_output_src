/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabr;
import com.google.android.gms.internal.gtm.zzabt;
import com.google.android.gms.internal.gtm.zzabz;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzacy;
import com.google.android.gms.internal.gtm.zzacz;
import com.google.android.gms.internal.gtm.zzadb;
import com.google.android.gms.internal.gtm.zzadc;
import com.google.android.gms.internal.gtm.zzadg;
import com.google.android.gms.internal.gtm.zzadh;
import com.google.android.gms.internal.gtm.zzadi;
import com.google.android.gms.internal.gtm.zzadj;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzado;
import com.google.android.gms.internal.gtm.zzadp;
import com.google.android.gms.internal.gtm.zzadr;
import com.google.android.gms.internal.gtm.zzads;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzady;
import com.google.android.gms.internal.gtm.zzadz;
import com.google.android.gms.internal.gtm.zzaem;

final class zzadd
implements zzady {
    private static final zzadj zza;
    private final zzadj zzb;

    static {
        zzadb zzadb2 = new zzadb();
        zza = zzadb2;
    }

    public zzadd() {
        Object object = zzabz.zza();
        zzadj[] zzadjArray = new zzadj[2];
        zzadjArray[0] = object;
        object = zza;
        zzadjArray[1] = object;
        zzadc zzadc2 = new zzadc(zzadjArray);
        object = zzaco.zzb;
        this.zzb = zzadc2;
    }

    public final zzadx zza(Class object) {
        zzadi zzadi2;
        int n3 = zzadz.zza;
        Class<zzacf> clazz = zzacf.class;
        n3 = (int)(clazz.isAssignableFrom((Class<?>)object) ? 1 : 0);
        if (n3 == 0) {
            n3 = zzadt.zza;
        }
        if ((n3 = (int)((zzadi2 = (clazz = this.zzb).zzb((Class)object)).zzb() ? 1 : 0)) == 0) {
            int n4;
            n3 = zzadt.zza;
            zzadr zzadr2 = zzads.zza();
            zzacy zzacy2 = zzacz.zza();
            zzaem zzaem2 = zzadz.zzm();
            n3 = zzadi2.zzc() + -1;
            if (n3 != (n4 = 1)) {
                clazz = zzabt.zza();
            } else {
                n3 = 0;
                clazz = null;
            }
            zzadg zzadg2 = zzadh.zza();
            Object object2 = object;
            return zzado.zzm((Class)object, zzadi2, zzadr2, zzacy2, zzaem2, (zzabr)((Object)clazz), zzadg2);
        }
        object = zzadz.zzm();
        clazz = zzabt.zza();
        zzadl zzadl2 = zzadi2.zza();
        return zzadp.zzc((zzaem)object, (zzabr)((Object)clazz), zzadl2);
    }
}


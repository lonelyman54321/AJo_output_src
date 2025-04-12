/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabo;
import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzabv;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzaef;
import com.google.android.gms.internal.gtm.zzaey;
import com.google.android.gms.internal.gtm.zzyj;
import java.util.List;

public abstract class zzacc
extends zzacf
implements zzadm {
    protected zzabv zza;

    public zzacc() {
        zzabv zzabv2;
        this.zza = zzabv2 = zzabv.zze();
    }

    private final void zzc(zzace object) {
        object = ((zzace)object).zza;
        int n3 = 6;
        zzacf zzacf2 = (zzacf)this.zzb(n3, null, null);
        if (object == zzacf2) {
            return;
        }
        object = new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        throw object;
    }

    public final zzabv zzU() {
        zzabv zzabv2 = this.zza;
        boolean bl2 = zzabv2.zzl();
        if (bl2) {
            this.zza = zzabv2 = this.zza.zzd();
        }
        return this.zza;
    }

    public final Object zzV(zzabo zzabo2) {
        zzabo2 = (zzace)zzabo2;
        this.zzc((zzace)zzabo2);
        Object object = this.zza;
        Object object2 = ((zzace)zzabo2).zzd;
        object = ((zzabv)object).zzf((zzabu)object2);
        if (object == null) {
            return ((zzace)zzabo2).zzb;
        }
        object2 = ((zzace)zzabo2).zzd;
        int n3 = object2.zzd;
        if (n3 != 0) {
            Object object3;
            object2 = object2.zzc.zza();
            if (object2 == (object3 = zzaey.zzh)) {
                object2 = new zzadu();
                object = (List)object;
                n3 = object.size();
                ((zzadu)object2).zzf(n3);
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = object.next();
                    object3 = ((zzace)zzabo2).zza(object3);
                    ((zzadu)object2).add(object3);
                }
                ((zzyj)object2).zzb();
                object = object2;
            }
        } else {
            object = ((zzace)zzabo2).zza(object);
        }
        return object;
    }

    public final boolean zzW(zzabo object) {
        object = (zzace)object;
        this.zzc((zzace)object);
        Object object2 = this.zza;
        object = ((zzace)object).zzd;
        boolean bl2 = ((zzacd)object).zzd;
        if (!bl2) {
            object2 = ((zzabv)object2).zza;
            return (object = ((zzaef)object2).get(object)) != null;
        }
        object = new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        throw object;
    }
}


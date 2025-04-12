/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzael;
import com.google.android.gms.internal.gtm.zzyg;
import com.google.android.gms.internal.gtm.zzyh;

public class zzaca
extends zzyg {
    protected zzacf zza;
    private final zzacf zzb;

    public zzaca(zzacf object) {
        this.zzb = object;
        boolean bl2 = ((zzacf)object).zzar();
        if (!bl2) {
            this.zza = object = ((zzacf)object).zzae();
            return;
        }
        object = new IllegalArgumentException("Default instance must be immutable.");
        throw object;
    }

    private static void zza(Object object, Object object2) {
        zzadt zzadt2 = zzadt.zza();
        Class<?> clazz = object.getClass();
        zzadt2.zzb(clazz).zzg(object, object2);
    }

    public final zzaca zzA(zzacf zzacf2) {
        zzacf zzacf3 = this.zzb;
        boolean bl2 = zzacf3.equals(zzacf2);
        if (!bl2) {
            zzacf3 = this.zza;
            bl2 = zzacf3.zzar();
            if (!bl2) {
                this.zzH();
            }
            zzacf3 = this.zza;
            zzaca.zza(zzacf3, zzacf2);
        }
        return this;
    }

    public final zzacf zzB() {
        zzacf zzacf2 = this.zzC();
        boolean bl2 = zzacf.zzaq(zzacf2, true);
        if (bl2) {
            return zzacf2;
        }
        zzael zzael2 = new zzael(zzacf2);
        throw zzael2;
    }

    public zzacf zzC() {
        zzacf zzacf2 = this.zza;
        boolean bl2 = zzacf2.zzar();
        if (!bl2) {
            return this.zza;
        }
        this.zza.zzam();
        return this.zza;
    }

    public final void zzG() {
        zzacf zzacf2 = this.zza;
        boolean bl2 = zzacf2.zzar();
        if (!bl2) {
            this.zzH();
        }
    }

    public void zzH() {
        zzacf zzacf2 = this.zzb.zzae();
        zzacf zzacf3 = this.zza;
        zzaca.zza(zzacf2, zzacf3);
        this.zza = zzacf2;
    }

    public final /* synthetic */ zzadl zzay() {
        return this.zzb;
    }

    public final boolean zzaz() {
        return zzacf.zzaq(this.zza, false);
    }

    public final /* synthetic */ zzyg zzw(zzyh zzyh2) {
        zzyh2 = (zzacf)zzyh2;
        this.zzA((zzacf)zzyh2);
        return this;
    }

    public final zzaca zzz() {
        zzacf zzacf2;
        zzaca zzaca2 = (zzaca)this.zzb.zzb(5, null, null);
        zzaca2.zza = zzacf2 = this.zzC();
        return zzaca2;
    }
}


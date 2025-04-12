/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfpc;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfpt;
import com.google.android.gms.internal.ads.zzfqv;
import java.lang.ref.Reference;
import java.util.Date;
import java.util.List;
import java.util.Map;

public final class zzfon
extends zzfoj {
    private final zzfol zza;
    private final zzfok zzb;
    private final zzfpi zzc;
    private zzfqv zzd;
    private zzfps zze;
    private boolean zzf;
    private boolean zzg;
    private final String zzh;

    public zzfon(zzfok zzfok2, zzfol object, String string2) {
        Object object2 = new zzfpi();
        this.zzc = object2;
        this.zzf = false;
        this.zzg = false;
        this.zzb = zzfok2;
        this.zza = object;
        this.zzh = string2;
        object2 = null;
        this.zzk(null);
        Object object3 = ((zzfol)object).zzd();
        zzfom zzfom2 = zzfom.zza;
        if (object3 != zzfom2 && (object3 = ((zzfol)object).zzd()) != (zzfom2 = zzfom.zzc)) {
            object = ((zzfol)object).zzi();
            super(string2, (Map)object, null);
            this.zze = object3;
        } else {
            object = ((zzfol)object).zza();
            this.zze = object2 = new zzfpt(string2, (WebView)object);
        }
        this.zze.zzn();
        zzfpe.zza().zzd(this);
        this.zze.zzf(zzfok2);
    }

    private final void zzk(View view) {
        zzfqv zzfqv2;
        this.zzd = zzfqv2 = new zzfqv(view);
    }

    public final void zzb(View view, zzfoq zzfoq2, String string2) {
        boolean bl2 = this.zzg;
        if (bl2) {
            return;
        }
        this.zzc.zzb(view, zzfoq2, "Ad overlay");
    }

    public final void zzc() {
        boolean bl2 = this.zzg;
        if (bl2) {
            return;
        }
        Object object = this.zzd;
        ((Reference)object).clear();
        bl2 = this.zzg;
        if (!bl2) {
            object = this.zzc;
            ((zzfpi)object).zzc();
        }
        this.zzg = true;
        this.zze.zze();
        zzfpe.zza().zze(this);
        this.zze.zzc();
        this.zze = null;
    }

    public final void zzd(View view) {
        Object object;
        boolean bl2 = this.zzg;
        if (!bl2 && (object = this.zzf()) != view) {
            boolean bl3;
            this.zzk(view);
            this.zze.zzb();
            object = zzfpe.zza().zzc();
            if (object != null && !(bl3 = object.isEmpty())) {
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    View view2;
                    Object object2 = (zzfon)object.next();
                    if (object2 == this || (view2 = ((zzfon)object2).zzf()) != view) continue;
                    object2 = ((zzfon)object2).zzd;
                    ((Reference)object2).clear();
                }
            }
        }
    }

    public final void zze() {
        boolean bl2 = this.zzf;
        if (bl2) {
            return;
        }
        this.zzf = true;
        zzfpe.zza().zzf(this);
        float f5 = zzfpm.zzb().zza();
        this.zze.zzl(f5);
        zzfps zzfps2 = this.zze;
        Object object = zzfpc.zza().zzb();
        zzfps2.zzg((Date)object);
        zzfps2 = this.zze;
        object = this.zza;
        zzfps2.zzi(this, (zzfol)object);
    }

    public final View zzf() {
        return (View)this.zzd.get();
    }

    public final zzfps zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzc.zza();
    }

    public final boolean zzj() {
        boolean bl2 = this.zzf;
        return bl2 && !(bl2 = this.zzg);
    }
}


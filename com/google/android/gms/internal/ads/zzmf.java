/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzlv;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zzmc;
import com.google.android.gms.internal.ads.zzmd;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzvg;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzzv;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzmf {
    private final zzpj zza;
    private final List zzb;
    private final IdentityHashMap zzc;
    private final Map zzd;
    private final zzme zze;
    private final HashMap zzf;
    private final Set zzg;
    private final zzmx zzh;
    private final zzfb zzi;
    private boolean zzj;
    private zzie zzk;
    private zzxi zzl;

    public zzmf(zzme cloneable, zzmx zzmx2, zzfb zzfb2, zzpj zzpj2) {
        this.zza = zzpj2;
        this.zze = cloneable;
        cloneable = new Cloneable(0);
        this.zzl = cloneable;
        this.zzc = cloneable = new Cloneable();
        this.zzd = cloneable;
        super();
        this.zzb = cloneable;
        this.zzh = zzmx2;
        this.zzi = zzfb2;
        super();
        this.zzf = cloneable;
        super();
        this.zzg = cloneable;
    }

    public static /* bridge */ /* synthetic */ zzfb zzd(zzmf zzmf2) {
        return zzmf2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzmx zze(zzmf zzmf2) {
        return zzmf2.zzh;
    }

    private final void zzr(int n3, int n4) {
        Object object;
        int n7;
        while (n3 < (n7 = (object = this.zzb).size())) {
            int n8;
            object = (zzmd)this.zzb.get(n3);
            ((zzmd)object).zzd = n8 = ((zzmd)object).zzd + n4;
            ++n3;
        }
    }

    private final void zzs(zzmd object) {
        Object object2 = this.zzf;
        if ((object = (zzmc)((HashMap)object2).get(object)) != null) {
            object2 = ((zzmc)object).zza;
            object = ((zzmc)object).zzb;
            object2.zzi((zzvp)object);
        }
    }

    private final void zzt() {
        boolean bl2;
        Iterator iterator = this.zzg.iterator();
        while (bl2 = iterator.hasNext()) {
            zzmd zzmd2 = (zzmd)iterator.next();
            List list = zzmd2.zzc;
            boolean bl3 = list.isEmpty();
            if (!bl3) continue;
            this.zzs(zzmd2);
            iterator.remove();
        }
    }

    private final void zzu(zzmd zzmd2) {
        Object object;
        boolean bl2 = zzmd2.zze;
        if (bl2 && (bl2 = (object = zzmd2.zzc).isEmpty())) {
            object = (zzmc)this.zzf.remove(zzmd2);
            object.getClass();
            Object object2 = ((zzmc)object).zzb;
            ((zzmc)object).zza.zzp((zzvp)object2);
            object2 = ((zzmc)object).zzc;
            zzvq zzvq2 = ((zzmc)object).zza;
            zzvq2.zzs((zzvy)object2);
            object2 = ((zzmc)object).zzc;
            ((zzmc)object).zza.zzr((zzsp)object2);
            object = this.zzg;
            object.remove(zzmd2);
        }
    }

    private final void zzv(zzmd object) {
        zzvj zzvj2 = ((zzmd)object).zza;
        zzlv zzlv2 = new zzlv(this);
        Object object2 = new zzmb(this, (zzmd)object);
        zzmc zzmc2 = new zzmc(zzvj2, zzlv2, (zzmb)object2);
        this.zzf.put(object, zzmc2);
        object = zzgd.zzy();
        zzmc2 = new Handler((Looper)object, null);
        zzvj2.zzh((Handler)zzmc2, (zzvy)object2);
        object = zzgd.zzy();
        zzmc2 = new Handler((Looper)object, null);
        zzvj2.zzg((Handler)zzmc2, (zzsp)object2);
        object = this.zzk;
        object2 = this.zza;
        zzvj2.zzm(zzlv2, (zzie)object, (zzpj)object2);
    }

    private final void zzw(int n3, int n4) {
        while ((n4 += -1) >= n3) {
            zzmd zzmd2 = (zzmd)this.zzb.remove(n4);
            Object object = this.zzd;
            Object object2 = zzmd2.zzb;
            object.remove(object2);
            object = zzmd2.zza.zzC();
            int n7 = -((zzdc)object).zzc();
            this.zzr(n4, n7);
            zzmd2.zze = true;
            n7 = (int)(this.zzj ? 1 : 0);
            if (n7 == 0) continue;
            this.zzu(zzmd2);
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzdc zzb() {
        List list = this.zzb;
        int n3 = list.isEmpty();
        if (n3 == 0) {
            Object object;
            int n4;
            list = null;
            int n7 = 0;
            zzml zzml2 = null;
            for (n3 = 0; n3 < (n4 = (object = this.zzb).size()); ++n3) {
                object = (zzmd)this.zzb.get(n3);
                ((zzmd)object).zzd = n7;
                object = ((zzmd)object).zza.zzC();
                n4 = ((zzdc)object).zzc();
                n7 += n4;
            }
            list = this.zzb;
            object = this.zzl;
            zzml2 = new zzml(list, (zzxi)object);
            return zzml2;
        }
        return zzdc.zza;
    }

    public final zzdc zzc(int n3, int n4, List list) {
        zzbu zzbu2;
        int n7;
        int n8 = 1;
        zzvj zzvj2 = null;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = this.zza())) {
            n7 = 1;
        } else {
            n7 = 0;
            zzbu2 = null;
        }
        zzeq.zzd(n7 != 0);
        n7 = list.size();
        int n10 = n4 - n3;
        if (n7 != n10) {
            n8 = 0;
        }
        zzeq.zzd(n8 != 0);
        for (n8 = n3; n8 < n4; ++n8) {
            zzvj2 = ((zzmd)this.zzb.get((int)n8)).zza;
            n7 = n8 - n3;
            zzbu2 = (zzbu)list.get(n7);
            zzvj2.zzt(zzbu2);
        }
        return this.zzb();
    }

    public final /* synthetic */ void zzf(zzvq zzvq2, zzdc zzdc2) {
        this.zze.zzh();
    }

    public final void zzg(zzie zzie2) {
        Object object;
        int n3 = this.zzj;
        int n4 = 1;
        zzeq.zzf((n3 ^= n4) != 0);
        this.zzk = zzie2;
        zzie2 = null;
        for (int i3 = 0; i3 < (n3 = (object = this.zzb).size()); ++i3) {
            object = (zzmd)this.zzb.get(i3);
            this.zzv((zzmd)object);
            Set set = this.zzg;
            set.add(object);
        }
        this.zzj = n4;
    }

    public final void zzh() {
        boolean bl2;
        Iterator iterator = this.zzf.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (zzmc)iterator.next();
            zzvq zzvq2 = ((zzmc)object).zza;
            Object object2 = ((zzmc)object).zzb;
            try {
                zzvq2.zzp((zzvp)object2);
            }
            catch (RuntimeException runtimeException) {
                object2 = "MediaSourceList";
                String string2 = "Failed to release child source.";
                zzfk.zzd((String)object2, string2, runtimeException);
            }
            zzvq2 = ((zzmc)object).zza;
            object2 = ((zzmc)object).zzc;
            zzvq2.zzs((zzvy)object2);
            zzvq2 = ((zzmc)object).zza;
            object = ((zzmc)object).zzc;
            zzvq2.zzr((zzsp)object);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzvm object) {
        zzmd zzmd2 = (zzmd)this.zzc.remove(object);
        zzmd2.getClass();
        zzmd2.zza.zzG((zzvm)object);
        object = ((zzvg)object).zza;
        List list = zzmd2.zzc;
        list.remove(object);
        object = this.zzc;
        boolean bl2 = ((IdentityHashMap)object).isEmpty();
        if (!bl2) {
            this.zzt();
        }
        this.zzu(zzmd2);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzdc zzk(int n3, List list, zzxi zzxi2) {
        int n4 = list.isEmpty();
        if (n4 == 0) {
            this.zzl = zzxi2;
            for (int i3 = n3; i3 < (n4 = list.size() + n3); ++i3) {
                int n7;
                Object object;
                Object object2;
                n4 = i3 - n3;
                zzmd zzmd2 = (zzmd)list.get(n4);
                if (i3 > 0) {
                    object2 = this.zzb;
                    int n8 = i3 + -1;
                    object2 = (zzmd)object2.get(n8);
                    object = ((zzmd)object2).zza.zzC();
                    n7 = ((zzmd)object2).zzd;
                    n8 = ((zzdc)object).zzc() + n7;
                    zzmd2.zzc(n8);
                } else {
                    n7 = 0;
                    object2 = null;
                    zzmd2.zzc(0);
                }
                n7 = zzmd2.zza.zzC().zzc();
                this.zzr(i3, n7);
                this.zzb.add(i3, zzmd2);
                object2 = this.zzd;
                object = zzmd2.zzb;
                object2.put(object, zzmd2);
                n7 = (int)(this.zzj ? 1 : 0);
                if (n7 == 0) continue;
                this.zzv(zzmd2);
                object2 = this.zzc;
                n7 = (int)(((IdentityHashMap)object2).isEmpty() ? 1 : 0);
                if (n7 != 0) {
                    object2 = this.zzg;
                    object2.add(zzmd2);
                    continue;
                }
                this.zzs(zzmd2);
            }
        }
        return this.zzb();
    }

    public final zzdc zzl(int n3, int n4, int n7, zzxi zzxi2) {
        n3 = this.zza();
        n3 = n3 >= 0 ? 1 : 0;
        zzeq.zzd(n3 != 0);
        this.zzl = null;
        return this.zzb();
    }

    public final zzdc zzm(int n3, int n4, zzxi zzxi2) {
        int n7;
        boolean bl2 = false;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = this.zza())) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zzl = zzxi2;
        this.zzw(n3, n4);
        return this.zzb();
    }

    public final zzdc zzn(List list, zzxi zzxi2) {
        int n3 = this.zzb.size();
        this.zzw(0, n3);
        n3 = this.zzb.size();
        return this.zzk(n3, list, zzxi2);
    }

    public final zzdc zzo(zzxi zzxi2) {
        int n3 = this.zza();
        int n4 = zzxi2.zzc();
        if (n4 != n3) {
            zzxi2 = zzxi2.zzf();
            n4 = 0;
            zzxi2 = zzxi2.zzg(0, n3);
        }
        this.zzl = zzxi2;
        return this.zzb();
    }

    public final zzvm zzp(zzvo object, zzzv zzzv2, long l2) {
        Object object2;
        Object object3 = object2 = ((zzvo)object).zza;
        object3 = ((Pair)object2).first;
        object2 = ((Pair)object2).second;
        object = ((zzvo)object).zza(object2);
        object2 = (zzmd)this.zzd.get(object3);
        object2.getClass();
        this.zzg.add(object2);
        object3 = (zzmc)this.zzf.get(object2);
        if (object3 != null) {
            zzvq zzvq2 = ((zzmc)object3).zza;
            object3 = ((zzmc)object3).zzb;
            zzvq2.zzk((zzvp)object3);
        }
        ((zzmd)object2).zzc.add(object);
        object = ((zzmd)object2).zza.zzH((zzvo)object, zzzv2, l2);
        this.zzc.put(object, object2);
        this.zzt();
        return object;
    }

    public final zzxi zzq() {
        return this.zzl;
    }
}


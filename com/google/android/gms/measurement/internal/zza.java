/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzc;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.Map;

public final class zza
extends zzg {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zza(zzic object) {
        super((zzic)object);
        this.zzb = object = new Jp();
        this.zza = object = new Jp();
    }

    private final void zza(long l2, zzlw object) {
        if (object == null) {
            this.zzj().zzq().zza("Not logging ad exposure. No active activity");
            return;
        }
        long l3 = 1000L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 < 0) {
            object = this.zzj().zzq();
            Long l7 = l2;
            ((zzgq)object).zza("Not logging ad exposure. Less than 1000 ms. exposure", l7);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", l2);
        zzpn.zza((zzlw)object, bundle, true);
        this.zzm().zzc("am", "_xa", bundle);
    }

    public static /* synthetic */ void zza(zza zza2, long l2) {
        zza2.zzb(l2);
    }

    public static /* synthetic */ void zza(zza object, String string2, long l2) {
        int n3;
        ((zza)object).zzv();
        Preconditions.checkNotEmpty(string2);
        Object object2 = ((zza)object).zzb;
        int n4 = object2.isEmpty();
        if (n4 != 0) {
            ((zza)object).zzc = l2;
        }
        object2 = (Integer)((zza)object).zzb.get(string2);
        int n7 = 1;
        if (object2 != null) {
            object = ((zza)object).zzb;
            Integer n8 = (Integer)object2 + n7;
            object.put(string2, n8);
            return;
        }
        object2 = ((zza)object).zzb;
        n4 = object2.size();
        if (n4 >= (n3 = 100)) {
            ((zza)object).zzj().zzr().zza("Too many ads visible");
            return;
        }
        object2 = ((zza)object).zzb;
        Integer n10 = n7;
        object2.put(string2, n10);
        object = ((zza)object).zza;
        Long l3 = l2;
        object.put(string2, l3);
    }

    private final void zza(String object, long l2, zzlw zzlw2) {
        if (zzlw2 == null) {
            this.zzj().zzq().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        long l3 = 1000L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 < 0) {
            object = this.zzj().zzq();
            Long l7 = l2;
            ((zzgq)object).zza("Not logging ad unit exposure. Less than 1000 ms. exposure", l7);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", (String)object);
        bundle.putLong("_xt", l2);
        zzpn.zza(zzlw2, bundle, true);
        this.zzm().zzc("am", "_xu", bundle);
    }

    private final void zzb(long l2) {
        boolean bl2;
        Object object = this.zza.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Map map2 = this.zza;
            Long l3 = l2;
            map2.put(string2, l3);
        }
        object = this.zza;
        boolean bl3 = object.isEmpty();
        if (!bl3) {
            this.zzc = l2;
        }
    }

    public static /* synthetic */ void zzb(zza object, String object2, long l2) {
        ((zza)object).zzv();
        Preconditions.checkNotEmpty((String)object2);
        Object object3 = (Integer)((zza)object).zzb.get(object2);
        if (object3 != null) {
            zzlw zzlw2 = ((zza)object).zzp().zza(false);
            int n3 = (Integer)object3 + -1;
            if (n3 == 0) {
                long l3;
                ((zza)object).zzb.remove(object2);
                object3 = (Long)((zza)object).zza.get(object2);
                if (object3 == null) {
                    object2 = ((zza)object).zzj().zzg();
                    object3 = "First ad unit exposure time was never set";
                    ((zzgq)object2).zza((String)object3);
                } else {
                    l3 = (Long)object3;
                    l3 = l2 - l3;
                    object3 = ((zza)object).zza;
                    object3.remove(object2);
                    super.zza((String)object2, l3, zzlw2);
                }
                object2 = ((zza)object).zzb;
                Object object4 = object2.isEmpty();
                if (object4) {
                    l3 = ((zza)object).zzc;
                    long l4 = 0L;
                    long l7 = l3 - l4;
                    object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (!object4) {
                        ((zza)object).zzj().zzg().zza("First ad exposure time was never set");
                        return;
                    }
                    super.zza(l2 -= l3, zzlw2);
                    ((zza)object).zzc = l4;
                }
                return;
            }
            object = ((zza)object).zzb;
            Integer n4 = n3;
            object.put(object2, n4);
            return;
        }
        ((zza)object).zzj().zzg().zza("Call to endAdUnitExposure for unknown ad unit id", object2);
    }

    public final void zza(long l2) {
        boolean bl2;
        Object object = this.zzp();
        boolean bl3 = false;
        object = ((zzlz)object).zza(false);
        Object object2 = this.zza.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            String string2 = (String)object2.next();
            Long l3 = (Long)this.zza.get(string2);
            long l4 = l3;
            l4 = l2 - l4;
            this.zza(string2, l4, (zzlw)object);
        }
        object2 = this.zza;
        bl3 = object2.isEmpty();
        if (!bl3) {
            long l7 = this.zzc;
            l7 = l2 - l7;
            this.zza(l7, (zzlw)object);
        }
        this.zzb(l2);
    }

    public final void zza(String string2, long l2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            zzhv zzhv2 = this.zzl();
            zzc zzc2 = new zzc(this, string2, l2);
            zzhv2.zzb(zzc2);
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
    }

    public final void zzb(String string2, long l2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            zzhv zzhv2 = this.zzl();
            zzb zzb2 = new zzb(this, string2, l2);
            zzhv2.zzb(zzb2);
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzox;
import com.google.android.gms.internal.gtm.zzpb;
import com.google.android.gms.internal.gtm.zzpc;
import com.google.android.gms.internal.gtm.zzpd;
import com.google.android.gms.internal.gtm.zzpf;
import com.google.android.gms.internal.gtm.zzpi;
import com.google.android.gms.internal.gtm.zzpj;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzpq;
import com.google.android.gms.internal.gtm.zzpv;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzpe {
    final Map zza;
    private final Context zzb;
    private final zzpq zzc;
    private final Clock zzd;
    private final Map zze;

    public zzpe(Context context) {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        zzpq zzpq2 = new zzpq(context);
        Clock clock = DefaultClock.getInstance();
        this.zza = hashMap = new HashMap();
        this.zzb = context = context.getApplicationContext();
        this.zzd = clock;
        this.zzc = zzpq2;
        this.zze = hashMap2;
    }

    public static /* bridge */ /* synthetic */ zzpq zza(zzpe zzpe2) {
        return zzpe2.zzc;
    }

    public final void zzb(zzpj zzpj2, List list, int n3, zzpb zzpb2, zzgo zzgo2) {
        zzpc zzpc2;
        Object object;
        int n4;
        Object object2;
        int n7;
        zzpe zzpe2 = this;
        Object object3 = list;
        if (n3 == 0) {
            zzhi.zzd("Starting to fetch a new resource");
            n7 = 0;
            object2 = null;
            n4 = 0;
        } else {
            n4 = n3;
        }
        n7 = list.size();
        if (n4 >= n7) {
            object2 = String.valueOf(zzpj2.zza().zzb());
            object2 = "There is no valid resource for the container: ".concat((String)object2);
            zzhi.zzd((String)object2);
            Status status = new Status(16, (String)object2);
            n7 = (Integer)object3.get(n4 += -1);
            zzpl zzpl2 = new zzpl(status, n7, null, null);
            zzpb2.zza(zzpl2);
            return;
        }
        object2 = (Integer)object3.get(n4);
        n7 = (Integer)object2;
        int n8 = 1;
        Object object4 = "Attempting to fetch container ";
        if (n7 != 0) {
            zzpc zzpc3;
            if (n7 != n8) {
                n8 = 2;
                if (n7 == n8) {
                    zzpc zzpc4;
                    object2 = zzpj2.zza();
                    Object object5 = ((zzox)object2).zzb();
                    Object object6 = new StringBuilder((String)object4);
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append(" from the default resource");
                    zzhi.zzd(((StringBuilder)object6).toString());
                    zzpq zzpq2 = zzpe2.zzc;
                    String string2 = ((zzox)object2).zzd();
                    String string3 = ((zzox)object2).zzc();
                    zzpf zzpf2 = zzpi.zza;
                    object2 = zzpc4;
                    object5 = this;
                    object6 = zzpj2;
                    object3 = list;
                    zzpc4 = new zzpc(this, 2, zzpj2, zzpf2, list, n4, zzpb2, null);
                    zzpq2.zzc(string2, string3, zzpc4);
                    return;
                }
                String string4 = hj0_0.a(n4, "Unknown fetching source: ");
                object2 = new UnsupportedOperationException(string4);
                throw object2;
            }
            object2 = zzpj2.zza();
            Object object7 = ((zzox)object2).zzb();
            Object object8 = new StringBuilder((String)object4);
            ((StringBuilder)object8).append((String)object7);
            ((StringBuilder)object8).append(" from a saved resource");
            zzhi.zzd(((StringBuilder)object8).toString());
            zzpq zzpq3 = zzpe2.zzc;
            String string5 = ((zzox)object2).zzd();
            zzpf zzpf3 = zzpi.zza;
            object2 = zzpc3;
            object7 = this;
            object8 = zzpj2;
            object3 = list;
            zzpc3 = new zzpc(this, 1, zzpj2, zzpf3, list, n4, zzpb2, null);
            zzpq3.zze(string5, zzpc3);
            return;
        }
        object2 = zzpj2.zza();
        Object object9 = zzpe2.zza;
        Object object10 = ((zzox)object2).zzb();
        object9 = (zzpd)object9.get(object10);
        object10 = zzpj2.zza();
        boolean bl2 = ((zzox)object10).zzg();
        if (!bl2) {
            long l2;
            if (object9 != null) {
                l2 = ((zzpd)object9).zza();
            } else {
                object9 = zzpe2.zzc;
                object10 = ((zzox)object2).zzb();
                l2 = ((zzpq)object9).zza((String)object10);
            }
            object = zzpe2.zzd;
            long l3 = object.currentTimeMillis();
            long l4 = (l2 += 900000L) - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 >= 0) {
                int n10 = n4 + 1;
                object2 = this;
                zzpj zzpj3 = zzpj2;
                object4 = list;
                object10 = zzpb2;
                object3 = zzgo2;
                this.zzb(zzpj2, list, n10, zzpb2, zzgo2);
                return;
            }
        }
        Object object11 = zzpe2.zze;
        object9 = zzpj2.zzc();
        if ((object11 = (zzpv)object11.get(object9)) == null) {
            object11 = new zzpv();
            object9 = zzpe2.zze;
            object10 = zzpj2.zzc();
            object9.put(object10, object11);
        }
        Object object12 = object11;
        object2 = ((zzox)object2).zzb();
        object11 = new StringBuilder((String)object4);
        ((StringBuilder)object11).append((String)object2);
        ((StringBuilder)object11).append(" from network");
        zzhi.zzd(((StringBuilder)object11).toString());
        Context context = zzpe2.zzb;
        object10 = zzpi.zza;
        object2 = zzpc2;
        object11 = this;
        object9 = zzpj2;
        object3 = list;
        object = zzgo2;
        zzpc2 = new zzpc(this, 0, zzpj2, (zzpf)object10, list, n4, zzpb2, zzgo2);
        zzpj zzpj4 = zzpj2;
        ((zzpv)object12).zza(context, zzpj2, 0L, zzpc2);
    }

    public final void zzc(String string2, String string3, String string4, List list, zzpb zzpb2, zzgo zzgo2) {
        zzox zzox2;
        boolean bl2;
        boolean bl3 = list.isEmpty();
        boolean bl4 = true;
        Preconditions.checkArgument(bl3 ^= bl4);
        zzpj zzpj2 = new zzpj();
        Object object = zzhp.zza();
        boolean bl5 = ((zzhp)object).zzd();
        boolean bl6 = bl5 && (bl2 = string2.equals(object = ((zzhp)object).zzc()));
        String string5 = zzhp.zza().zzb();
        Object object2 = zzox2;
        zzox2 = new zzox(string2, string3, string4, bl6, string5, "");
        zzpj2.zzb(zzox2);
        object2 = Collections.unmodifiableList(list);
        object = this;
        this.zzb(zzpj2, (List)object2, 0, zzpb2, zzgo2);
    }

    public final void zzd(Status object, zzpk object2) {
        String string2 = ((zzpk)object2).zzb().zzb();
        object2 = ((zzpk)object2).zzc();
        Map map2 = this.zza;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            object = (zzpd)this.zza.get(string2);
            long l2 = this.zzd.currentTimeMillis();
            ((zzpd)object).zzb(l2);
            object = Status.RESULT_SUCCESS_CACHE;
            return;
        }
        map2 = this.zza;
        Clock clock = this.zzd;
        long l3 = clock.currentTimeMillis();
        zzpd zzpd2 = new zzpd((Status)object, object2, l3);
        map2.put(string2, zzpd2);
    }
}


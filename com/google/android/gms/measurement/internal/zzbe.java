/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpn;

public final class zzbe {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbg zzf;

    public zzbe(zzic object, String object2, String iterator, String object3, long l2, long l3, Bundle bundle) {
        Object object4;
        Preconditions.checkNotEmpty((String)((Object)iterator));
        Preconditions.checkNotEmpty((String)object3);
        this.zza = iterator;
        this.zzb = object3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            object4 = 0;
            object2 = null;
        }
        this.zzc = object2;
        this.zzd = l2;
        this.zze = l3;
        long l4 = 0L;
        long l7 = l3 - l4;
        object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object4 != 0 && (object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0) {
            object2 = ((zzic)object).zzj().zzr();
            object3 = "Event created with reverse previous/current timestamps. appId";
            iterator = zzgo.zza((String)((Object)iterator));
            ((zzgq)object2).zza((String)object3, iterator);
        }
        if (bundle != null && (object4 = bundle.isEmpty()) == 0) {
            object2 = new Bundle(bundle);
            iterator = object2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object5;
                object3 = (String)iterator.next();
                if (object3 == null) {
                    object3 = ((zzic)object).zzj().zzg();
                    object5 = "Param name can't be null";
                    ((zzgq)object3).zza((String)object5);
                    iterator.remove();
                    continue;
                }
                object5 = ((zzic)object).zzv();
                Object object6 = object2.get((String)object3);
                if ((object5 = ((zzpn)object5).zzb((String)object3, object6)) == null) {
                    object5 = ((zzic)object).zzj().zzr();
                    object3 = ((zzic)object).zzk().zzb((String)object3);
                    object6 = "Param value can't be null";
                    ((zzgq)object5).zza((String)object6, object3);
                    iterator.remove();
                    continue;
                }
                object6 = ((zzic)object).zzv();
                ((zzpn)object6).zza((Bundle)object2, (String)object3, object5);
            }
            object = new zzbg((Bundle)object2);
        } else {
            object = new zzbg((Bundle)object2);
        }
        this.zzf = object;
    }

    private zzbe(zzic object, String object2, String object3, String string2, long l2, long l3, zzbg zzbg2) {
        Object object4;
        Preconditions.checkNotEmpty((String)object3);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(zzbg2);
        this.zza = object3;
        this.zzb = string2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            object4 = 0;
            object2 = null;
        }
        this.zzc = object2;
        this.zzd = l2;
        this.zze = l3;
        long l4 = 0L;
        long l7 = l3 - l4;
        object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object4 != 0 && (object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0) {
            object = ((zzic)object).zzj().zzr();
            object2 = zzgo.zza((String)object3);
            object3 = zzgo.zza(string2);
            string2 = "Event created with reverse previous/current timestamps. appId, name";
            ((zzgq)object).zza(string2, object2, object3);
        }
        this.zzf = zzbg2;
    }

    public final String toString() {
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = String.valueOf(this.zzf);
        return h30_0.a(og_1.a("Event{appId='", string2, "', name='", string3, "', params="), string4, "}");
    }

    public final zzbe zza(zzic zzic2, long l2) {
        String string2 = this.zzc;
        String string3 = this.zza;
        String string4 = this.zzb;
        long l3 = this.zzd;
        zzbg zzbg2 = this.zzf;
        zzbe zzbe2 = new zzbe(zzic2, string2, string3, string4, l3, l2, zzbg2);
        return zzbe2;
    }
}


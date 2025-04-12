/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzeey;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzefe;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflu;

public final class zzefh
implements zzflu {
    private final zzeev zza;
    private final zzeez zzb;

    public zzefh(zzeev zzeev2, zzeez zzeez2) {
        this.zza = zzeev2;
        this.zzb = zzeez2;
    }

    public final void zzd(zzfln object, String object2) {
        long l2;
        long l3;
        long l4;
        long l7;
        object2 = zzbep.zzgs;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && (object2 = zzfln.zzd) == object && (l7 = (l4 = (l3 = ((zzeev)(object = this.zza)).zzc()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            object = this.zza;
            l2 = zzu.zzB().elapsedRealtime();
            object2 = this.zza;
            long l8 = ((zzeev)object2).zzc();
            ((zzeev)object).zzf(l2 -= l8);
        }
    }

    public final void zzdC(zzfln zzfln2, String string2) {
    }

    public final void zzdD(zzfln object, String object2, Throwable object3) {
        long l2;
        long l3;
        long l4;
        long l7;
        object2 = zzbep.zzgs;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && (object2 = zzfln.zzd) == object && (l7 = (l4 = (l3 = ((zzeev)(object = this.zza)).zzc()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            object = this.zza;
            object2 = zzu.zzB();
            long l8 = object2.elapsedRealtime();
            zzeev zzeev2 = this.zza;
            l2 = zzeev2.zzc();
            ((zzeev)object).zzf(l8 -= l2);
        }
    }

    public final void zzdE(zzfln object, String object2) {
        block5: {
            block4: {
                object2 = zzbep.zzgs;
                zzben zzben2 = zzba.zzc();
                object2 = (Boolean)zzben2.zza((zzbeg)object2);
                boolean bl2 = (Boolean)object2;
                if (!bl2) break block4;
                object2 = zzfln.zzd;
                if (object2 == object) {
                    object = this.zza;
                    long l2 = zzu.zzB().elapsedRealtime();
                    ((zzeev)object).zzg(l2);
                    return;
                }
                object2 = zzfln.zzA;
                if (object2 == object || (object2 = zzfln.zzc) == object) break block5;
            }
            return;
        }
        object = this.zza;
        long l3 = zzu.zzB().elapsedRealtime();
        ((zzeev)object).zzh(l3);
        object = this.zzb;
        l3 = this.zza.zzd();
        object2 = new zzeey((zzeez)object, l3);
        ((zzefe)object).zza.zza((zzfkw)object2);
    }
}


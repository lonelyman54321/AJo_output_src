/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzcuu;
import com.google.android.gms.internal.ads.zzcuv;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzehm;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Map;

final class zzdjw
implements zzcus {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhlg zzd;
    private final zzdme zze;

    public zzdjw(Map map2, Map map3, Map map4, zzhlg zzhlg2, zzdme zzdme2) {
        this.zza = map2;
        this.zzb = map3;
        this.zzc = map4;
        this.zzd = zzhlg2;
        this.zze = zzdme2;
    }

    public final zzehl zza(int n3, String object) {
        zzehl zzehl2;
        Object object2;
        block8: {
            block5: {
                zzehm zzehm2;
                block7: {
                    block6: {
                        object2 = (zzehl)this.zza.get(object);
                        if (object2 != null) {
                            return object2;
                        }
                        int n4 = 1;
                        zzehm2 = null;
                        if (n3 == n4) break block5;
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
                        }
                        zzehl2 = (zzejz)this.zzc.get(object);
                        if (zzehl2 == null) break block6;
                        object = new zzcuu();
                        zzehm2 = new zzehm(zzehl2, (zzfxu)object);
                        break block7;
                    }
                    zzehl2 = (zzehl)this.zzb.get(object);
                    if (zzehl2 != null) break block8;
                }
                return zzehm2;
            }
            object2 = this.zze.zze();
            if (object2 == null || (zzehl2 = (object2 = (zzcus)this.zzd.zzb()).zza(n3, (String)object)) == null) {
                return null;
            }
        }
        object2 = new zzcuv();
        object = new zzehm(zzehl2, (zzfxu)object2);
        return object;
    }
}


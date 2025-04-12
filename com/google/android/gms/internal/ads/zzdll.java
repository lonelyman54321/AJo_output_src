/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdlo;
import java.util.Map;

final class zzdll
implements zzban {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdlo zzb;

    public zzdll(zzdlo zzdlo2, String string2) {
        this.zza = string2;
        this.zzb = zzdlo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdp(zzbam object) {
        Object object2 = zzbep.zzbK;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        boolean bl3 = true;
        if (bl2) {
            synchronized (this) {
                Throwable throwable2;
                block7: {
                    block6: {
                        try {
                            boolean bl4 = ((zzbam)object).zzj;
                            if (!bl4) break block6;
                            object = this.zzb;
                            object2 = zzdlo.zze((zzdlo)object);
                            if (object2 == null) {
                                return;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        object = zzdlo.zzh((zzdlo)object);
                        object2 = this.zza;
                        Object object3 = Boolean.TRUE;
                        object.put(object2, object3);
                        object = this.zzb;
                        object2 = zzdlo.zze((zzdlo)object);
                        object2 = object2.zzf();
                        object3 = this.zzb;
                        object3 = zzdlo.zze((zzdlo)object3);
                        object3 = object3.zzl();
                        Object object4 = this.zzb;
                        object4 = zzdlo.zze((zzdlo)object4);
                        object4 = object4.zzm();
                        ((zzdlo)object).zzB((View)object2, (Map)object3, (Map)object4, bl3);
                    }
                    return;
                }
                throw throwable2;
            }
        }
        boolean bl5 = ((zzbam)object).zzj;
        if (bl5) {
            object = this.zzb;
            object2 = this.zza;
            object = zzdlo.zzh((zzdlo)object);
            Object object5 = Boolean.TRUE;
            object.put(object2, object5);
            object = this.zzb;
            object2 = zzdlo.zze((zzdlo)object).zzf();
            object5 = zzdlo.zze(this.zzb).zzl();
            Map map2 = zzdlo.zze(this.zzb).zzm();
            ((zzdlo)object).zzB((View)object2, (Map)object5, map2, bl3);
        }
    }
}


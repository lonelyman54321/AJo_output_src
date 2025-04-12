/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzfgt;

final class zzejq
implements zzdjp {
    private final zzfgt zza;
    private final zzbte zzb;
    private final AdFormat zzc;
    private zzdad zzd = null;

    public zzejq(zzfgt zzfgt2, zzbte zzbte2, AdFormat adFormat) {
        this.zza = zzfgt2;
        this.zzb = zzbte2;
        this.zzc = adFormat;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(boolean n3, Context object, zzczy zzczy2) {
        Throwable throwable2;
        block8: {
            Object object2;
            block6: {
                int n4;
                block7: {
                    block4: {
                        block5: {
                            try {
                                object2 = AdFormat.BANNER;
                                object2 = this.zzc;
                                n3 = ((Enum)object2).ordinal();
                                int n7 = 1;
                                n4 = 2;
                                if (n3 == n7) break block4;
                                if (n3 == n4) break block5;
                                n7 = 5;
                                if (n3 != n7) break block6;
                                object2 = this.zzb;
                                object = ObjectWrapper.wrap(object);
                                n3 = (int)(object2.zzr((IObjectWrapper)object) ? 1 : 0);
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        object2 = this.zzb;
                        object = ObjectWrapper.wrap(object);
                        n3 = (int)(object2.zzt((IObjectWrapper)object) ? 1 : 0);
                        break block7;
                    }
                    object2 = this.zzb;
                    object = ObjectWrapper.wrap(object);
                    n3 = (int)(object2.zzs((IObjectWrapper)object) ? 1 : 0);
                }
                if (n3 != 0) {
                    object2 = this.zzd;
                    if (object2 == null) {
                        return;
                    }
                    object2 = zzbep.zzbx;
                    object = zzba.zzc();
                    object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
                    n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    if (n3 != 0) return;
                    object2 = this.zza;
                    n3 = ((zzfgt)object2).zzZ;
                    if (n3 != n4) return;
                    object2 = this.zzd;
                    ((zzdad)object2).zza();
                    return;
                }
            }
            object2 = new zzdjo("Adapter failed to show.");
            throw object2;
        }
        object = new zzdjo(throwable2);
        throw object;
    }

    public final void zzb(zzdad zzdad2) {
        this.zzd = zzdad2;
    }
}


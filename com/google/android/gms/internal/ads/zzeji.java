/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdau;
import com.google.android.gms.internal.ads.zzdav;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdhr;
import com.google.android.gms.internal.ads.zzdht;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzemm;
import com.google.android.gms.internal.ads.zzemn;
import com.google.android.gms.internal.ads.zzemo;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzeji
extends zzbyr
implements zzdav {
    private zzbys zza;
    private zzdau zzb;
    private zzdht zzc;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzdau zzdau2) {
        synchronized (this) {
            this.zzb = zzdau2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzbys zzbys2) {
        synchronized (this) {
            this.zza = zzbys2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzdht zzdht2) {
        synchronized (this) {
            this.zzc = zzdht2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zzb;
                        ((zzczj)object).onAdClicked();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(IObjectWrapper iObjectWrapper) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzbys zzbys2 = this.zza;
                    if (zzbys2 != null) {
                        zzbys2.zzf(iObjectWrapper);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(IObjectWrapper object, int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zzb;
                    if (object != null) {
                        object.zza(n3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zzc;
                        ((zzdas)object).zzb();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zzb;
                    if (object != null) {
                        object.zzd();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zza;
                        ((zzdbr)object).zzdr();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(IObjectWrapper object, int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zzc;
                    if (object != null) {
                        object = (zzemm)object;
                        object = ((zzemm)object).zzc;
                        object = ((zzeho)object).zza;
                        String string2 = "Fail to initialize adapter ";
                        object = String.valueOf(object);
                        object = string2.concat((String)object);
                        zzm.zzj((String)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zzc;
                    if (object != null) {
                        Object object2 = object;
                        object2 = (zzemm)object;
                        object2 = ((zzemm)object2).zzd;
                        object2 = zzemo.zzc((zzemo)object2);
                        Object object3 = object;
                        object3 = (zzemm)object;
                        object3 = ((zzemm)object3).zzc;
                        Object object4 = object;
                        object4 = (zzemm)object;
                        object4 = ((zzemm)object4).zzb;
                        Object object5 = object;
                        object5 = (zzemm)object;
                        object5 = ((zzemm)object5).zza;
                        object = (zzemm)object;
                        zzeml zzeml2 = new zzeml((zzemm)object, (zzfhf)object5, (zzfgt)object4, (zzeho)object3);
                        object2.execute(zzeml2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(IObjectWrapper object, zzbyt zzbyt2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zzd;
                        ((zzdhr)object).zza(zzbyt2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zzc;
                        ((zzdas)object).zze();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zza;
                    if (object != null) {
                        object = (zzemn)object;
                        object = ((zzemn)object).zzd;
                        ((zzdhr)object).zzc();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdau;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzemx;

final class zzemw
implements zzdau {
    boolean zza = false;
    final /* synthetic */ zzeho zzb;
    final /* synthetic */ zzccn zzc;
    final /* synthetic */ zzemx zzd;

    public zzemw(zzemx zzemx2, zzeho zzeho2, zzccn zzccn2) {
        this.zzb = zzeho2;
        this.zzc = zzccn2;
        this.zzd = zzemx2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(zze object) {
        synchronized (this) {
            Object object2 = zzbep.zzfA;
            zzben zzben2 = zzba.zzc();
            object2 = zzben2.zza((zzbeg)object2);
            object2 = (Boolean)object2;
            int n3 = ((Boolean)object2).booleanValue();
            int n4 = 1;
            if (n4 == n3) {
                n4 = 3;
            }
            object2 = new zzehp(n4, (zze)object);
            object = this.zzc;
            ((zzccn)object).zzd((Throwable)object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(int n3) {
        synchronized (this) {
            boolean bl2 = this.zza;
            if (bl2) {
                return;
            }
            this.zza = bl2 = true;
            Object object = this.zzb;
            object = ((zzeho)object).zza;
            String string2 = zzemx.zze((String)object, n3);
            String string3 = "undefined";
            object = new zze(n3, string2, string3, null, null);
            this.zze((zze)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zze zze2) {
        synchronized (this) {
            boolean bl2 = this.zza;
            if (bl2) {
                return;
            }
            this.zza = bl2 = true;
            this.zze(zze2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(int n3, String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    try {
                        bl2 = this.zza;
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                bl2 = true;
                this.zza = bl2;
                if (object == null) {
                    object = this.zzb;
                    object = ((zzeho)object).zza;
                    object = zzemx.zze((String)object, n3);
                }
                String string2 = object;
                String string3 = "undefined";
                object = new zze(n3, string2, string3, null, null);
                this.zze((zze)object);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        synchronized (this) {
            zzccn zzccn2 = this.zzc;
            zzccn2.zzc(null);
            return;
        }
    }
}


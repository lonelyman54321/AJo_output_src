/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdns;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.List;

final class zzdnr
implements zzgfp {
    final /* synthetic */ zzdns zza;

    public zzdnr(zzdns zzdns2) {
        this.zza = zzdns2;
    }

    public final void zza(Throwable throwable) {
        Object object = zzbep.zzfj;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = "omid native display exp";
            object2 = zzu.zzo();
            ((zzcby)object2).zzw(throwable, (String)object);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zzc(List object) {
        block7: {
            boolean bl2 = false;
            Object object2 = null;
            object = object.get(0);
            object = (zzchd)object;
            if (object == null) break block7;
            object2 = this.zza;
            try {
                zzdns.zza((zzdns)object2, (zzchd)object);
                return;
            }
            catch (ClassCastException classCastException) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                // empty catch block
            }
            object2 = zzbep.zzfj;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                void var1_4;
                object2 = "omid native display exp";
                object3 = zzu.zzo();
                ((zzcby)object3).zzw((Throwable)var1_4, (String)object2);
            }
        }
    }
}


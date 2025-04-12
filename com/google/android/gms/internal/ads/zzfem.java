/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfdq;
import com.google.android.gms.internal.ads.zzfdw;
import com.google.android.gms.internal.ads.zzfdz;
import com.google.android.gms.internal.ads.zzfea;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjp;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzfem
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzfem(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final zzfek zza() {
        void var9_16;
        Context context = (Context)this.zza.zzb();
        Object object = (zzfiy)this.zzb.zzb();
        Object object2 = (zzfjq)this.zzc.zzb();
        Object object3 = zzbep.zzgA;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        int n3 = ((Boolean)object3).booleanValue();
        object3 = n3 != 0 ? zzu.zzo().zzi().zzh() : zzu.zzo().zzi().zzi();
        boolean bl2 = false;
        Object var5_8 = null;
        if (object3 != null && (n3 = ((zzcbs)object3).zzh()) != 0) {
            bl2 = true;
        }
        object3 = zzbep.zzgQ;
        Object object4 = zzba.zzc();
        object3 = (Integer)((zzben)object4).zza((zzbeg)object3);
        n3 = (Integer)object3;
        if (n3 > 0) {
            object3 = zzbep.zzgz;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
            if (n3 == 0 || bl2) {
                zzfdq zzfdq2;
                object3 = new zzfdl();
                zzfjg zzfjg2 = zzfjg.zzc;
                object4 = new zzfdo((zzfek)object3);
                zzfjp zzfjp2 = ((zzfjq)object2).zza(zzfjg2, context, (zzfiy)object, (zzfjw)object4);
                object = new zzfdz();
                object2 = new zzfea((zzfek)object);
                object = zzfjp2.zza;
                zzgge zzgge2 = zzcci.zza;
                object3 = new zzfdw((zzfjc)object, zzgge2);
                zzfjy zzfjy2 = zzfjp2.zzb;
                zzfjj zzfjj2 = zzfjp2.zza.zza();
                object4 = zzfjj2.zzf;
                object = zzfdq2;
                zzfdq2 = new zzfdq((zzfek)object2, (zzfek)object3, zzfjy2, (String)object4, zzgge2);
                return var9_16;
            }
        }
        zzfdz zzfdz2 = new zzfdz();
        return var9_16;
    }
}


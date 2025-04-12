/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzaur;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzhbi;
import java.lang.reflect.Method;

public final class zzazp
extends zzazs {
    private final View zzi;

    public zzazp(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, View view) {
        super(zzaye2, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", zzatp2, n3, 57);
        this.zzi = view;
    }

    public final void zza() {
        Object object = this.zzi;
        if (object != null) {
            boolean bl2;
            object = zzbep.zzds;
            object = (Boolean)zzba.zzc().zza((zzbeg)object);
            Object object2 = zzbep.zzkU;
            object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
            Object object3 = this.zzb.zzb().getResources().getDisplayMetrics();
            Object object4 = this.zzf;
            Object object5 = this.zzi;
            int n3 = 4;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object5;
            int n4 = 1;
            objectArray[n4] = object3;
            objectArray[2] = object;
            int n7 = 3;
            objectArray[n7] = object2;
            object3 = (String)((Method)object4).invoke(null, objectArray);
            object4 = new zzayi((String)object3);
            object3 = zzaur.zza();
            long l2 = ((zzayi)object4).zza;
            ((zzauq)object3).zzb(l2);
            l2 = ((zzayi)object4).zzb;
            ((zzauq)object3).zzd(l2);
            object5 = ((zzayi)object4).zzc;
            l2 = (Long)object5;
            ((zzauq)object3).zze(l2);
            boolean bl3 = (Boolean)object2;
            if (bl3) {
                object2 = ((zzayi)object4).zze;
                l2 = (Long)object2;
                ((zzauq)object3).zzc(l2);
            }
            if (bl2 = ((Boolean)object).booleanValue()) {
                object = ((zzayi)object4).zzd;
                long l3 = (Long)object;
                ((zzauq)object3).zza(l3);
            }
            object = this.zze;
            object2 = (zzaur)((zzhbi)object3).zzbn();
            ((zzatp)object).zzaf((zzaur)object2);
        }
    }
}


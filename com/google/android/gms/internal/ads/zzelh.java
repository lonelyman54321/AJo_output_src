/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfig;

public final class zzelh {
    private final zzfig zza;
    private final zzdsq zzb;
    private final zzdvc zzc;

    public zzelh(zzfig zzfig2, zzdsq zzdsq2, zzdvc zzdvc2) {
        this.zza = zzfig2;
        this.zzb = zzdsq2;
        this.zzc = zzdvc2;
    }

    public final void zza(zzfgw object, zzfgt object2, int n3, zzehp zzehp2, long l2) {
        Object object3;
        zzdvb zzdvb2;
        block6: {
            zzdvb2 = this.zzc.zza();
            zzdvb2.zzd((zzfgw)object);
            zzdvb2.zzc((zzfgt)object2);
            String string2 = "adapter_status";
            zzdvb2.zzb("action", string2);
            String string3 = String.valueOf(l2);
            zzdvb2.zzb("adapter_l", string3);
            object = "sc";
            object3 = Integer.toString(n3);
            zzdvb2.zzb((String)object, (String)object3);
            if (zzehp2 != null) {
                int n4 = zzehp2.zzb().zza;
                object = Integer.toString(n4);
                zzdvb2.zzb("arec", (String)object);
                object = this.zza;
                object3 = zzehp2.getMessage();
                object = ((zzfig)object).zza((String)object3);
                if (object != null) {
                    object3 = "areec";
                    zzdvb2.zzb((String)object3, (String)object);
                }
            }
            object = this.zzb;
            object2 = ((zzfgt)object2).zzu.iterator();
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object3 = (String)object2.next();
                if ((object3 = ((zzdsq)object).zza((String)object3)) == null) continue;
                break block6;
            }
            n3 = 0;
            object3 = null;
        }
        if (object3 != null) {
            object2 = ((zzdsp)object3).zza;
            zzdvb2.zzb("ancn", (String)object2);
            object = ((zzdsp)object3).zzb;
            if (object != null) {
                object2 = "adapter_v";
                object = ((zzbtt)object).toString();
                zzdvb2.zzb((String)object2, (String)object);
            }
            if ((object = ((zzdsp)object3).zzc) != null) {
                object2 = "adapter_sv";
                object = ((zzbtt)object).toString();
                zzdvb2.zzb((String)object2, (String)object);
            }
        }
        zzdvb2.zzf();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdkm;
import com.google.android.gms.internal.ads.zzdkq;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdkn
implements zzblp {
    private final WeakReference zza;

    public /* synthetic */ zzdkn(zzdkq zzdkq2, zzdkm weakReference) {
        this.zza = weakReference = new WeakReference<zzdkq>(zzdkq2);
    }

    public final void zza(Object object, Map object2) {
        object = (zzdkq)this.zza.get();
        if (object != null) {
            zzdkq.zzb((zzdkq)object).onAdClicked();
            Object object3 = zzbep.zzkM;
            zzben zzben2 = zzba.zzc();
            object3 = (Boolean)zzben2.zza((zzbeg)object3);
            boolean bl2 = (Boolean)object3;
            if (bl2) {
                zzdkq.zzd((zzdkq)object).zzdG();
                object3 = "sccg";
                object2 = (CharSequence)object2.get(object3);
                boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object = zzdkq.zzd((zzdkq)object);
                    ((zzdhg)object).zzdf();
                }
            }
        }
    }
}


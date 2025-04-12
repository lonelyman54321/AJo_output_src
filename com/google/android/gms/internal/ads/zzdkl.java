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
import com.google.android.gms.internal.ads.zzdkk;
import com.google.android.gms.internal.ads.zzdkq;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdkl
implements zzblp {
    private final WeakReference zza;

    public /* synthetic */ zzdkl(zzdkq zzdkq2, zzdkk weakReference) {
        this.zza = weakReference = new WeakReference<zzdkq>(zzdkq2);
    }

    public final void zza(Object object, Map object2) {
        Object object3;
        Object object4;
        boolean bl2;
        object = (zzdkq)this.zza.get();
        if (object != null && (bl2 = ((String)(object4 = "_ac")).equals(object3 = (String)object2.get("eventName")))) {
            zzdkq.zzb((zzdkq)object).onAdClicked();
            object3 = zzbep.zzkM;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            bl2 = (Boolean)object3;
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


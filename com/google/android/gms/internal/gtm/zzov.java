/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgr;
import com.google.android.gms.internal.gtm.zzgw;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzra;
import java.util.Map;

public final class zzov
extends zzjo {
    private final zzgw zza;

    public zzov(zzgw zzgw2) {
        this.zza = zzgw2;
    }

    /*
     * WARNING - void declaration
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object object3;
        Object object4;
        void var12_15;
        zzqs zzqs2;
        boolean bl2;
        Object object5;
        boolean bl3;
        boolean bl4 = true;
        Preconditions.checkArgument(bl4);
        boolean bl5 = ((Object)object2).length;
        boolean bl6 = false;
        Object object6 = null;
        if (bl5 > false) {
            bl3 = true;
        } else {
            bl3 = false;
            object5 = null;
        }
        Preconditions.checkArgument(bl3);
        object5 = object2[0];
        boolean bl7 = object5 instanceof zzqs ^ bl4;
        Preconditions.checkArgument(bl7);
        Object object7 = bl5 > bl4 ? object2[bl4] : zzqs.zze;
        zzqs zzqs3 = zzqs.zze;
        if (object7 == zzqs3 || (bl2 = object7 instanceof zzqv)) {
            boolean bl8 = true;
        } else {
            boolean bl9 = false;
            zzqs2 = null;
        }
        Preconditions.checkArgument((boolean)var12_15);
        boolean bl10 = 2 != 0;
        object2 = bl5 > bl10 ? object2[bl10] : zzqs3;
        if (object2 != zzqs3 && (bl5 = object2 instanceof zzqs)) {
            bl4 = false;
            object4 = null;
        }
        Preconditions.checkArgument(bl4);
        object4 = Uri.parse((String)zzjn.zzd((zzqo)object5)).buildUpon();
        if (object7 != zzqs3) {
            object7 = (zzqv)object7;
            object3 = ((zzqv)object7).zzk().iterator();
            while (bl6 = object3.hasNext()) {
                object6 = (zzqo)object3.next();
                bl3 = object6 instanceof zzqw;
                Preconditions.checkArgument(bl3);
                object6 = ((zzqw)object6).zzi().entrySet().iterator();
                while (bl3 = object6.hasNext()) {
                    object5 = (Map.Entry)object6.next();
                    object7 = ((String)object5.getKey()).toString();
                    object5 = (zzqo)object5.getValue();
                    object5 = zzjn.zzd(zzra.zzc((zzhx)object, (zzqo)object5));
                    object4.appendQueryParameter((String)object7, (String)object5);
                }
            }
        }
        object = object4.build().toString();
        zzqs2 = zzqs.zze;
        String string2 = "SendPixel: url = ";
        if (object2 == zzqs2) {
            object4 = object2 = this.zza;
            object4 = (zzgr)object2;
            bl7 = false;
            object7 = null;
            zzqs3 = null;
            bl6 = false;
            object6 = null;
            bl3 = false;
            object5 = null;
            object3 = object;
            ((zzgr)object4).zzb((String)object, null, null, null, null);
            object = String.valueOf(object);
            object = string2.concat((String)object);
            zzhi.zzd((String)object);
        } else {
            object2 = zzjn.zzd((zzqo)object2);
            object4 = (zzgr)this.zza;
            bl7 = false;
            object7 = null;
            zzqs3 = null;
            bl6 = false;
            object6 = null;
            object3 = object;
            object5 = object2;
            ((zzgr)object4).zzb((String)object, null, (String)object2, null, null);
            object4 = new StringBuilder(string2);
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(", uniqueId = ");
            ((StringBuilder)object4).append((String)object2);
            object = ((StringBuilder)object4).toString();
            zzhi.zzd((String)object);
        }
        return zzqs2;
    }
}


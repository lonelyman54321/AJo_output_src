/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzeum;
import java.util.concurrent.Callable;

public final class zzeuk
implements Callable {
    public final /* synthetic */ zzeul zza;

    public /* synthetic */ zzeuk(zzeul zzeul2) {
        this.zza = zzeul2;
    }

    public final Object call() {
        Object object;
        boolean bl2;
        zzu.zzp();
        Object object2 = zzu.zzo().zzi().zzg();
        Object object3 = null;
        if (!(object2 == null || (bl2 = (object = zzu.zzo().zzi()).zzP()) && (bl2 = (object = zzu.zzo().zzi()).zzQ()))) {
            boolean bl3;
            Object object4;
            String string2;
            bl2 = ((zzbbm)object2).zzh();
            if (bl2) {
                ((zzbbm)object2).zzg();
            }
            if ((object2 = ((zzbbm)object2).zza()) != null) {
                object = ((zzbbc)object2).zzd();
                string2 = ((zzbbc)object2).zze();
                object2 = ((zzbbc)object2).zzf();
                if (object != null) {
                    object4 = zzu.zzo().zzi();
                    object4.zzx((String)object);
                }
                if (object2 != null) {
                    object4 = zzu.zzo().zzi();
                    object4.zzz((String)object2);
                }
            } else {
                object = zzu.zzo().zzi().zzj();
                object2 = zzu.zzo().zzi().zzk();
                string2 = null;
            }
            object4 = new Bundle(1);
            Object object5 = zzu.zzo().zzi();
            boolean bl4 = object5.zzQ();
            if (!bl4) {
                boolean bl5;
                object5 = "v_fp_vertical";
                if (object2 != null && !(bl5 = TextUtils.isEmpty((CharSequence)object2))) {
                    object4.putString((String)object5, (String)object2);
                } else {
                    object2 = "no_hash";
                    object4.putString((String)object5, (String)object2);
                }
            }
            if (object != null && !(bl3 = (object2 = zzu.zzo().zzi()).zzP())) {
                object2 = "fingerprint";
                object4.putString((String)object2, (String)object);
                bl3 = ((String)object).equals(string2);
                if (!bl3) {
                    object2 = "v_fp";
                    object4.putString((String)object2, string2);
                }
            }
            if (!(bl3 = object4.isEmpty())) {
                object3 = object4;
            }
        }
        object2 = new zzeum((Bundle)object3);
        return object2;
    }
}


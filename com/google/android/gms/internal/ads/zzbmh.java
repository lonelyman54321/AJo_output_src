/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzchd;
import java.util.Map;

public final class zzbmh
implements zzblp {
    private final zzbmg zza;

    public zzbmh(zzbmg zzbmg2) {
        this.zza = zzbmg2;
    }

    public static void zzb(zzchd zzchd2, zzbmg zzbmg2) {
        zzbmh zzbmh2 = new zzbmh(zzbmg2);
        zzchd2.zzag("/reward", zzbmh2);
    }

    public final void zza(Object object, Map object2) {
        String string2 = "grant";
        object = (String)object2.get("action");
        int n3 = string2.equals(object);
        if (n3 != 0) {
            block12: {
                boolean bl2 = false;
                object = null;
                String string3 = "amount";
                Object v4 = object2.get(string3);
                String string4 = (String)v4;
                n3 = Integer.parseInt(string4);
                Object object3 = "type";
                object2 = object2.get(object3);
                object2 = (String)object2;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (bl3) break block12;
                try {
                    object = object3 = new zzbyt((String)object2, n3);
                }
                catch (NumberFormatException numberFormatException) {
                    String string5 = "Unable to parse reward amount.";
                    zzm.zzk(string5, numberFormatException);
                }
            }
            this.zza.zza((zzbyt)object);
            return;
        }
        object2 = "video_start";
        boolean bl4 = ((String)object2).equals(object);
        if (bl4) {
            this.zza.zzc();
            return;
        }
        object2 = "video_complete";
        boolean bl5 = ((String)object2).equals(object);
        if (bl5) {
            object = this.zza;
            object.zzb();
        }
    }
}


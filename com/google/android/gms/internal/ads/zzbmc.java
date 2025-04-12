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
import com.google.android.gms.internal.ads.zzdyx;
import java.util.Map;

public final class zzbmc
implements zzblp {
    private final zzdyx zza;

    public zzbmc(zzdyx zzdyx2) {
        this.zza = zzdyx2;
    }

    public final void zza(Object object, Map object2) {
        object = zzbep.zzjs;
        Object object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = (String)object2.get("action");
            object3 = (String)object2.get("adUnitId");
            String string2 = (String)object2.get("redirectUrl");
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (!(bl3 || (bl3 = TextUtils.isEmpty((CharSequence)object3)) || (bl3 = TextUtils.isEmpty((CharSequence)string2)))) {
                object2 = (String)object2.get("format");
                String string3 = "load";
                bl3 = ((String)object).equals(string3);
                if (bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)object2))) {
                    this.zza.zzh((String)object3, (String)object2, string2);
                    return;
                }
                object2 = "show";
                bl2 = ((String)object).equals(object2);
                if (bl2) {
                    object = this.zza;
                    ((zzdyx)object).zzi((String)object3, string2);
                }
            }
        }
    }
}


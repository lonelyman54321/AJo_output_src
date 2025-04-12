/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqp;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfqu
extends zzfqp {
    public zzfqu(zzfqi zzfqi2, HashSet hashSet, JSONObject jSONObject, long l2) {
        super(zzfqi2, hashSet, jSONObject, l2);
    }

    public final void zza(String string2) {
        Object object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && (object = zzfpe.zza()) != null) {
            boolean bl3;
            object = ((zzfpe)object).zzc().iterator();
            while (bl3 = object.hasNext()) {
                HashSet hashSet = this.zza;
                Object object2 = (zzfon)object.next();
                String string3 = ((zzfon)object2).zzh();
                boolean bl4 = hashSet.contains(string3);
                if (!bl4) continue;
                object2 = ((zzfon)object2).zzg();
                long l2 = this.zzc;
                ((zzfps)object2).zzh(string2, l2);
            }
        }
        super.zza(string2);
    }
}


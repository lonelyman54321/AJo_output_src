/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqp;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfqt
extends zzfqp {
    public zzfqt(zzfqi zzfqi2, HashSet hashSet, JSONObject jSONObject, long l2) {
        super(zzfqi2, hashSet, jSONObject, l2);
    }

    private final void zzc(String string2) {
        Object object = zzfpe.zza();
        if (object != null) {
            boolean bl2;
            object = ((zzfpe)object).zzc().iterator();
            while (bl2 = object.hasNext()) {
                HashSet hashSet = this.zza;
                Object object2 = (zzfon)object.next();
                String string3 = ((zzfon)object2).zzh();
                boolean bl3 = hashSet.contains(string3);
                if (!bl3) continue;
                object2 = ((zzfon)object2).zzg();
                long l2 = this.zzc;
                ((zzfps)object2).zzd(string2, l2);
            }
        }
    }

    public final /* synthetic */ Object doInBackground(Object[] objectArray) {
        return this.zzb.toString();
    }

    public final /* synthetic */ void onPostExecute(Object object) {
        object = (String)object;
        this.zzc((String)object);
        super.zza((String)object);
    }

    public final void zza(String string2) {
        this.zzc(string2);
        super.zza(string2);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzoz;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzmz
extends zzjo {
    private final int zza;
    private final zzhx zzb;

    public zzmz(int n3, zzhx zzhx2) {
        this.zza = n3;
        this.zzb = zzhx2;
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        JSONException jSONException2;
        block15: {
            block14: {
                zzqo[] zzqoArray;
                boolean bl2 = true;
                Preconditions.checkArgument(bl2);
                boolean bl3 = ((zzqo[])object2).length;
                if (bl3 != bl2) {
                    bl2 = false;
                    zzqoArray = null;
                }
                Preconditions.checkArgument(bl2);
                zzqoArray = object2[0];
                bl2 = zzqoArray instanceof zzqz;
                Preconditions.checkArgument(bl2);
                try {
                    object2 = object2[0];
                }
                catch (JSONException jSONException2) {}
                object2 = (zzqz)object2;
                object2 = ((zzqz)object2).zzk();
                zzqoArray = new JSONArray((String)object2);
                object2 = zzqoArray.getJSONArray(0);
                object2 = zzoz.zza(object2);
                zzqoArray = this.zzb;
                ((zzjl)object2).zzc((zzhx)zzqoArray);
                zzqoArray = new zzqo[]{};
                object = ((zzjo)object2).zzd((zzhx)object, zzqoArray);
                int n3 = this.zza;
                if (n3 != 0) break block14;
                object = zzqs.zze;
                break block15;
            }
            return object;
        }
        zzhi.zzb("Unable to convert Custom Pixie to instruction", jSONException2);
        return zzqs.zze;
    }
}


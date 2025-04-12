/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhh;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;

public final class zzne
extends zzjo {
    private final zzht zza;

    public zzne(zzht zzht2) {
        this.zza = zzht2;
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        String string2 = "";
        if (n4 != 0) {
            boolean bl2 = false;
            String string3 = null;
            Object object3 = object2[0];
            zzqs zzqs2 = zzqs.zze;
            if (object3 != zzqs2) {
                object3 = this.zza.zza().zzd();
                String string4 = "_ldl";
                if ((object3 = object3.get(string4)) == null) {
                    object = new zzqz(string2);
                    return object;
                }
                boolean bl3 = (object3 = zzra.zzb(object3)) instanceof zzqz;
                if (!bl3) {
                    object = new zzqz(string2);
                    return object;
                }
                string4 = zzhh.zza((String)(object3 = ((zzqz)object3).zzk()), "conv");
                bl2 = string4.equals(string3 = zzjn.zzd(object2[0]));
                if (!bl2) {
                    object = new zzqz(string2);
                    return object;
                }
                bl2 = false;
                string3 = null;
                if (n4 > n3 && (object = object2[n3]) != zzqs2) {
                    string3 = zzjn.zzd((zzqo)object);
                }
                object2 = (object = zzhh.zza((String)object3, string3)) != null ? new zzqz((String)object) : new zzqz(string2);
                return object2;
            }
        }
        object = new zzqz(string2);
        return object;
    }
}


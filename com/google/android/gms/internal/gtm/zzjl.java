/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzra;
import java.util.Arrays;
import java.util.List;

public final class zzjl
extends zzjo {
    private zzhx zza = null;
    private final String zzb;
    private final List zzc;
    private final List zzd;

    public zzjl(zzhx zzhx2, String string2, List list, List list2) {
        this.zzb = string2;
        this.zzc = list;
        this.zzd = list2;
    }

    public final String toString() {
        Object object = this.zzd;
        String string2 = this.zzc.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.zzb;
        X50.a(stringBuilder, string3, "\n\tparams: ", string2, "\n\t: statements: ");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        int n3;
        int n4;
        Object object2;
        block6: {
            Object object3;
            try {
                zzhx2 = this.zza;
                zzhx2 = zzhx2.zza();
                object2 = null;
                for (n4 = 0; n4 < (n3 = (object3 = this.zzc).size()); ++n4) {
                    zzqo zzqo2;
                    n3 = ((zzqo[])object).length;
                    if (n3 > n4) {
                        object3 = this.zzc;
                        object3 = object3.get(n4);
                        object3 = (String)object3;
                        zzqo2 = object[n4];
                        zzhx2.zzc((String)object3, zzqo2);
                        continue;
                    }
                    object3 = this.zzc;
                    object3 = object3.get(n4);
                    object3 = (String)object3;
                    zzqo2 = zzqs.zze;
                    zzhx2.zzc((String)object3, zzqo2);
                }
                object2 = "arguments";
                object = Arrays.asList(object);
                object3 = new zzqv((List)object);
                zzhx2.zzc((String)object2, (zzqo)object3);
                object = this.zzd;
                object = object.iterator();
                break block6;
            }
            catch (RuntimeException runtimeException) {}
            object = this.zzb;
            String string2 = runtimeException.getMessage();
            object3 = "Internal error - Function call: ";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append((String)object);
            object = "\n";
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            zzhi.zza(string2);
            return zzqs.zze;
        }
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = object.next();
            object2 = (zzqx)object2;
            {
                n3 = (object2 = zzra.zzd(zzhx2, (zzqx)object2)) instanceof zzqs;
                if (n3 == 0 || (n3 = (int)(((zzqs)(object2 = (zzqs)object2)).zzj() ? 1 : 0)) == 0) continue;
                return ((zzqs)object2).zzi();
            }
        }
        return zzqs.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(zzhx zzhx2) {
        this.zza = zzhx2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzht;
import java.util.List;

final class zzhr
implements zzv {
    private final /* synthetic */ zzhm zza;

    public zzhr(zzhm zzhm2) {
        this.zza = zzhm2;
    }

    public final void zza(zzs object, String string2, List list, boolean n3, boolean bl2) {
        int[] nArray = zzht.zza;
        int n4 = ((Enum)object).ordinal();
        n4 = nArray[n4];
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        object = n4 != n10 ? (n4 != n8 ? (n4 != n7 ? (n4 != (n3 = 4) ? this.zza.zzj().zzp() : this.zza.zzj().zzq()) : (n3 != 0 ? this.zza.zzj().zzx() : (!bl2 ? this.zza.zzj().zzw() : this.zza.zzj().zzr()))) : (n3 != 0 ? this.zza.zzj().zzo() : (!bl2 ? this.zza.zzj().zzm() : this.zza.zzj().zzg()))) : this.zza.zzj().zzc();
        n3 = list.size();
        bl2 = false;
        Object var11_11 = null;
        if (n3 != n10) {
            if (n3 != n8) {
                if (n3 != n7) {
                    ((zzgq)object).zza(string2);
                    return;
                }
                Object e2 = list.get(0);
                var11_11 = list.get(n10);
                list = list.get(n8);
                ((zzgq)object).zza(string2, e2, var11_11, list);
                return;
            }
            Object e5 = list.get(0);
            list = list.get(n10);
            ((zzgq)object).zza(string2, e5, list);
            return;
        }
        list = list.get(0);
        ((zzgq)object).zza(string2, list);
    }
}


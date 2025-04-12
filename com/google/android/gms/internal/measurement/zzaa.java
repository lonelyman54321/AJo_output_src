/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzn;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class zzaa {
    private final TreeMap zza;
    private final TreeMap zzb;

    public zzaa() {
        TreeMap treeMap;
        this.zza = treeMap = new TreeMap();
        this.zzb = treeMap = new TreeMap();
    }

    private static int zza(zzh object, zzar zzar2, zzaq object2) {
        boolean bl2 = (object = zzar2.zza((zzh)object, (List)(object2 = Collections.singletonList(object2)))) instanceof zzai;
        if (bl2) {
            return zzg.zzb(((zzaq)object).zze());
        }
        return -1;
    }

    public final void zza(zzh zzh2, zzac object) {
        boolean bl2;
        Object object2;
        int n3;
        zzn zzn2 = new zzn((zzac)object);
        Object object3 = this.zza.keySet().iterator();
        while ((n3 = object3.hasNext()) != 0) {
            int n4;
            object2 = (Integer)object3.next();
            zzad zzad2 = (zzad)((zzac)object).zzb().clone();
            TreeMap treeMap = this.zza;
            n3 = zzaa.zza(zzh2, (zzar)(object2 = (zzar)treeMap.get(object2)), zzn2);
            if (n3 != (n4 = 2) && n3 != (n4 = -1)) continue;
            ((zzac)object).zzb(zzad2);
        }
        object = this.zzb.keySet().iterator();
        while (bl2 = object.hasNext()) {
            object3 = (Integer)object.next();
            object2 = this.zzb;
            object3 = (zzar)((TreeMap)object2).get(object3);
            zzaa.zza(zzh2, (zzar)object3, zzn2);
        }
    }

    public final void zza(String object, int n3, zzar zzar2, String object2) {
        block6: {
            Integer n4;
            block5: {
                boolean bl2;
                block4: {
                    object = "create";
                    bl2 = ((String)object).equals(object2);
                    if (!bl2) break block4;
                    object = this.zzb;
                    break block5;
                }
                object = "edit";
                bl2 = ((String)object).equals(object2);
                if (!bl2) break block6;
                object = this.zza;
            }
            object2 = n3;
            boolean bl3 = ((TreeMap)object).containsKey(object2);
            if (bl3) {
                n4 = (Integer)((TreeMap)object).lastKey();
                n3 = n4 + 1;
            }
            n4 = n3;
            ((TreeMap)object).put(n4, zzar2);
            return;
        }
        String string2 = kp1_0.c("Unknown callback type: ", (String)object2);
        object = new IllegalStateException(string2);
        throw object;
    }
}


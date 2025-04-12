/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzcfu {
    private final ArrayList zza;
    private long zzb;

    public zzcfu() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public final long zza() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            Iterator iterator2 = ((zzhp)iterator.next()).zze().entrySet().iterator();
            while (bl3 = iterator2.hasNext()) {
                Object object;
                Object object2 = iterator2.next();
                String string2 = "content-length";
                try {
                    object = object2.getKey();
                }
                catch (RuntimeException runtimeException) {}
                object = (String)object;
                boolean bl4 = string2.equalsIgnoreCase((String)object);
                if (!bl4) continue;
                object2 = object2.getValue();
                object2 = (List)object2;
                bl4 = false;
                string2 = null;
                object2 = object2.get(0);
                object2 = (String)object2;
                long l2 = Long.parseLong((String)object2);
                long l3 = this.zzb;
                l2 = Math.max(l3, l2);
                this.zzb = l2;
            }
            iterator.remove();
        }
        return this.zzb;
    }

    public final void zzb(zzhp zzhp2) {
        this.zza.add(zzhp2);
    }
}


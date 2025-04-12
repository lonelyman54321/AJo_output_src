/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzn {
    private final List zza;

    public zzn() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public final List zza() {
        boolean bl2;
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (zzp)iterator.next();
            Bundle bundle = new Bundle();
            int n3 = ((zzp)object).zza();
            String string2 = "event_type";
            bundle.putInt(string2, n3);
            long l2 = ((zzp)object).zzb();
            object = "event_timestamp";
            bundle.putLong((String)object, l2);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void zzb(int n3) {
        List list = this.zza;
        long l2 = System.currentTimeMillis();
        zzp zzp2 = zzp.zzc(n3, l2);
        list.add(zzp2);
    }
}


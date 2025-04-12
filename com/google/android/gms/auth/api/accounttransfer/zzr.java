/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.auth.api.accounttransfer.zzq;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class zzr
implements Api$ApiOptions$Optional {
    public static final zzr zza;
    private final Bundle zzb;

    static {
        Bundle bundle = new Bundle();
        Object object = "accountTypes";
        boolean bl2 = bundle.containsKey((String)object);
        if (!bl2) {
            ArrayList arrayList = new ArrayList(0);
            bundle.putStringArrayList((String)object, arrayList);
        }
        zza = object = new zzr(bundle, null);
    }

    public /* synthetic */ zzr(Bundle bundle, zzq zzq2) {
        this.zzb = bundle;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof zzr;
        if (!bl3) {
            return false;
        }
        object = (zzr)object;
        Bundle bundle = this.zza();
        object = ((zzr)object).zza();
        int n4 = bundle.size();
        if (n4 != (n3 = object.size())) {
            return false;
        }
        Iterator iterator = bundle.keySet().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (String)iterator.next();
            boolean bl4 = object.containsKey((String)object2);
            if (!bl4) {
                return false;
            }
            Object object3 = bundle.get((String)object2);
            n3 = (int)(Objects.equal(object3, object2 = object.get((String)object2)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = 1;
        Bundle bundle = this.zza();
        int n4 = bundle.size();
        n4 += n4;
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        Set set = bundle.keySet();
        ArrayList arrayList2 = new ArrayList(set);
        Collections.sort(arrayList2);
        int n7 = arrayList2.size();
        for (int i3 = 0; i3 < n7; i3 += n3) {
            Object object = (String)arrayList2.get(i3);
            arrayList.add(object);
            object = bundle.get((String)object);
            arrayList.add(object);
        }
        Object[] objectArray = new Object[n3];
        objectArray[0] = arrayList;
        return Objects.hashCode(objectArray);
    }

    public final Bundle zza() {
        Bundle bundle = this.zzb;
        Bundle bundle2 = new Bundle(bundle);
        return bundle2;
    }
}


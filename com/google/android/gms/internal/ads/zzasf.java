/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class zzasf
extends zzars {
    public zzasf() {
        throw null;
    }

    public zzasf(zzase zzase2, SSLSocketFactory sSLSocketFactory) {
    }

    public static List zza(Map object) {
        int n3 = object.size();
        ArrayList<zzaqw> arrayList = new ArrayList<zzaqw>(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            boolean bl2;
            Map.Entry entry = (Map.Entry)object.next();
            Object object2 = entry.getKey();
            if (object2 == null) continue;
            object2 = ((List)entry.getValue()).iterator();
            while (bl2 = object2.hasNext()) {
                String string2 = (String)object2.next();
                String string3 = (String)entry.getKey();
                zzaqw zzaqw2 = new zzaqw(string3, string2);
                arrayList.add(zzaqw2);
            }
        }
        return arrayList;
    }
}


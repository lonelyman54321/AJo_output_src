/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzblp;
import java.util.Map;

public final class zzcfq
implements zzblp {
    private static final Integer zzb(Map object, String string2) {
        Object object2;
        int n3 = object.containsKey(string2);
        if (n3 == 0) {
            return null;
        }
        try {
            object2 = object.get(string2);
        }
        catch (NumberFormatException numberFormatException) {
            object = (String)object.get(string2);
            object2 = new StringBuilder("Precache invalid numeric parameter '");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("': ");
            ((StringBuilder)object2).append((String)object);
            zzm.zzj(((StringBuilder)object2).toString());
            return null;
        }
        object2 = (String)object2;
        n3 = Integer.parseInt(object2);
        return n3;
    }
}


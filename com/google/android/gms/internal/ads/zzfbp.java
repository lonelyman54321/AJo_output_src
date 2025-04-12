/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfbr;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzfbp
implements Callable {
    public final Object call() {
        int n3;
        HashMap<Object, List> hashMap = new HashMap<Object, List>();
        Object object = zzbep.zzJ;
        Object object2 = zzba.zzc();
        object = (String)((zzben)object2).zza((zzbeg)object);
        if (object != null && (n3 = object.isEmpty()) == 0) {
            n3 = Build.VERSION.SDK_INT;
            Object object3 = zzbep.zzK;
            Object object4 = zzba.zzc();
            object3 = (Integer)((zzben)object4).zza((zzbeg)object3);
            int n4 = (Integer)object3;
            if (n3 >= n4) {
                object2 = ",";
                object = object.split((String)object2, -1);
                n3 = ((String[])object).length;
                object3 = null;
                for (n4 = 0; n4 < n3; ++n4) {
                    object4 = object[n4];
                    List list = zzcn.zza((String)object4);
                    hashMap.put(object4, list);
                }
            }
        }
        object = new zzfbr(hashMap);
        return object;
    }
}


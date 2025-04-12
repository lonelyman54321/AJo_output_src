/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbze;

public final class zzbzl
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
            boolean bl2 = iInterface instanceof zzbze;
            if (bl2) {
                object = iInterface;
                object = (zzbze)iInterface;
            } else {
                iInterface = new zzbze((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


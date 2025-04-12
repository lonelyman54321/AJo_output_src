/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzap
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            boolean bl2 = iInterface instanceof zzcp;
            if (bl2) {
                object = iInterface;
                object = (zzcp)iInterface;
            } else {
                iInterface = new zzcp((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


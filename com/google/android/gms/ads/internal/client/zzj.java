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
import com.google.android.gms.ads.internal.client.zzbv;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzj
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            boolean bl2 = iInterface instanceof zzbv;
            if (bl2) {
                object = iInterface;
                object = (zzbv)iInterface;
            } else {
                iInterface = new zzbv((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


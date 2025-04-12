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
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzan
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            boolean bl2 = iInterface instanceof zzbr;
            if (bl2) {
                object = iInterface;
                object = (zzbr)iInterface;
            } else {
                iInterface = new zzbr((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


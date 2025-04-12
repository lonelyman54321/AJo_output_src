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
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzab
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
            boolean bl2 = iInterface instanceof zzdk;
            if (bl2) {
                object = iInterface;
                object = (zzdk)iInterface;
            } else {
                iInterface = new zzdk((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


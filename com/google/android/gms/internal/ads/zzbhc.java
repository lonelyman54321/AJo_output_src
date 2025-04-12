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
import com.google.android.gms.internal.ads.zzbhe;

public final class zzbhc
implements zzo {
    public final Object zza(Object object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
            boolean bl2 = iInterface instanceof zzbhe;
            if (bl2) {
                object = iInterface;
                object = (zzbhe)iInterface;
            } else {
                iInterface = new zzbhe((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


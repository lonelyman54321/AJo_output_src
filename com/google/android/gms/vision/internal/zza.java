/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.vision.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.PlatformVersion;

public final class zza {
    public static RemoteException zza(String object) {
        boolean bl2 = PlatformVersion.isAtLeastIceCreamSandwichMR1();
        if (bl2) {
            RemoteException remoteException = new RemoteException(object);
            return remoteException;
        }
        object = new RemoteException();
        return object;
    }
}


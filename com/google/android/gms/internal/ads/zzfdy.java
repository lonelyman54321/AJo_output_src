/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzfdx;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfdy {
    public static void zza(AtomicReference atomicReference, zzfdx zzfdx2) {
        if ((atomicReference = atomicReference.get()) == null) {
            return;
        }
        try {
            zzfdx2.zza(atomicReference);
            return;
        }
        catch (NullPointerException nullPointerException) {
            zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", nullPointerException);
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}


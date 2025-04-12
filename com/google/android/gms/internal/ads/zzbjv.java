/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbig;
import com.google.android.gms.internal.ads.zzbii;
import java.util.HashMap;

public final class zzbjv
extends RemoteCreator {
    public zzbjv() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
            boolean bl2 = iInterface instanceof zzbii;
            if (bl2) {
                object = iInterface;
                object = (zzbii)iInterface;
            } else {
                iInterface = new zzbig((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbif zza(View object, HashMap object2, HashMap object3) {
        void var1_4;
        block5: {
            Object object4 = null;
            try {
                IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                object2 = ObjectWrapper.wrap(object2);
                object3 = ObjectWrapper.wrap(object3);
                object = object.getContext();
                object = this.getRemoteCreatorInstance((Context)object);
                object = (zzbii)object;
                object = object.zze(iObjectWrapper, (IObjectWrapper)object2, (IObjectWrapper)object3);
                if (object == null) {
                    return object4;
                }
                object2 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate";
            }
            catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
                break block5;
            }
            catch (RemoteException remoteException) {
                break block5;
            }
            boolean bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzbif;
            if (!bl2) return new zzbid((IBinder)object);
            object2 = (zzbif)object2;
            return object2;
        }
        zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", (Throwable)var1_4);
        return null;
    }
}


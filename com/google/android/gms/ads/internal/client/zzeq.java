/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

public final class zzeq
extends RemoteCreator {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzco zza(Context object) {
        void var1_4;
        block5: {
            int n3;
            Object object2;
            Object object3 = null;
            try {
                object2 = ObjectWrapper.wrap(object);
                object = this.getRemoteCreatorInstance((Context)object);
                object = (zzcp)object;
                n3 = 241806000;
                object = ((zzcp)object).zze((IObjectWrapper)object2, n3);
                if (object == null) {
                    return object3;
                }
                object2 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
            }
            catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
                break block5;
            }
            catch (RemoteException remoteException) {
                break block5;
            }
            n3 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzco;
            if (n3 == 0) return new zzcm((IBinder)object);
            object2 = (zzco)object2;
            return object2;
        }
        zzm.zzk("Could not get remote MobileAdsSettingManager.", (Throwable)var1_4);
        return null;
    }
}


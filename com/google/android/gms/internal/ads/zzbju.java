/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.widget.FrameLayout
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;

public final class zzbju
extends RemoteCreator {
    public zzbju() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            boolean bl2 = iInterface instanceof zzbic;
            if (bl2) {
                object = iInterface;
                object = (zzbic)iInterface;
            } else {
                iInterface = new zzbia((IBinder)object);
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
    public final zzbhz zza(Context object, FrameLayout object2, FrameLayout object3) {
        void var1_4;
        block5: {
            Object object4 = null;
            try {
                IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                object2 = ObjectWrapper.wrap(object2);
                object3 = ObjectWrapper.wrap(object3);
                object = this.getRemoteCreatorInstance((Context)object);
                object = (zzbic)object;
                int n3 = 241806000;
                object = object.zze(iObjectWrapper, (IObjectWrapper)object2, (IObjectWrapper)object3, n3);
                if (object == null) {
                    return object4;
                }
                object2 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
            }
            catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
                break block5;
            }
            catch (RemoteException remoteException) {
                break block5;
            }
            boolean bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzbhz;
            if (!bl2) return new zzbhx((IBinder)object);
            object2 = (zzbhz)object2;
            return object2;
        }
        zzm.zzk("Could not create remote NativeAdViewDelegate.", (Throwable)var1_4);
        return null;
    }
}


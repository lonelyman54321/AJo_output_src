/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvj;

public final class zzbvd
extends RemoteCreator {
    public zzbvd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            boolean bl2 = iInterface instanceof zzbvj;
            if (bl2) {
                object = iInterface;
                object = (zzbvj)iInterface;
            } else {
                iInterface = new zzbvh((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbvg zza(Activity object) {
        RemoteException remoteException2;
        String string2;
        block6: {
            RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException2;
            block5: {
                Object object2;
                string2 = "Could not create remote AdOverlay.";
                Object object3 = null;
                try {
                    object2 = ObjectWrapper.wrap(object);
                    object = this.getRemoteCreatorInstance((Context)object);
                    object = (zzbvj)object;
                    object = object.zze((IObjectWrapper)object2);
                    if (object == null) {
                        return object3;
                    }
                    object2 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
                }
                catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException2) {
                    break block5;
                }
                catch (RemoteException remoteException2) {
                    break block6;
                }
                boolean bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzbvg;
                if (!bl2) return new zzbve((IBinder)object);
                object2 = (zzbvg)object2;
                return object2;
            }
            zzm.zzk(string2, remoteCreator$RemoteCreatorException2);
            return null;
        }
        zzm.zzk(string2, remoteException2);
        return null;
    }
}


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
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzi
extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbq zza(Context object, String object2, zzbrf zzbrf2) {
        void var1_4;
        block5: {
            Object object3 = null;
            try {
                IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                object = this.getRemoteCreatorInstance((Context)object);
                object = (zzbr)object;
                int n3 = 241806000;
                object = ((zzbr)object).zze(iObjectWrapper, (String)object2, zzbrf2, n3);
                if (object == null) {
                    return object3;
                }
                object2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
            }
            catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
                break block5;
            }
            catch (RemoteException remoteException) {
                break block5;
            }
            boolean bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzbq;
            if (!bl2) return new zzbo((IBinder)object);
            object2 = (zzbq)object2;
            return object2;
        }
        zzm.zzk("Could not create remote builder for AdLoader.", (Throwable)var1_4);
        return null;
    }
}


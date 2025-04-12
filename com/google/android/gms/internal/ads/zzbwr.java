/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzbyf;

public final class zzbwr
extends zzc {
    public zzbwr(Context context, Looper looper, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        Context context2 = zzbyf.zza(context);
        super(context2, looper, 8, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            boolean bl2 = iInterface instanceof zzbxd;
            if (bl2) {
                object = iInterface;
                object = (zzbxd)iInterface;
            } else {
                iInterface = new zzbxb((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbxd zzp() {
        return (zzbxd)this.getService();
    }
}


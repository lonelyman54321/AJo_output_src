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
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxh;

public final class zzbwu
extends BaseGmsClient {
    public zzbwu(Context context, Looper looper, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        Context context2 = context.getApplicationContext();
        Context context3 = context2 != null ? context2 : context;
        super(context3, looper, 8, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
            boolean bl2 = iInterface instanceof zzbxh;
            if (bl2) {
                object = iInterface;
                object = (zzbxh)iInterface;
            } else {
                iInterface = new zzbxf((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.ADS";
    }

    public final zzbxh zzp() {
        return (zzbxh)this.getService();
    }
}


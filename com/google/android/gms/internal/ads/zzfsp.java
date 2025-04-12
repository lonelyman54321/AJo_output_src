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
import com.google.android.gms.internal.ads.zzfsu;

public final class zzfsp
extends zzc {
    private final int zze;

    public zzfsp(Context context, Looper looper, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener, int n3) {
        super(context, looper, 116, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
        this.zze = n3;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
            boolean bl2 = iInterface instanceof zzfsu;
            if (bl2) {
                object = iInterface;
                object = (zzfsu)iInterface;
            } else {
                iInterface = new zzfsu((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final int getMinApkVersion() {
        return this.zze;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfsu zzp() {
        return (zzfsu)this.getService();
    }
}


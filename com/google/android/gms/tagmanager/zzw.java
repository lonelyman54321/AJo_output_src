/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.tagmanager;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzfy;
import com.google.android.gms.tagmanager.ContainerHolder$ContainerAvailableListener;
import com.google.android.gms.tagmanager.zzx;

final class zzw
extends zzfy {
    final /* synthetic */ zzx zza;
    private final ContainerHolder$ContainerAvailableListener zzb;

    public zzw(zzx zzx2, ContainerHolder$ContainerAvailableListener containerHolder$ContainerAvailableListener, Looper looper) {
        this.zza = zzx2;
        super(looper);
        this.zzb = containerHolder$ContainerAvailableListener;
    }

    public final void handleMessage(Message object) {
        int n3 = object.what;
        int n4 = 1;
        if (n3 != n4) {
            return;
        }
        object = (String)object.obj;
        ContainerHolder$ContainerAvailableListener containerHolder$ContainerAvailableListener = this.zzb;
        zzx zzx2 = this.zza;
        containerHolder$ContainerAvailableListener.onContainerAvailable(zzx2, (String)object);
    }
}


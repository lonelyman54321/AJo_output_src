/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.aq;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class al
extends p {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ ax b;

    public al(ax ax2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        this.a = taskCompletionSource2;
        this.b = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        try {
            object2 = this.b;
        }
        catch (RemoteException remoteException) {
            object = ax.r();
            objectArray = new Object[]{};
            ((o)object).c(remoteException, "keepAlive", objectArray);
            return;
        }
        object2 = ax.t((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.b;
        object = ax.u((ax)object);
        objectArray = ax.m();
        ax ax2 = this.b;
        TaskCompletionSource taskCompletionSource = this.a;
        aq aq2 = new aq(ax2, taskCompletionSource);
        object2.f((String)object, (Bundle)objectArray, aq2);
    }
}


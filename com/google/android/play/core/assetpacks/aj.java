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
import com.google.android.play.core.assetpacks.at;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class aj
extends p {
    final /* synthetic */ int a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ ax c;

    public aj(ax ax2, TaskCompletionSource taskCompletionSource, int n3, TaskCompletionSource taskCompletionSource2) {
        this.a = n3;
        this.b = taskCompletionSource2;
        this.c = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        try {
            object2 = this.c;
        }
        catch (RemoteException remoteException) {
            object = ax.r();
            objectArray = new Object[]{};
            ((o)object).c(remoteException, "notifySessionFailed", objectArray);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.c;
        object = ax.u((ax)object);
        int n3 = this.a;
        objectArray = ax.o(n3);
        Bundle bundle = ax.m();
        ax ax2 = this.c;
        TaskCompletionSource taskCompletionSource = this.b;
        at at2 = new at(ax2, taskCompletionSource);
        object2.i((String)object, (Bundle)objectArray, bundle, at2);
    }
}


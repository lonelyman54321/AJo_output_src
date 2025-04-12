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
import com.google.android.play.core.assetpacks.au;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class ac
extends p {
    final /* synthetic */ String a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ ax c;

    public ac(ax ax2, TaskCompletionSource taskCompletionSource, String string2, TaskCompletionSource taskCompletionSource2) {
        this.a = string2;
        this.b = taskCompletionSource2;
        this.c = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.c;
        }
        catch (RemoteException remoteException) {
            object2 = this.a;
            object = ax.r();
            objectArray = new Object[]{object2};
            ((o)object).c(remoteException, "removePack(%s)", objectArray);
            return;
        }
        object3 = ax.s((ax)object3);
        object3 = ((z)object3).e();
        object3 = (f)object3;
        object2 = this.c;
        object2 = ax.u((ax)object2);
        object = this.a;
        object = ax.l(0, (String)object);
        objectArray = ax.m();
        ax ax2 = this.c;
        TaskCompletionSource taskCompletionSource = this.b;
        au au4 = new au(ax2, taskCompletionSource);
        object3.j((String)object2, (Bundle)object, (Bundle)objectArray, au4);
    }
}


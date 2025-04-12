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
import com.google.android.play.core.assetpacks.ar;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.h;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class ah
extends p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ TaskCompletionSource e;
    final /* synthetic */ ax f;

    public ah(ax ax2, TaskCompletionSource taskCompletionSource, int n3, String string2, String string3, int n4, TaskCompletionSource taskCompletionSource2) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
        this.d = n4;
        this.e = taskCompletionSource2;
        this.f = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        try {
            object2 = this.f;
        }
        catch (RemoteException remoteException) {
            object = ax.r();
            objectArray = new Object[]{};
            ((o)object).c(remoteException, "notifyChunkTransferred", objectArray);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.f;
        object = ax.u((ax)object);
        int n3 = this.a;
        String string2 = this.b;
        Object object3 = this.c;
        int n4 = this.d;
        objectArray = ax.k(n3, string2, (String)object3, n4);
        string2 = ax.m();
        ax ax2 = this.f;
        TaskCompletionSource taskCompletionSource = this.e;
        object3 = new ar(ax2, taskCompletionSource);
        object2.g((String)object, (Bundle)objectArray, (Bundle)string2, (h)object3);
    }
}


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
import com.google.android.play.core.assetpacks.as;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class ai
extends p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ ax e;

    public ai(ax ax2, TaskCompletionSource taskCompletionSource, int n3, String string2, TaskCompletionSource taskCompletionSource2, int n4) {
        this.a = n3;
        this.b = string2;
        this.c = taskCompletionSource2;
        this.d = n4;
        this.e = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        try {
            object2 = this.e;
        }
        catch (RemoteException remoteException) {
            object = ax.r();
            objectArray = new Object[]{};
            ((o)object).c(remoteException, "notifyModuleCompleted", objectArray);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.e;
        object = ax.u((ax)object);
        int n3 = this.a;
        String string2 = this.b;
        objectArray = ax.l(n3, string2);
        string2 = ax.m();
        ax ax2 = this.e;
        TaskCompletionSource taskCompletionSource = this.c;
        int n4 = this.a;
        String string3 = this.b;
        int n7 = this.d;
        as as2 = new as(ax2, taskCompletionSource, n4, string3, n7);
        object2.h((String)object, (Bundle)objectArray, (Bundle)string2, as2);
    }
}


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
import com.google.android.play.core.assetpacks.ao;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.h;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;

final class ak
extends p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ TaskCompletionSource e;
    final /* synthetic */ ax f;

    public ak(ax ax2, TaskCompletionSource taskCompletionSource, int n3, String string2, String string3, int n4, TaskCompletionSource taskCompletionSource2) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
        this.d = n4;
        this.e = taskCompletionSource2;
        this.f = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object object;
        Object object2;
        Object object3;
        String string2;
        Object object4;
        Object object5;
        Object object6;
        try {
            object6 = this.f;
        }
        catch (RemoteException remoteException) {
            object5 = this.b;
            object4 = ax.r();
            string2 = this.c;
            object3 = this.d;
            object2 = this.a;
            object = new Object[]{object5, string2, object3, object2};
            ((o)object4).b("getChunkFileDescriptor(%s, %s, %d, session=%d)", object);
            object5 = this.e;
            object4 = new RuntimeException(remoteException);
            ((TaskCompletionSource)object5).trySetException((Exception)object4);
            return;
        }
        object6 = ax.s((ax)object6);
        object6 = ((z)object6).e();
        object6 = (f)object6;
        object5 = this.f;
        object5 = ax.u((ax)object5);
        int n3 = this.a;
        string2 = this.b;
        object3 = this.c;
        int n4 = this.d;
        object4 = ax.k(n3, string2, (String)object3, n4);
        string2 = ax.m();
        object2 = this.f;
        object = this.e;
        object3 = new ao((ax)object2, (TaskCompletionSource)object);
        object6.d((String)object5, (Bundle)object4, (Bundle)string2, (h)object3);
    }
}


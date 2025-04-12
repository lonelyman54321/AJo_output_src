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
import com.google.android.play.core.assetpacks.av;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ag
extends p {
    final /* synthetic */ List a;
    final /* synthetic */ Map b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ bf d;
    final /* synthetic */ ax e;

    public ag(ax ax2, TaskCompletionSource taskCompletionSource, List list, Map map2, TaskCompletionSource taskCompletionSource2, bf bf2) {
        this.a = list;
        this.b = map2;
        this.c = taskCompletionSource2;
        this.d = bf2;
        this.e = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        ArrayList arrayList = ax.v(this.a);
        try {
            object2 = this.e;
        }
        catch (RemoteException remoteException) {
            object2 = this.a;
            object = ax.r();
            objectArray = new Object[]{object2};
            ((o)object).c(remoteException, "getPackStates(%s)", objectArray);
            object2 = this.c;
            object = new RuntimeException(remoteException);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.e;
        object = ax.u((ax)object);
        objectArray = this.b;
        objectArray = ax.n((Map)objectArray);
        ax ax2 = this.e;
        TaskCompletionSource taskCompletionSource = this.c;
        dd dd2 = ax.p(ax2);
        er er2 = ax.q(ax2);
        bf bf2 = this.d;
        av av2 = new av(ax2, taskCompletionSource, dd2, er2, bf2);
        object2.k((String)object, arrayList, (Bundle)objectArray, av2);
    }
}


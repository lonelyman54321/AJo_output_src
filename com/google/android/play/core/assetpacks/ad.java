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
import com.google.android.play.core.assetpacks.aw;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ad
extends p {
    final /* synthetic */ List a;
    final /* synthetic */ Map b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ ax d;

    public ad(ax ax2, TaskCompletionSource taskCompletionSource, List list, Map map2, TaskCompletionSource taskCompletionSource2) {
        this.a = list;
        this.b = map2;
        this.c = taskCompletionSource2;
        this.d = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        ArrayList arrayList = ax.v(this.a);
        try {
            object2 = this.d;
        }
        catch (RemoteException remoteException) {
            object2 = this.a;
            object = ax.r();
            objectArray = new Object[]{object2};
            ((o)object).c(remoteException, "startDownload(%s)", objectArray);
            object2 = this.c;
            object = new RuntimeException(remoteException);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.d;
        object = ax.u((ax)object);
        objectArray = this.b;
        objectArray = ax.n((Map)objectArray);
        ax ax2 = this.d;
        TaskCompletionSource taskCompletionSource = this.c;
        dd dd2 = ax.p(ax2);
        er er2 = ax.q(ax2);
        aw aw2 = new aw(ax2, taskCompletionSource, dd2, er2);
        object2.l((String)object, arrayList, (Bundle)objectArray, aw2);
    }
}


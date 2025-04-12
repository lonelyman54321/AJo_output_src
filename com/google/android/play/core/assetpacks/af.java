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
import com.google.android.play.core.assetpacks.ap;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.Map;

final class af
extends p {
    final /* synthetic */ Map a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ ax c;

    public af(ax ax2, TaskCompletionSource taskCompletionSource, Map map2, TaskCompletionSource taskCompletionSource2) {
        this.a = map2;
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
            ((o)object).c(remoteException, "syncPacks", objectArray);
            object = this.b;
            objectArray = new RuntimeException(remoteException);
            ((TaskCompletionSource)object).trySetException((Exception)objectArray);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.c;
        object = ax.u((ax)object);
        objectArray = this.a;
        objectArray = ax.n((Map)objectArray);
        ax ax2 = this.c;
        TaskCompletionSource taskCompletionSource = this.b;
        ap ap2 = new ap(ax2, taskCompletionSource);
        object2.e((String)object, (Bundle)objectArray, ap2);
    }
}


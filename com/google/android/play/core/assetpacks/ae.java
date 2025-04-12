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
import com.google.android.play.core.assetpacks.an;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.ArrayList;
import java.util.List;

final class ae
extends p {
    final /* synthetic */ List a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ ax c;

    public ae(ax ax2, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        this.a = list;
        this.b = taskCompletionSource2;
        this.c = ax2;
        super(taskCompletionSource);
    }

    public final void a() {
        Object[] objectArray;
        Object object;
        Object object2;
        ArrayList arrayList = ax.v(this.a);
        try {
            object2 = this.c;
        }
        catch (RemoteException remoteException) {
            object2 = this.a;
            object = ax.r();
            objectArray = new Object[]{object2};
            ((o)object).c(remoteException, "cancelDownloads(%s)", objectArray);
            return;
        }
        object2 = ax.s((ax)object2);
        object2 = ((z)object2).e();
        object2 = (f)object2;
        object = this.c;
        object = ax.u((ax)object);
        objectArray = ax.m();
        ax ax2 = this.c;
        TaskCompletionSource taskCompletionSource = this.b;
        an an2 = new an(ax2, taskCompletionSource);
        object2.c((String)object, arrayList, (Bundle)objectArray, an2);
    }
}


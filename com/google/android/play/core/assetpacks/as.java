/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.am;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.z;

final class as
extends am {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ ax f;

    public as(ax ax2, TaskCompletionSource taskCompletionSource, int n3, String string2, int n4) {
        this.f = ax2;
        super(ax2, taskCompletionSource);
        this.c = n3;
        this.d = string2;
        this.e = n4;
    }

    public final void d(Bundle object) {
        Object object2 = ax.s(this.f);
        Object[] objectArray = this.a;
        ((z)object2).u((TaskCompletionSource)objectArray);
        int n3 = object.getInt("error_code");
        object2 = ax.r();
        object = n3;
        int n4 = 1;
        objectArray = new Object[n4];
        String string2 = null;
        objectArray[0] = object;
        object = "onError(%d), retrying notifyModuleCompleted...";
        ((o)object2).b((String)object, objectArray);
        n3 = this.e;
        if (n3 > 0) {
            object2 = this.f;
            n4 = this.c;
            string2 = this.d;
            ax.y((ax)object2, n4, string2, n3 += -1);
        }
    }
}


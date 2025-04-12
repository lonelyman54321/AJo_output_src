/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.am;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.concurrent.atomic.AtomicBoolean;

final class aq
extends am {
    final /* synthetic */ ax c;

    public aq(ax ax2, TaskCompletionSource taskCompletionSource) {
        this.c = ax2;
        super(ax2, taskCompletionSource);
    }

    public final void d(Bundle bundle) {
        Object object = ax.t(this.c);
        Object object2 = this.a;
        ((z)object).u((TaskCompletionSource)object2);
        int n3 = bundle.getInt("error_code");
        object = ax.r();
        object2 = n3;
        Object[] objectArray = new Object[]{object2};
        ((o)object).b("onError(%d)", objectArray);
        object = new AssetPackException(n3);
        this.a.trySetException((Exception)object);
    }

    public final void h(Bundle object, Bundle object2) {
        boolean bl2;
        super.h((Bundle)object, (Bundle)object2);
        object2 = ax.x(this.c);
        boolean bl3 = true;
        String string2 = null;
        boolean bl4 = ((AtomicBoolean)object2).compareAndSet(bl3, false);
        if (!bl4) {
            object2 = ax.r();
            Object[] objectArray = new Object[]{};
            string2 = "Expected keepingAlive to be true, but was false.";
            ((o)object2).e(string2, objectArray);
        }
        if (bl2 = object.getBoolean((String)(object2 = "keep_alive"))) {
            object = this.c;
            ((ax)object).f();
        }
    }
}


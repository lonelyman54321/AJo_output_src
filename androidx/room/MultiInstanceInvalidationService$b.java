/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.RemoteCallbackList
 */
package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

public final class MultiInstanceInvalidationService$b
extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public MultiInstanceInvalidationService$b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public final void onCallbackDied(IInterface object, Object object2) {
        Intrinsics.checkNotNullParameter((bc1_0)object, "callback");
        Intrinsics.checkNotNullParameter(object2, "cookie");
        object = this.a.b;
        object2 = (Integer)object2;
        object.remove(object2);
    }
}


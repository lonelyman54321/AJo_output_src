/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import kotlin.jvm.internal.Intrinsics;

public class DiagnosticsReceiver
extends BroadcastReceiver {
    static {
        qx1.b("DiagnosticsRcvr");
    }

    public final void onReceive(Context object, Intent object2) {
        if (object2 == null) {
            return;
        }
        qx1.a().getClass();
        object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ni3_1.i((Context)object);
        object2 = "getInstance(context)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object2 = DiagnosticsWorker.class;
        String string2 = "workerClass";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = new y92$a();
        object2 = ((CI3$a)object2).a();
        object2 = (y92)object2;
        try {
            ((li3_1)object).c((y92)object2);
        }
        catch (IllegalStateException illegalStateException) {
            object = qx1.a();
            object.getClass();
        }
    }
}


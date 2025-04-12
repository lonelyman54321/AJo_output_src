/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.launch;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

public final class AdIdWorker
extends RxWorker {
    public AdIdWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        super(context, workerParameters);
    }

    public final u53_0 b() {
        Object object = new a4_0();
        object = ((a4_0)object).a();
        Object object2 = new b4_0(0);
        Object object3 = new c4((b4_0)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new d4(0);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}


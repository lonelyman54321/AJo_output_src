/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
package com.ril.ajio.launch.config;

import android.content.Context;
import android.widget.Toast;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ConfigWorker
extends RxWorker {
    public ConfigWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        super(context, workerParameters);
    }

    public final u53_0 b() {
        Object object = new yq2_1();
        Object object2 = "prod";
        Object object3 = "qa";
        if (object2 == object3 || object2 == (object3 = "qaregression")) {
            int n3;
            object3 = cp_1.Companion;
            boolean bl2 = km_1.b((cp$a)object3);
            object2 = "Fetching config...";
            if (!bl2) {
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a();
                n3 = 1;
                object3 = Toast.makeText((Context)object3, (CharSequence)object2, (int)n3);
                object3.show();
            }
            object3 = yn3_0.a;
            ((yn3$a)object3).l("ConfigWorker");
            n3 = 0;
            Object[] objectArray = new Object[]{};
            ((yn3$a)object3).a((String)object2, objectArray);
        }
        object = g53_0.b((v53_0)object);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        object3 = new l40_0(0);
        object2 = new m40_0((Function1)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object2);
        object = new Object();
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }
}


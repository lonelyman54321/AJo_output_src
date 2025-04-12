/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.pushnotification.amp;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c$a;
import androidx.work.c$a$c;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class CTPushAmpWorker
extends Worker {
    public CTPushAmpWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        super(context, workerParameters);
    }

    public final c$a doWork() {
        b.j();
        Object object = this.getApplicationContext();
        Object object2 = a.e;
        if (object2 == null) {
            object2 = a.g(object);
            if (object2 != null) {
                object2 = ((a)object2).b;
                CleverTapInstanceConfig cleverTapInstanceConfig = ((H80)object2).a;
                boolean bl2 = cleverTapInstanceConfig.i;
                if (bl2) {
                    object2 = ((H80)object2).p;
                    ((hC2)object2).g((Context)object);
                } else {
                    b.c();
                }
            }
        } else {
            boolean bl3;
            object2 = ((HashMap)object2).keySet().iterator();
            while (bl3 = object2.hasNext()) {
                boolean bl4;
                Object object3 = (String)object2.next();
                Object object4 = a.e;
                if ((object3 = (a)((HashMap)object4).get(object3)) != null) {
                    object4 = ((a)object3).b.a;
                    bl4 = ((CleverTapInstanceConfig)object4).h;
                    if (bl4) {
                        b.d();
                        continue;
                    }
                }
                if (object3 != null) {
                    object3 = ((a)object3).b;
                    object4 = ((H80)object3).a;
                    bl4 = ((CleverTapInstanceConfig)object4).i;
                    if (bl4) {
                        object3 = ((H80)object3).p;
                        ((hC2)object3).g((Context)object);
                        continue;
                    }
                }
                b.d();
            }
        }
        object = new c$a$c();
        Intrinsics.checkNotNullExpressionValue(object, "success()");
        return object;
    }
}


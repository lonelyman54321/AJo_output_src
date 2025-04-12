/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.pushnotification.work;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c$a;
import androidx.work.c$a$c;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CTFlushPushImpressionsWork
extends Worker {
    public final String b;

    public CTFlushPushImpressionsWork(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
        this.b = "CTFlushPushImpressionsWork";
    }

    public final c$a doWork() {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        com.clevertap.android.sdk.b.d();
        com.clevertap.android.sdk.b.d();
        Object object3 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object3, "applicationContext");
        Iterator iterator = a.c(object3);
        Intrinsics.checkNotNullExpressionValue(iterator, "getAvailableInstances(context)");
        iterator = CollectionsKt.J((Iterable)((Object)iterator));
        Object object4 = new ArrayList();
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (bl3 = iterator.hasNext()) {
            object = object2 = iterator.next();
            object = ((a)object2).b.a;
            bl2 = ((CleverTapInstanceConfig)object).h ^ true;
            if (!bl2) continue;
            ((ArrayList)object4).add(object2);
        }
        iterator = ((ArrayList)object4).iterator();
        while (true) {
            boolean bl4 = iterator.hasNext();
            object2 = "success()";
            if (!bl4) break;
            object4 = (a)iterator.next();
            bl2 = this.isStopped();
            if (bl2) {
                com.clevertap.android.sdk.b.d();
            }
            if (bl2 = this.isStopped()) {
                object3 = new c$a$c();
                Intrinsics.checkNotNullExpressionValue(object3, object2);
                return object3;
            }
            ((a)object4).b();
            com.clevertap.android.sdk.b.d();
            object2 = "PI_WM";
            object = this.b;
            qi_2.d(object3, (a)object4, object, object2);
        }
        com.clevertap.android.sdk.b.d();
        object3 = new c$a$c();
        Intrinsics.checkNotNullExpressionValue(object3, object2);
        return object3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import com.clevertap.android.sdk.task.a$a;
import java.util.ArrayList;
import java.util.concurrent.Callable;

class Task$1
implements Runnable {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ a b;

    public Task$1(a a2, String string2, Callable callable) {
        this.b = a2;
        this.a = callable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.b;
        try {
            boolean bl2;
            Object object2;
            Object object3 = a$a.FAILED;
            object.getClass();
            object3 = Thread.currentThread();
            ((Thread)object3).getName();
            object3 = ((a)object).a;
            if (object3 != null) {
                object2 = ((CleverTapInstanceConfig)object3).b();
                object2.getClass();
                com.clevertap.android.sdk.b.n();
            } else {
                com.clevertap.android.sdk.b.l();
            }
            object2 = this.a;
            object2 = object2.call();
            Object object4 = Thread.currentThread();
            ((Thread)object4).getName();
            if (object3 != null) {
                object3 = ((CleverTapInstanceConfig)object3).b();
                object3.getClass();
                com.clevertap.android.sdk.b.n();
            } else {
                com.clevertap.android.sdk.b.l();
            }
            ((a)object).e = object2;
            object3 = ((a)object).f;
            object3 = ((ArrayList)object3).iterator();
            while (bl2 = object3.hasNext()) {
                object2 = object3.next();
                object2 = (ee0_0)object2;
                object4 = ((a)object).e;
                ((ee0_0)object2).a(object4);
            }
            return;
        }
        catch (Exception exception) {
            boolean bl3;
            object.getClass();
            Object object5 = a$a.FAILED;
            object5 = ((a)object).d.iterator();
            while (bl3 = object5.hasNext()) {
                ee0_0 ee0_02 = (ee0_0)object5.next();
                ee0_02.a(exception);
            }
            Thread thread2 = Thread.currentThread();
            thread2.getName();
            object = ((a)object).a;
            if (object != null) {
                object = ((CleverTapInstanceConfig)object).b();
                object.getClass();
                com.clevertap.android.sdk.b.n();
                return;
            }
            com.clevertap.android.sdk.b.l();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.ArrayList;
import java.util.Objects;

class SystemAlarmDispatcher$DequeueAndCheckForCompletion
implements Runnable {
    public final SystemAlarmDispatcher a;

    public SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
        this.a = systemAlarmDispatcher;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.a;
        object.getClass();
        qx1.a().getClass();
        SystemAlarmDispatcher.c();
        ArrayList arrayList = ((SystemAlarmDispatcher)object).g;
        synchronized (arrayList) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                boolean bl3;
                Object object2;
                Object object3;
                block8: {
                    try {
                        object3 = ((SystemAlarmDispatcher)object).h;
                        if (object3 == null) break block8;
                        object3 = qx1.a();
                        object2 = ((SystemAlarmDispatcher)object).h;
                        Objects.toString(object2);
                        object3.getClass();
                        object3 = ((SystemAlarmDispatcher)object).g;
                        bl3 = false;
                        object2 = null;
                        object3 = ((ArrayList)object3).remove(0);
                        object2 = ((SystemAlarmDispatcher)object).h;
                        bl2 = object3.equals(object2);
                        if (!bl2) {
                            object3 = "Dequeue-d command is not the first.";
                            object = new IllegalStateException((String)object3);
                            throw object;
                        }
                        bl2 = false;
                        object3 = null;
                        ((SystemAlarmDispatcher)object).h = null;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                object3 = ((SystemAlarmDispatcher)object).b;
                object3 = object3.c();
                object2 = ((SystemAlarmDispatcher)object).f;
                bl3 = ((a)object2).b();
                if (!bl3 && (bl3 = ((ArrayList)(object2 = ((SystemAlarmDispatcher)object).g)).isEmpty()) && !(bl2 = ((SerialExecutorImpl)object3).a())) {
                    object3 = qx1.a();
                    object3.getClass();
                    object = ((SystemAlarmDispatcher)object).i;
                    if (object != null) {
                        object = (SystemAlarmService)object;
                        ((SystemAlarmService)object).a();
                    }
                } else {
                    object3 = ((SystemAlarmDispatcher)object).g;
                    bl2 = ((ArrayList)object3).isEmpty();
                    if (!bl2) {
                        ((SystemAlarmDispatcher)object).e();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.utils;

import androidx.work.impl.utils.WorkTimer$WorkTimerRunnable;
import java.util.HashMap;
import java.util.Objects;

public final class WorkTimer {
    public final Sm0 a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    static {
        qx1.b("WorkTimer");
    }

    public WorkTimer(Sm0 sm0) {
        Object object = new HashMap();
        this.b = object;
        object = new HashMap();
        this.c = object;
        this.d = object = new Object();
        this.a = sm0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(gI3 gI32) {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.b;
                        object2 = ((HashMap)object2).remove(gI32);
                        object2 = (WorkTimer$WorkTimerRunnable)object2;
                        if (object2 == null) break block3;
                        object2 = qx1.a();
                        Objects.toString(gI32);
                        object2.getClass();
                        object2 = this.c;
                        ((HashMap)object2).remove(gI32);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


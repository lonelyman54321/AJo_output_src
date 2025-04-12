/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.utils;

import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.WorkTimer$a;
import java.util.HashMap;
import java.util.Objects;

public class WorkTimer$WorkTimerRunnable
implements Runnable {
    public final WorkTimer a;
    public final gI3 b;

    public WorkTimer$WorkTimerRunnable(WorkTimer workTimer, gI3 gI32) {
        this.a = workTimer;
        this.b = gI32;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.a.d;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    gI3 gI32;
                    Object object2;
                    block4: {
                        try {
                            object2 = this.a;
                            object2 = ((WorkTimer)object2).b;
                            gI32 = this.b;
                            object2 = ((HashMap)object2).remove(gI32);
                            object2 = (WorkTimer$WorkTimerRunnable)object2;
                            if (object2 == null) break block4;
                            object2 = this.a;
                            object2 = ((WorkTimer)object2).c;
                            gI32 = this.b;
                            object2 = ((HashMap)object2).remove(gI32);
                            if ((object2 = (WorkTimer$a)object2) != null) {
                                gI32 = this.b;
                                object2.a(gI32);
                            }
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object2 = qx1.a();
                    gI32 = this.b;
                    Objects.toString(gI32);
                    object2.getClass();
                }
                return;
            }
            throw throwable2;
        }
    }
}


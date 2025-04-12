/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.a;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;

public final class TaskRunner$runnable$1
implements Runnable {
    public final /* synthetic */ c a;

    public TaskRunner$runnable$1(c c2) {
        this.a = c2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Throwable throwable32;
        long l2;
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        ri3_1 ri3_12;
        Object object4;
        while (true) {
            object4 = this.a;
            // MONITORENTER : object4
            ri3_12 = ((c)object4).c();
            // MONITOREXIT : object4
            if (ri3_12 == null) {
                return;
            }
            object4 = ri3_12.c;
            Intrinsics.checkNotNull(object4);
            object3 = this.a;
            object2 = c.i;
            object = Level.FINE;
            bl2 = ((Logger)object2).isLoggable((Level)object);
            if (bl2) {
                object = ((b)object4).a.a;
                l2 = object.nanoTime();
                String string2 = "starting";
                okhttp3.internal.concurrent.a.a(ri3_12, (b)object4, string2);
            } else {
                l2 = -1;
            }
            c.a((c)object3, ri3_12);
            object3 = Unit.a;
            if (!bl2) continue;
            long l3 = ((b)object4).a.a.nanoTime() - l2;
            object3 = okhttp3.internal.concurrent.a.b(l3);
            object2 = "finished run in ";
            object3 = ((String)object2).concat((String)object3);
            okhttp3.internal.concurrent.a.a(ri3_12, (b)object4, (String)object3);
        }
        catch (Throwable throwable2) {
            try {
                object3 = ((c)object3).a;
                object3.execute(this);
                throw throwable2;
            }
            catch (Throwable throwable32) {}
        }
        if (!bl2) throw throwable32;
        long l4 = ((b)object4).a.a.nanoTime() - l2;
        object2 = okhttp3.internal.concurrent.a.b(l4);
        object = "failed a run in ";
        object2 = ((String)object).concat((String)object2);
        okhttp3.internal.concurrent.a.a(ri3_12, (b)object4, (String)object2);
        throw throwable32;
    }
}


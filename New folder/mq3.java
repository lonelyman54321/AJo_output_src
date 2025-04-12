/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class mq3
implements Executor {
    public final Executor a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;

    public mq3(Executor object) {
        Intrinsics.checkNotNullParameter(object, "executor");
        this.a = object;
        object = new ArrayDeque();
        this.b = object;
        this.d = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = this.b;
                        Object object3 = object2 = ((ArrayDeque)object2).poll();
                        this.c = object3 = (Runnable)object2;
                        if (object2 == null) break block3;
                        object2 = this.a;
                        object2.execute((Runnable)object3);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void execute(Runnable object) {
        Intrinsics.checkNotNullParameter(object, "command");
        Object object2 = this.d;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque arrayDeque = this.b;
                        lq3_0 lq3_02 = new lq3_0((Runnable)object, this);
                        arrayDeque.offer(lq3_02);
                        object = this.c;
                        if (object != null) break block3;
                        this.a();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

